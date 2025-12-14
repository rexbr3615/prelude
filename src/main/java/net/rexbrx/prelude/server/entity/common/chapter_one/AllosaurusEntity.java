package net.rexbrx.prelude.server.entity.common.chapter_one;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.rexbrx.prelude.server.items.PreludeItems;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.util.GeckoLibUtil;

import javax.annotation.Nullable;

public class AllosaurusEntity extends PathfinderMob implements GeoEntity
{
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public AllosaurusEntity(EntityType<? extends PathfinderMob> entityEntityType, Level level) {
        super(entityEntityType, level);
        xpReward = 5;
        setNoAi(false);
        setPersistenceRequired();
    }


    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new RandomStrollGoal(this, 1));
        this.goalSelector.addGoal(1, new TemptGoal(this, (double)1.25F, Ingredient.of(new ItemLike[]{PreludeItems.FLARE.get()}), false));
        this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(3, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(5, (new HurtByTargetGoal(this)).setAlertOthers());

        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.867, true) {
            protected double getAttackReachSqr(LivingEntity entity) {
                return (double) (2.0 + entity.getBbWidth() * entity.getBbWidth());
            }
        });


    }


    @Override
    public void baseTick() {
        super.baseTick();
        this.refreshDimensions();
    }

    @Override
    public void aiStep() {
        super.aiStep();
        this.updateSwingTime();
    }

    public static void init() {}

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MAX_HEALTH, 86.0f);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 18.0f);
        builder = builder.add(Attributes.ATTACK_SPEED, 2.0f);
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.167f);
        builder = builder.add(Attributes.ARMOR, 1.5f);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16.0f);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 2.5f);
        return builder;
    }


    //@Override
    //public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
    //    controllers.add(new AnimationController<>(this, "Walk/Idle",10, state -> {
    //        if (state.isMoving())
    //            return state.setAndContinue(RawAnimation.begin().then("walk2", Animation.LoopType.LOOP));
//
     //        return state.setAndContinue(RawAnimation.begin().then("idle2", Animation.LoopType.LOOP));
    //    }));
//
    //     controllers.add(new AnimationController<>(this, "attackController", state -> PlayState.STOP)
    //            .triggerableAnim("attack", RawAnimation.begin().then("attack", Animation.LoopType.PLAY_ONCE)));
//

    //}


    @Override
    protected void tickDeath() {
        ++this.deathTime;
        if (this.deathTime == 20) {
            this.remove(AllosaurusEntity.RemovalReason.KILLED);
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


    public static final EntityDataAccessor<String> ANIMATION = SynchedEntityData.defineId(AllosaurusEntity.class, EntityDataSerializers.STRING);
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
        data.add(new AnimationController<>(this, "movement", 4, this::movementPredicate));
        data.add(new AnimationController<>(this, "procedure", 4, this::procedurePredicate));
    }
    private PlayState movementPredicate(AnimationState event) {
        if (this.animationprocedure.equals("empty")) {
            if ((event.isMoving() || !(event.getLimbSwingAmount() > -0.15F && event.getLimbSwingAmount() < 0.15F)) && this.onGround() && !this.isSprinting()) {
                return event.setAndContinue(RawAnimation.begin().thenLoop("walk2"));
            }
            if (this.isSprinting()) {
                return event.setAndContinue(RawAnimation.begin().thenLoop("running"));
            }
            //if (!this.onGround()) {
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


}
