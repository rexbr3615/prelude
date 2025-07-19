package net.rexbrx.prelude.server.blocks.common;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.storage.loot.LootParams;

import java.util.Collections;
import java.util.List;
//import net.minecraft.world.level.levelgen.RandomSource;

public class PrototaxitesBlock extends Block {
    public static final EnumProperty<GrowingPart> PART = EnumProperty.create("part", GrowingPart.class);

    public PrototaxitesBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(PART, GrowingPart.BASE));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(PART, GrowingPart.BASE);
    }

    //@Override
    //public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
    //    if (canGrow(level, pos, state)) {
    //        BlockPos above = pos.above();
    //        BlockState aboveState = level.getBlockState(above);
    //        if (aboveState.isAir()) {
    //            int height = getStackHeight(level, pos);
    //            if (height < 4) {
    //                level.setBlock(above, this.defaultBlockState().setValue(PART, getPartForHeight(height + 1)), 3);
    //            }
    //        }
    //    }
    //}

    private boolean canGrow(Level level, BlockPos pos, BlockState state) {
        return level.getBlockState(pos.below()).is(this); // pode crescer se o bloco abaixo for igual
    }

    private int getStackHeight(Level level, BlockPos pos) {
        int height = 1;
        BlockPos current = pos;
        while (level.getBlockState(current.below()).getBlock() == this) {
            height++;
            current = current.below();
        }
        return height;
    }

    private GrowingPart getPartForHeight(int height) {
        return switch (height) {
            case 1 -> GrowingPart.BASE;
            case 2 -> GrowingPart.MIDDLE;
            case 3 -> GrowingPart.TOPMID;
            case 4 -> GrowingPart.TOP;
            default -> GrowingPart.MIDDLE;
        };
    }

    private GrowingPart getPartForIndex(int index, int max) {
        if (index == 0) return GrowingPart.BASE;
        else if (index == max - 1) return GrowingPart.TOP;
        else if (index == max - 2) return GrowingPart.TOPMID;
        else return GrowingPart.MIDDLE;
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        updatePartStates(level, pos);
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean moving) {
        updatePartStates(level, pos);
    }

    private void updatePartStates(Level level, BlockPos pos) {
        int height = 0;
        BlockPos base = pos;
        while (level.getBlockState(base.below()).getBlock() == this) {
            base = base.below();
        }

        int maxHeight = 0;
        BlockPos target = base;
        while (level.getBlockState(target.above(maxHeight)).getBlock() == this) {
            maxHeight++;
        }

        for (int i = 0; i < maxHeight; i++) {
            BlockPos posAt = base.above(i);
            BlockState state = level.getBlockState(posAt);
            if (state.getBlock() != this) continue;
            GrowingPart part = getPartForIndex(i, maxHeight);
            level.setBlock(posAt, state.setValue(PART, part), 3);
        }
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return state;
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(PART);
    }

    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }

}
