package net.rexbrx.prelude.server.items.common;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

// ItemDNA.java (apenas o método use e tooltip)


public class ItemDNA extends Item {

    public ItemDNA(Properties properties) { super(properties); }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.literal("DNA Quality: ## ERROR ##"));
        tooltip.add(Component.literal("> Prelude Corporation DNA Code V3.25"));
        super.appendHoverText(stack, context, tooltip, flag);
    }
}


