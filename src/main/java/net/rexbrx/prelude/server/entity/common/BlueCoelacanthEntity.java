package net.rexbrx.prelude.server.entity.common;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.Difficulty;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;
import net.neoforged.neoforge.common.NeoForgeMod;
import net.rexbrx.prelude.server.entity.EntityInit;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.util.GeckoLibUtil;


public class BlueCoelacanthEntity extends PathfinderMob implements GeoEntity
{
    public static final EntityDataAccessor<Boolean> SHOOT = SynchedEntityData.defineId(BlueCoelacanthEntity.class, EntityDataSerializers.BOOLEAN);
    public static final EntityDataAccessor<String> ANIMATION = SynchedEntityData.defineId(BlueCoelacanthEntity.class, EntityDataSerializers.STRING);
    public static final EntityDataAccessor<String> TEXTURE = SynchedEntityData.defineId(BlueCoelacanthEntity.class, EntityDataSerializers.STRING);
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    private boolean swinging;
    private boolean lastloop;
    private long lastSwing;
    public String animationprocedure = "empty";

    public BlueCoelacanthEntity(EntityType<? extends PathfinderMob> entityEntityType, Level level) {
        super(entityEntityType, level);
        xpReward = 5;
        setNoAi(false);
        setPersistenceRequired();
        this.setPathfindingMalus(BlockPathTypes.WATER, 0);
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
    protected void tickDeath() {
        ++this.deathTime;
        if (this.deathTime == 20) {
            this.remove(BlueCoelacanthEntity.RemovalReason.KILLED);
        }
    }

    public String getSyncedAnimation() {
        return this.entityData.get(ANIMATION);
    }

    public void setAnimation(String animation) {
        this.entityData.set(ANIMATION, animation);
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

}
