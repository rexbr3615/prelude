package net.rexbrx.prelude.server.entity.common.chapter_one;

import net.minecraft.core.BlockPos;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.RandomSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.util.GeckoLibUtil;

import javax.annotation.Nullable;
import java.util.EnumSet;

public class ArgentavisEntity extends PathfinderMob implements GeoEntity {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public ArgentavisEntity(EntityType<? extends PathfinderMob> entityEntityType, Level level) {
        super(entityEntityType, level);
        xpReward = 5;
        setNoAi(false);
        setPersistenceRequired();
        this.moveControl = new FlyingMoveControl(this, 10, false);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new Goal() {
            {
                this.setFlags(EnumSet.of(Goal.Flag.MOVE));
            }

            public boolean canUse() {
                if (ArgentavisEntity.this.getTarget() != null && !ArgentavisEntity.this.getMoveControl().hasWanted()) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public boolean canContinueToUse() {
                return ArgentavisEntity.this.getMoveControl().hasWanted() && ArgentavisEntity.this.getTarget() != null && ArgentavisEntity.this.getTarget().isAlive();
            }

            @Override
            public void start() {
                LivingEntity livingentity = ArgentavisEntity.this.getTarget();
                Vec3 vec3d = livingentity.getEyePosition(1);
                ArgentavisEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1);
            }

            @Override
            public void tick() {
                LivingEntity livingentity = ArgentavisEntity.this.getTarget();
                if (ArgentavisEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
                    ArgentavisEntity.this.doHurtTarget(livingentity);
                } else {
                    double d0 = ArgentavisEntity.this.distanceToSqr(livingentity);
                    if (d0 < 16) {
                        Vec3 vec3d = livingentity.getEyePosition(1);
                        ArgentavisEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1);
                    }
                }
            }
        });
        this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1, 20) {
            @Override
            protected Vec3 getPosition() {
                RandomSource random = ArgentavisEntity.this.getRandom();
                double dir_x = ArgentavisEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
                double dir_y = ArgentavisEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
                double dir_z = ArgentavisEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
                return new Vec3(dir_x, dir_y, dir_z);
            }
        });
        this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.2, false) {
            protected double getAttackReachSqr(LivingEntity entity) {
                return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
            }
        });
        this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(5, new HurtByTargetGoal(this).setAlertOthers());
    }

    @Override
    public boolean causeFallDamage(float l, float d, DamageSource source) {
        return false;
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        if (source.is(DamageTypes.FALL))
            return false;
        return super.hurt(source, amount);
    }

    @Override
    public void baseTick() {
        super.baseTick();
        this.refreshDimensions();
    }

    @Override
    protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
    }

    @Override
    public void setNoGravity(boolean ignored) {
        super.setNoGravity(true);
    }

    @Override
    public void aiStep() {
        super.aiStep();
        this.updateSwingTime();
        this.setNoGravity(true);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.122);
        builder = builder.add(Attributes.MAX_HEALTH, 23);
        builder = builder.add(Attributes.ARMOR, 1.5);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16);
        builder = builder.add(Attributes.FLYING_SPEED, 0.23);
        return builder;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "Walk/Idle",10, state -> {
            if (!ArgentavisEntity.this.onGround()) {
                return state.setAndContinue(RawAnimation.begin().then("fly", Animation.LoopType.LOOP));
            }
            if (!ArgentavisEntity.this.onGround() && this.isFallFlying()) {
                return state.setAndContinue(RawAnimation.begin().then("fly_air", Animation.LoopType.LOOP));
            }
            if (state.isMoving())
                return state.setAndContinue(ArgentavisEntity.this.isSprinting() ? RawAnimation.begin().then("walk", Animation.LoopType.LOOP) : RawAnimation.begin().then("walk", Animation.LoopType.LOOP));

            return state.setAndContinue(RawAnimation.begin().then("idle", Animation.LoopType.LOOP));
        }));

        controllers.add(new AnimationController<>(this, "attackController", state -> PlayState.STOP)
                .triggerableAnim("attack", RawAnimation.begin().then("attack", Animation.LoopType.PLAY_ONCE)));

    }

    @Override
    protected void tickDeath() {
        ++this.deathTime;
        if (this.deathTime == 20) {
            this.remove(ArgentavisEntity.RemovalReason.KILLED);
        }
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor level, DifficultyInstance difficulty, MobSpawnType spawnType, @Nullable SpawnGroupData spawnGroupData) {
        return super.finalizeSpawn(level, difficulty, spawnType, spawnGroupData);
    }

    @Override
    public EntityDimensions getDefaultDimensions(Pose pose) {
        return super.getDefaultDimensions(pose).scale(1f, 1f);
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}


