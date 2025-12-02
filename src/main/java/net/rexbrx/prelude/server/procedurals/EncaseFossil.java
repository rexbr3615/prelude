package net.rexbrx.prelude.server.procedurals;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.rexbrx.prelude.server.items.PreludeItems;

@EventBusSubscriber
public class EncaseFossil {
    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock ev) {
        Player player = ev.getEntity();
        Level world = ev.getLevel();
        BlockPos pos = ev.getPos();
        ItemStack held = ev.getItemStack();

        /*
        if (!world.isClientSide() && held.getItem() == PreludeItems.PLASTER.get()) {
            BlockState clicked = world.getBlockState(pos);
            // Verifica se o bloco clicado é de pedra
            if (clicked.is(PreludeBlocks.FOSSIL_ORE.get())) {
                // Troca para carvão em bloco
                world.setBlock(pos, PreludeBlocks.ENCHASED_FOSSIL.get().defaultBlockState(), 3);
                // Consome o item se não estiver em criativo
                if (!player.isCreative()) {
                    held.shrink(1);
                }
                ev.setCancellationResult(InteractionResult.SUCCESS);
                ev.setCanceled(true);
            }
            // Verifica se o bloco clicado é de ardosia
            if (clicked.is(PreludeBlocks.DEEP_FOSSIL_ORE.get())) {
                // Troca para carvão em bloco
                world.setBlock(pos, PreludeBlocks.ENCHASED_FOSSIL.get().defaultBlockState(), 3);
                // Consome o item se não estiver em criativo
                if (!player.isCreative()) {
                    held.shrink(1);
                }
                ev.setCancellationResult(InteractionResult.SUCCESS);
                ev.setCanceled(true);
            }
        }
        */
    }
}

