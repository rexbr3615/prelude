package net.rexbrx.prelude.server.procedurals;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;
import net.rexbrx.prelude.server.items.PreludeItems;

public class DevonianRandom {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null)
            return;
        if (world instanceof Level _level && !_level.isClientSide()) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ForgeRegistries.ITEMS.tags()
                    .getTag(ItemTags.create(new ResourceLocation("prelude:devonian_dna"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))));
            entityToSpawn.setPickUpDelay(2);
            _level.addFreshEntity(entityToSpawn);
        }
        if (entity instanceof Player _player) {
            ItemStack _stktoremove = new ItemStack(PreludeItems.DEVONIAN_DISK.get());
            _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
        }
    }
}
