package net.rexbrx.prelude.server.items.common;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public class GasBottle extends Item {
    public GasBottle(Properties properties) {
        super(properties);
    }

    public ItemStack finishUsingItem(ItemStack stack, Level level, Player player) {
        if (!player.isCreative()) {
            stack.shrink(1);
        }

        if (!level.isClientSide) {
            // Aqui você pode colocar efeitos personalizados se quiser
            // Ex: player.heal(2.0F); // cura 1 coração
        }

        if (!player.isCreative()) {
            if (stack.isEmpty()) {
                return new ItemStack(Items.GLASS_BOTTLE);
            } else {
                player.getInventory().add(new ItemStack(Items.GLASS_BOTTLE));
            }
        }

        return stack;
    }

    public int getUseDuration(ItemStack stack) {
        return 32; // duração pra beber
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK; // animação de beber
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        return ItemUtils.startUsingInstantly(level, player, hand);
    }
}
