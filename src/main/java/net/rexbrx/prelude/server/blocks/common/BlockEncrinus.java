package net.rexbrx.prelude.server.blocks.common;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.GrowingPlantBodyBlock;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.LiquidBlockContainer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.phys.shapes.Shapes;
import net.rexbrx.prelude.server.blocks.PreludeBlocks;

import java.util.Collections;
import java.util.List;

public class BlockEncrinus extends GrowingPlantBodyBlock implements LiquidBlockContainer {
    public BlockEncrinus(Properties p_i48782_1_) {
        super(p_i48782_1_, Direction.UP, Shapes.block(), true);
    }

    protected GrowingPlantHeadBlock getHeadBlock() {
        return PreludeBlocks.ENCRINUS.get();
    }

    public FluidState getFluidState(BlockState blockState) {
        return Fluids.WATER.getSource(false);
    }

    public boolean canPlaceLiquid(BlockGetter blockReader, BlockPos blockPos, BlockState blockState, Fluid fluid) {
        return false;
    }

    public boolean placeLiquid(LevelAccessor world, BlockPos blockPos, BlockState blockState, FluidState fluidState) {
        return false;
    }

    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }

}
