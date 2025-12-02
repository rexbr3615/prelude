package net.rexbrx.prelude.server.procedurals;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.rexbrx.prelude.server.items.PreludeItems;

public class PlantRandom {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {

        if (world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
                    new ItemStack((BuiltInRegistries.ITEM.getRandomElementOf(ItemTags.create(ResourceLocation.parse("prelude:plant_dna")), RandomSource.create()).orElseGet(() -> BuiltInRegistries.ITEM.wrapAsHolder(Items.AIR)).value())));
            entityToSpawn.setPickUpDelay(0);
            _level.addFreshEntity(entityToSpawn);
        }

        // ---------------------
        // REMOVER O DISCO DO JOGADOR
        // ---------------------
        if (entity instanceof Player player) {
            ItemStack toRemove = new ItemStack(PreludeItems.PLANT_DISK.get());

            player.getInventory().clearOrCountMatchingItems(
                    stack -> stack.getItem() == toRemove.getItem(),
                    1,
                    player.inventoryMenu.getCraftSlots()
            );
        }
    }
}
