package net.rexbrx.prelude.server.items.common;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class TokenItem extends Item {
    public TokenItem(Properties pProperties) {
        super(pProperties);
    }

    public void appendHoverText(ItemStack stack, @Nullable Level level,
                                List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.literal("This is a Creative Token from Prelude Mod ;)"));
        super.appendHoverText(stack, (TooltipContext) level, tooltip, flag);
    }
}
