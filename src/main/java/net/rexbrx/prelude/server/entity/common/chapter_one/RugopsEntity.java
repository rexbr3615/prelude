package net.rexbrx.prelude.server.entity.common.chapter_one;

import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.DifficultyInstance;
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
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;

import javax.annotation.Nullable;

public class RugopsEntity extends PathfinderMob implements GeoEntity 
{
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);


    public RugopsEntity(EntityType<? extends PathfinderMob> entityEntityType, Level level) {
        super(entityEntityType, level);
        xpReward = 5;
        setNoAi(false);
        setPersistenceRequired();
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new RandomStrollGoal(this, 1));
        this.goalSelector.addGoal(2, new TemptGoal(this, (double)1.25F, Ingredient.of(new ItemLike[]{PreludeItems.FLARE.get()}), false));
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(4, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(6, (new HurtByTargetGoal(this)).setAlertOthers());

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
        builder = builder.add(Attributes.MAX_HEALTH, 45.0f);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 5.0f);
        builder = builder.add(Attributes.ATTACK_SPEED, 2.0f);
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.168f);
        builder = builder.add(Attributes.ARMOR, 1.5f);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16.0f);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 2.5f);
        return builder;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "Walk/Idle", state -> {
            if (state.isMoving())
                return state.setAndContinue(RawAnimation.begin().then("walk2", Animation.LoopType.LOOP));

            return state.setAndContinue(RawAnimation.begin().then("idle2", Animation.LoopType.LOOP));
        }));

        controllers.add(new AnimationController<>(this, "attackController", state -> software.bernie.geckolib.animation.PlayState.STOP)
                .triggerableAnim("attack", RawAnimation.begin().then("attack", Animation.LoopType.PLAY_ONCE)));


    }

    @Override
    protected void tickDeath() {
        ++this.deathTime;
        if (this.deathTime == 20) {
            this.remove(RugopsEntity.RemovalReason.KILLED);
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
