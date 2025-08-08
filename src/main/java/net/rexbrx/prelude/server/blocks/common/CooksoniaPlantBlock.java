package net.rexbrx.prelude.server.blocks.common;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.rexbrx.prelude.server.items.PreludeItems;

public class CooksoniaPlantBlock extends CropBlock {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;

    public CooksoniaPlantBlock(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxAge() {
        return 6;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return PreludeItems.COOKSONIA_SPORES.get();
    }

}
