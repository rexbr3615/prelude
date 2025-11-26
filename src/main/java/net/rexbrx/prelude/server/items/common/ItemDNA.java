package net.rexbrx.prelude.server.items.common;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ItemDNA extends Item
{

    private static final String KEY_DNA_VALUE = "dna_value";

    public ItemDNA(Properties properties) {
        super(properties);
    }

    // Quando o jogador usa o item (clique direito)
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        if (!level.isClientSide) {
            CompoundTag tag = (CompoundTag) stack.getTags();

            if (!tag.contains(KEY_DNA_VALUE)) {
                int value = ThreadLocalRandom.current().nextInt(0, 100);
                tag.putInt(KEY_DNA_VALUE, value);

                level.playSound(null, player.blockPosition(), SoundEvents.EXPERIENCE_ORB_PICKUP,
                        SoundSource.PLAYERS, 1.0F, 1.0F);
            }

        }

        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide);
    }

    // Mostra a informação na tooltip
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level,
                                List<Component> tooltip, TooltipFlag flag) {
        CompoundTag tag = (CompoundTag) stack.getTags();

        if (tag != null && tag.contains(KEY_DNA_VALUE)) {
            tooltip.add(Component.literal("DNA purity: " + tag.getInt(KEY_DNA_VALUE)));
        } else {
            tooltip.add(Component.literal("DNA not activated"));
        }

        super.appendHoverText(stack, level, tooltip, flag);
    }

}
