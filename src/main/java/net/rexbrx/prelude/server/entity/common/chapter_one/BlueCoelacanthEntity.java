package net.rexbrx.prelude.server.entity.common.chapter_one;


import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;

import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.world.level.ServerLevelAccessor;
import net.neoforged.neoforge.common.NeoForgeMod;
import net.neoforged.neoforge.fluids.FluidType;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.util.GeckoLibUtil;

import javax.annotation.Nullable;


public class BlueCoelacanthEntity extends PathfinderMob implements GeoEntity
{
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public BlueCoelacanthEntity(EntityType<? extends PathfinderMob> entityEntityType, Level level) {
        super(entityEntityType, level);
        xpReward = 5;
        setNoAi(false);
        setPersistenceRequired();
        //this.setPathfindingMalus(BlockPathTypes.WATER, 0);
        this.navigation = new WaterBoundPathNavigation(this, level);
        this.moveControl = new MoveControl(this) {
            @Override
            public void tick() {
                if (BlueCoelacanthEntity.this.isInWater())
                    BlueCoelacanthEntity.this.setDeltaMovement(BlueCoelacanthEntity.this.getDeltaMovement().add(0, 0.005, 0));
                if (this.operation == MoveControl.Operation.MOVE_TO && !BlueCoelacanthEntity.this.getNavigation().isDone()) {
                    double dx = this.wantedX - BlueCoelacanthEntity.this.getX();
                    double dy = this.wantedY - BlueCoelacanthEntity.this.getY();
                    double dz = this.wantedZ - BlueCoelacanthEntity.this.getZ();
                    float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
                    float f1 = (float) (this.speedModifier * BlueCoelacanthEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
                    BlueCoelacanthEntity.this.setYRot(this.rotlerp(BlueCoelacanthEntity.this.getYRot(), f, 10));
                    BlueCoelacanthEntity.this.yBodyRot = BlueCoelacanthEntity.this.getYRot();
                    BlueCoelacanthEntity.this.yHeadRot = BlueCoelacanthEntity.this.getYRot();
                    if (BlueCoelacanthEntity.this.isInWater()) {
                        BlueCoelacanthEntity.this.setSpeed((float) BlueCoelacanthEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
                        float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
                        f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
                        BlueCoelacanthEntity.this.setXRot(this.rotlerp(BlueCoelacanthEntity.this.getXRot(), f2, 5));
                        float f3 = Mth.cos(BlueCoelacanthEntity.this.getXRot() * (float) (Math.PI / 180.0));
                        BlueCoelacanthEntity.this.setZza(f3 * f1);
                        BlueCoelacanthEntity.this.setYya((float) (f1 * dy));
                    } else {
                        BlueCoelacanthEntity.this.setSpeed(f1 * 0.05F);
                    }
                } else {
                    BlueCoelacanthEntity.this.setSpeed(0);
                    BlueCoelacanthEntity.this.setYya(0);
                    BlueCoelacanthEntity.this.setZza(0);
                }
            }
        };
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new RandomSwimmingGoal(this, 1, 40));
        this.goalSelector.addGoal(2, new PanicGoal(this, 2.2));
    }


    @Override
    public boolean hurt(DamageSource source, float amount) {
        if (source.is(DamageTypes.DROWN))
            return false;
        return super.hurt(source, amount);
    }


    @Override
    public void baseTick() {
        super.baseTick();
        this.refreshDimensions();
    }

    @Override
    public boolean isPushedByFluid() {
        return false;
    }

    @Override
    public void aiStep() {
        super.aiStep();
        this.updateSwingTime();
    }

    public static void init() {}

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.8);
        builder = builder.add(Attributes.MAX_HEALTH, 10);
        builder = builder.add(Attributes.ARMOR, 0);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16);
        builder = builder.add(NeoForgeMod.SWIM_SPEED, 0.8);
        return builder;
    }

    @Override
    public boolean canDrownInFluidType(FluidType type) {
        return false; // Pode se afogar em outros fluidos, mas não em água
    }


    @Override
    protected void tickDeath() {
        ++this.deathTime;
        if (this.deathTime == 20) {
            this.remove(BlueCoelacanthEntity.RemovalReason.KILLED);
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

    @Override
    public SoundEvent getHurtSound(DamageSource ds) {
        return BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.hurt"));
    }

    @Override
    public SoundEvent getDeathSound() {
        return BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.death"));
    }


    public static final EntityDataAccessor<String> ANIMATION = SynchedEntityData.defineId(BlueCoelacanthEntity.class, EntityDataSerializers.STRING);
    private boolean swinging;
    private boolean lastloop;
    private long lastSwing;
    public String animationprocedure = "empty";
    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
        builder.define(ANIMATION, "undefined");
    }
    public String getSyncedAnimation() {
        return this.entityData.get(ANIMATION);
    }
    public void setAnimation(String animation) {
        this.entityData.set(ANIMATION, animation);
    }
    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar data) {
        data.add(new AnimationController<>(this, "movement", 11, this::movementPredicate));
        data.add(new AnimationController<>(this, "attacking", 11, this::attackingPredicate));
        data.add(new AnimationController<>(this, "procedure", 11, this::procedurePredicate));
    }
    private PlayState movementPredicate(AnimationState event) {
        if (this.animationprocedure.equals("empty")) {
            if ((event.isMoving() || !(event.getLimbSwingAmount() > -0.15F && event.getLimbSwingAmount() < 0.15F))) {
                return event.setAndContinue(RawAnimation.begin().thenLoop("swim"));
            }
            //if (this.isSprinting()) {
            //    return event.setAndContinue(RawAnimation.begin().thenLoop("running"));
            //}
            //if (this.isInWaterOrBubble()) {
            //    return event.setAndContinue(RawAnimation.begin().thenLoop("idle"));
            //}
            //if (this.isInWaterOrBubble() && !event.isMoving()) {
            //    return event.setAndContinue(RawAnimation.begin().thenLoop("idle"));
            //}
            //if (this.isInWaterOrBubble() && event.isMoving()) {
            //    return event.setAndContinue(RawAnimation.begin().thenLoop("swimmmmm"));
            //}
            //if (!this.onGround() && !event.isMoving()) {
            //    return event.setAndContinue(RawAnimation.begin().thenLoop("air"));
            //}
            //if (!this.onGround() && event.isMoving()) {
            //    return event.setAndContinue(RawAnimation.begin().thenLoop("fly"));
            //}
            return event.setAndContinue(RawAnimation.begin().thenLoop("idle"));
        }
        return PlayState.STOP;
    }
    String prevAnim = "empty";
    private PlayState procedurePredicate(AnimationState event) {
        if (!animationprocedure.equals("empty") && event.getController().getAnimationState() == AnimationController.State.STOPPED || (!this.animationprocedure.equals(prevAnim) && !this.animationprocedure.equals("empty"))) {
            if (!this.animationprocedure.equals(prevAnim))
                event.getController().forceAnimationReset();
            event.getController().setAnimation(RawAnimation.begin().thenPlay(this.animationprocedure));
            if (event.getController().getAnimationState() == AnimationController.State.STOPPED) {
                this.animationprocedure = "empty";
                event.getController().forceAnimationReset();
            }
        } else if (animationprocedure.equals("empty")) {
            prevAnim = "empty";
            return PlayState.STOP;
        }
        prevAnim = this.animationprocedure;
        return PlayState.CONTINUE;
    }
    private PlayState attackingPredicate(AnimationState event) {
        double d1 = this.getX() - this.xOld;
        double d0 = this.getZ() - this.zOld;
        float velocity = (float) Math.sqrt(d1 * d1 + d0 * d0);
        if (getAttackAnim(event.getPartialTick()) > 0f && !this.swinging) {
            this.swinging = true;
            this.lastSwing = level().getGameTime();
        }
        if (this.swinging && this.lastSwing + 20L <= level().getGameTime()) {
            this.swinging = false;
        }
        if (this.swinging && event.getController().getAnimationState() == AnimationController.State.STOPPED) {
            event.getController().forceAnimationReset();
            return event.setAndContinue(RawAnimation.begin().thenPlay("attack"));
        }
        return PlayState.CONTINUE;
    }



}
