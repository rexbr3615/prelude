package net.rexbrx.prelude.server.items.common;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.rexbrx.prelude.server.procedurals.PermianRandom;
import net.rexbrx.prelude.server.procedurals.TriassicRandom;

import java.util.List;

public class PermianDisk extends Item {
    public PermianDisk(Properties pProperties) {
        super(pProperties);
    }


    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, (TooltipContext) world, list, flag);
        list.add(Component.literal("Click Me!!"));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        ItemStack itemstack = ar.getObject();
        double x = entity.getX();
        double y = entity.getY();
        double z = entity.getZ();

        PermianRandom.execute(world, x, y, z, entity);
        return ar;
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        super.useOn(context);
        PermianRandom.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
                context.getClickedPos().getZ(), context.getPlayer());
        return InteractionResult.SUCCESS;
    }
}
