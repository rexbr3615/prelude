package net.rexbrx.prelude.server.procedurals;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rexbrx.prelude.server.items.PreludeItems;

@Mod.EventBusSubscriber(modid = "prelude", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PlantCells {

    @SubscribeEvent
    public static void PlantCells(PlayerInteractEvent.RightClickBlock event) {
        Level world = event.getLevel();
        Player player = event.getEntity();
        ItemStack heldItem = event.getItemStack();

        // Verifica se está no lado do servidor
        if (!world.isClientSide()) {
            // Verifica se o jogador está segurando o item específico (ex: STICK)
            if (heldItem.getItem() == PreludeItems.SYRINGE.get()) {
                // Substitui o item por outro (ex: DIAMOND)
                player.setItemInHand(event.getHand(), new ItemStack(PreludeItems.PLANT_CELLS.get()));

                // Cancela o uso normal do item (opcional)
                event.setCanceled(true);
            }
        }
    }
}

