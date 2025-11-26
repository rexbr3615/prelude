package net.rexbrx.prelude.server.blocks.common;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.storage.loot.LootParams;

import java.util.Collections;
import java.util.List;

public class PipeBlock extends Block {
    public static final EnumProperty<PipeConnection> UP = EnumProperty.create("up", PipeConnection.class);
    public static final EnumProperty<PipeConnection> DOWN = EnumProperty.create("down", PipeConnection.class);
    public static final EnumProperty<PipeConnection> NORTH = EnumProperty.create("north", PipeConnection.class);
    public static final EnumProperty<PipeConnection> SOUTH = EnumProperty.create("south", PipeConnection.class);
    public static final EnumProperty<PipeConnection> EAST = EnumProperty.create("east", PipeConnection.class);
    public static final EnumProperty<PipeConnection> WEST = EnumProperty.create("west", PipeConnection.class);

    public PipeBlock(Properties props) {
        super(props);
        this.registerDefaultState(this.defaultBlockState()
                .setValue(UP, PipeConnection.NONE)
                .setValue(DOWN, PipeConnection.NONE)
                .setValue(NORTH, PipeConnection.NONE)
                .setValue(SOUTH, PipeConnection.NONE)
                .setValue(EAST, PipeConnection.NONE)
                .setValue(WEST, PipeConnection.NONE));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(UP, DOWN, NORTH, SOUTH, EAST, WEST);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();

        return defaultBlockState()
                .setValue(UP, getConnection(level, pos.above()))
                .setValue(DOWN, getConnection(level, pos.below()))
                .setValue(NORTH, getConnection(level, pos.north()))
                .setValue(SOUTH, getConnection(level, pos.south()))
                .setValue(EAST, getConnection(level, pos.east()))
                .setValue(WEST, getConnection(level, pos.west()));
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState,
                                  LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
        PipeConnection connection = getConnection(level, neighborPos);
        return state.setValue(getPropertyFromDirection(direction), connection);
    }

    private PipeConnection getConnection(LevelReader level, BlockPos pos) {
        BlockState neighbor = level.getBlockState(pos);
        return neighbor.getBlock() instanceof PipeBlock ? PipeConnection.CONNECTED : PipeConnection.NONE;
    }

    private EnumProperty<PipeConnection> getPropertyFromDirection(Direction dir) {
        return switch (dir) {
            case UP -> UP;
            case DOWN -> DOWN;
            case NORTH -> NORTH;
            case SOUTH -> SOUTH;
            case EAST -> EAST;
            case WEST -> WEST;
        };
    }

    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }

}

