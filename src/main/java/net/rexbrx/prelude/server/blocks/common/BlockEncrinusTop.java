package net.rexbrx.prelude.server.blocks.common;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.LiquidBlockContainer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.rexbrx.prelude.server.blocks.PreludeBlocks;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BlockEncrinusTop extends GrowingPlantHeadBlock implements LiquidBlockContainer {
    protected static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D);

    public BlockEncrinusTop(Properties p_i48781_1_) {
        super(p_i48781_1_, Direction.UP, SHAPE, true, 0.14D);
    }

    @Override
    protected int getBlocksToGrowWhenBonemealed(RandomSource randomSource) {
        return 0;
    }

    protected boolean canGrowInto(BlockState blockState) {
        return blockState.is(Blocks.WATER);
    }

    protected Block getBodyBlock() {
        return PreludeBlocks.ENCRINUS_STEM.get();
    }

    protected boolean canAttachToBlock(Block p_230333_1_) {
        return p_230333_1_ != Blocks.MAGMA_BLOCK;
    }

    public boolean canPlaceLiquid(BlockGetter p_204510_1_, BlockPos p_204510_2_, BlockState p_204510_3_, Fluid p_204510_4_) {
        return false;
    }

    public boolean placeLiquid(LevelAccessor p_204509_1_, BlockPos p_204509_2_, BlockState p_204509_3_, FluidState p_204509_4_) {
        return false;
    }

    protected int getBlocksToGrowWhenBonemealed(Random p_230332_1_) {
        return 1;
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext p_196258_1_) {
        FluidState fluidstate = p_196258_1_.getLevel().getFluidState(p_196258_1_.getClickedPos());
        return fluidstate.is(FluidTags.WATER) && fluidstate.getAmount() == 8 ? super.getStateForPlacement(p_196258_1_) : null;
    }

    public FluidState getFluidState(BlockState p_204507_1_) {
        return Fluids.WATER.getSource(false);
    }

    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }

}