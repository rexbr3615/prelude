package net.rexbrx.prelude.server.world.meteor;

// MeteorFeature.java

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

import java.util.Random;

public class MeteorFeature extends Feature<NoneFeatureConfiguration> {
    public MeteorFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }
    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel level = context.level();
        RandomSource random = context.random();
        BlockPos pos = context.origin();
        // Generate a simple spherical meteor
        int radius = 3 + random.nextInt(3); // Random size 3-5
        BlockState meteorBlock = Blocks.STONE.defaultBlockState(); // Or your custom block
        for (int x = -radius; x <= radius; x++) {
            for (int y = -radius; y <= radius; y++) {
                for (int z = -radius; z <= radius; z++) {
                    if (x * x + y * y + z * z <= radius * radius) {
                        level.setBlock(pos.offset(x, y, z), meteorBlock, 2);
                    }
                }
            }
        }
        return true;
    }
}