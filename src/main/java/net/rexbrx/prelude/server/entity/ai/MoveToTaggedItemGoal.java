package net.rexbrx.prelude.server.entity.ai;

import net.minecraft.tags.ItemTags;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.pathfinder.Path;

import java.util.EnumSet;
import java.util.List;

public class MoveToTaggedItemGoal extends Goal {

    private final Mob mob;
    private final double speed;
    private final double searchRadius;
    private final TagKey<net.minecraft.world.item.Item> itemTag;
    private ItemEntity targetItem;

    public MoveToTaggedItemGoal(Mob mob, double speed, double searchRadius, ResourceLocation tagLocation) {
        this.mob = mob;
        this.speed = speed;
        this.searchRadius = searchRadius;
        this.itemTag = TagKey.create(BuiltInRegistries.ITEM.key(), tagLocation);
        this.setFlags(EnumSet.of(Flag.MOVE));
    }

    @Override
    public boolean canUse() {
        Level level = mob.level();
        if (level.isClientSide) return false;

        AABB searchBox = mob.getBoundingBox().inflate(searchRadius);
        List<ItemEntity> items = level.getEntitiesOfClass(ItemEntity.class, searchBox, item -> isItemInTag(item.getItem()));

        if (!items.isEmpty()) {
            targetItem = getNearestItem(items);
            return targetItem != null;
        }

        return false;
    }

    @Override
    public boolean canContinueToUse() {
        return targetItem != null && targetItem.isAlive() && !mob.getNavigation().isDone();
    }

    @Override
    public void start() {
        if (targetItem != null) {
            Path path = mob.getNavigation().createPath(targetItem, 0);
            if (path != null) {
                mob.getNavigation().moveTo(path, speed);
            }
        }
    }

    @Override
    public void tick() {
        if (targetItem != null && targetItem.isAlive()) {
            double distanceSq = mob.distanceToSqr(targetItem);
            if (distanceSq < 1.0D) {
                targetItem.discard(); // remove o item do mundo
                targetItem = null;
                mob.getNavigation().stop();
            }
        }
    }

    @Override
    public void stop() {
        targetItem = null;
    }

    private boolean isItemInTag(ItemStack stack) {
        return stack.is(itemTag);
    }

    private ItemEntity getNearestItem(List<ItemEntity> items) {
        return items.stream()
                .min((a, b) -> Double.compare(mob.distanceToSqr(a), mob.distanceToSqr(b)))
                .orElse(null);
    }
}

