package net.rexbrx.prelude.server.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.blocks.common.*;
import net.rexbrx.prelude.server.blocks.common.PipeBlock;
import net.rexbrx.prelude.server.items.PreludeItems;
import net.rexbrx.prelude.server.items.common.ModRotatedPillarBlock;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.state.BlockBehaviour.Properties.ofFullCopy;

public class PreludeBlocks
{
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(prelude.MODID);

    //==================================================================================


    public static final DeferredBlock<Block> ENCHASED_FOSSIL = registerBlock("enchased_fossil",
            () -> new Block(ofFullCopy(Blocks.STONE).sound(SoundType.STONE)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> GRAPHITE_BLOCK = registerBlock("graphite_block",
            () -> new Block(ofFullCopy(Blocks.STONE).sound(SoundType.BASALT)
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> GYPSUM_BLOCK = registerBlock("gypsum_block",
            () -> new Block(ofFullCopy(Blocks.STONE).sound(SoundType.BASALT)
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> PROTOTAXITES_BLOCK = registerBlock("prototaxites_block",
            () -> new PrototaxitesBlock(ofFullCopy(Blocks.SUGAR_CANE).randomTicks()));

    public static final DeferredBlock<Block> FOSSIL_ORE = registerBlock("fossil_ore",
            () -> new Block(ofFullCopy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DEEP_FOSSIL_ORE = registerBlock("deep_fossil_ore",
            () -> new Block(ofFullCopy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops()));


    public static final DeferredBlock<Block> SWARTPUNTIA = registerBlock("swartpuntia",
            () -> new BlockPreludeCustomWaterGrass(
                    ofFullCopy(Blocks.SEAGRASS).noOcclusion()));
    public static final DeferredBlock<Block> STROMATOLITES = registerBlock("stromatolites",
            () -> new BlockPreludeCustomWaterGrass(
                    ofFullCopy(Blocks.SEAGRASS).noOcclusion()));
    public static final DeferredBlock<Block> STROMATOLITES_FULL = registerBlock("stromatolite_block",
            () -> new Block(ofFullCopy(Blocks.STONE).sound(SoundType.STONE)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<GrowingPlantHeadBlock> ENCRINUS = registerBlock("encrinus",
            () -> new BlockEncrinusTop(ofFullCopy(Blocks.KELP)
                    .noCollission()
                    .randomTicks()
                    .instabreak()

                    .sound(SoundType.WET_GRASS)));

    public static final DeferredBlock<GrowingPlantBlock> ENCRINUS_STEM = registerBlock("encrinus_stem",
            () -> new BlockEncrinus(ofFullCopy(Blocks.KELP_PLANT)
                    .noCollission()
                    .randomTicks()
                    .instabreak()

                    .sound(SoundType.WET_GRASS)));

    public static final DeferredBlock<Block> COMMON_FENCE = registerBlock("common_fence",
            () -> new PreludeFence());

    public static final DeferredBlock<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(ofFullCopy(Blocks.STONE).sound(SoundType.NETHERITE_BLOCK)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> ANTENNA_4X4 = registerBlock("antenna1",
            () -> new AntennaBaseBlock());
    public static final DeferredBlock<Block> ANTENNA_3X3 = registerBlock("antenna2",
            () -> new AntennaBaseBlock());
    public static final DeferredBlock<Block> ANTENNA_2X2 = registerBlock("antenna3",
            () -> new AntennaBaseBlock());
    public static final DeferredBlock<Block> ANTENNA_1X1 = registerBlock("antenna4",
            () -> new AntennaBaseBlock());
    public static final DeferredBlock<Block> ANTENNA_PART = registerBlock("antenna_part",
            () -> new AntennaBaseBlock());
    public static final DeferredBlock<Block> ANTENNA_BASE = registerBlock("antenna_base",
            () -> new AntennaBaseBlock());

    public static final DeferredBlock<Block> POWER_BOX = registerBlock("power_box",
            () -> new PreludeInWallBlock());
    public static final DeferredBlock<Block> CABLE_BLOCK = registerBlock("cable_block",
            () -> new PreludeInWallBlock());
    public static final DeferredBlock<Block> CABLE_BLOCK_CORNER = registerBlock("cable_block_corner",
            () -> new PreludeInWallBlock());



    public static final DeferredBlock<Block> COOKSONIA_PLANT = registerBlockWithoutBlockItem("cooksonia_plant",
            () -> new CooksoniaPlantBlock(ofFullCopy(Blocks.WHEAT).noOcclusion()));

    public static final DeferredBlock<Block> HIGH_SECURITY_FENCE = registerBlock("high_security_fence",
            () -> new WallBlock(ofFullCopy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> SECURITY_BLOCK = registerBlock("security_block",
            () -> new Block(ofFullCopy(Blocks.STONE).sound(SoundType.STONE)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> MARBLE = registerBlock("marble",
            () -> new Block(ofFullCopy(Blocks.STONE)
                    .strength(1.45f, 4.6f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> MARBLE_BRICKS = registerBlock("marble_bricks",
            () -> new Block(ofFullCopy(Blocks.STONE)
                    .strength(1.45f, 4.6f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> MARBLE_TILES = registerBlock("marble_tiles",
            () -> new Block(ofFullCopy(Blocks.STONE)
                    .strength(1.45f, 4.6f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> MARBLE_FLOOR = registerBlock("marble_floor",
            () -> new Block(ofFullCopy(Blocks.STONE)
                    .strength(1.25f, 4.2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> MARBLE_PILLAR = registerBlock("marble_pillar",
            () -> new ModRotatedPillarBlock(ofFullCopy(Blocks.STONE)
                    .strength(1.25f, 4.2f).requiresCorrectToolForDrops()));


    public static final DeferredBlock<Block> CALAMITES_LOG = registerBlock("calamites_log",
            () -> new ModFlammableRotatedPillarBlock(ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> CALAMITES_WOOD = registerBlock("calamites_wood",
            () -> new ModFlammableRotatedPillarBlock(ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> CALAMITES_PLANKS = registerBlock("calamites_planks",
            () -> new Block(ofFullCopy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            });
    public static final DeferredBlock<Block> CALAMITES_LEAVES = registerBlock("calamites_leaves",
            () -> new LeavesBlock(ofFullCopy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            });
    //public static final DeferredBlock<Block> CALAMITES_STAIRS = registerBlock("calamites_stairs",
    //        () -> new StairBlock(() -> PreludeBlocks.CALAMITES_PLANKS.get().defaultBlockState(),
    //                ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<Block> CALAMITES_SLAB = registerBlock("calamites_slab",
            () -> new SlabBlock(ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<Block> CALAMITES_FENCE = registerBlock("calamites_fence",
            () -> new FenceBlock(ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<Block> CALAMITES_FENCE_GATE = registerBlock("calamites_fence_gate",
            () -> new FenceGateBlock(ofFullCopy(Blocks.OAK_FENCE).sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    //public static final DeferredBlock<Block> CALAMITES_BUTTON = registerBlock("calamites_button",
    //        () -> new ButtonBlock(ofFullCopy(Blocks.OAK_BUTTON)
    //                .noCollission(),
    //                BlockSetType.OAK, 10, true));
    //public static final DeferredBlock<Block> CALAMITES_PRESSURE_PLATE = registerBlock("calamites_pressure_plate",
    //        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, ofFullCopy(Blocks.OAK_PRESSURE_PLATE),
    //                BlockSetType.IRON));

    //public static final DeferredBlock<Block> CALAMITES_DOOR = registerBlock("calamites_door",
    //        () -> new DoorBlock(ofFullCopy(Blocks.OAK_DOOR)
    //                .noOcclusion(), BlockSetType.OAK));
    //public static final DeferredBlock<Block> CALAMITES_TRAPDOOR = registerBlock("calamites_trapdoor",
    //        () -> new TrapDoorBlock(ofFullCopy(Blocks.OAK_TRAPDOOR)
    //                .noOcclusion(), BlockSetType.OAK));

    public static final DeferredBlock<Block> CALAMITES_SAPLING2 = registerBlock("calamites_sapling1",
            () -> new FlowerBlock(MobEffects.LEVITATION, 8,
                    ofFullCopy(Blocks.OAK_SAPLING).noOcclusion().noCollission().instabreak()));



    public static final DeferredBlock<Block> GINKGO_LOG = registerBlock("ginkgo_log",
            () -> new ModFlammableRotatedPillarBlock(ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> GINKGO_WOOD = registerBlock("ginkgo_wood",
            () -> new ModFlammableRotatedPillarBlock(ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> GINKGO_PLANKS = registerBlock("ginkgo_planks",
            () -> new Block(ofFullCopy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            });
    public static final DeferredBlock<Block> GINKGO_LEAVES = registerBlock("ginkgo_leaves",
            () -> new LeavesBlock(ofFullCopy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            });
    public static final DeferredBlock<Block> GINKGO_LEAVES_FRUIT = registerBlock("ginkgo_leaves_fruit",
            () -> new LeavesBlock(ofFullCopy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            });
    //public static final DeferredBlock<Block> GINKGO_STAIRS = registerBlock("ginkgo_stairs",
    //       () -> new StairBlock(() -> PreludeBlocks.CALAMITES_PLANKS.get().defaultBlockState(),
    //                ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<Block> GINKGO_SLAB = registerBlock("ginkgo_slab",
            () -> new SlabBlock(ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<Block> GINKGO_FENCE = registerBlock("ginkgo_fence",
            () -> new FenceBlock(ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<Block> GINKGO_FENCE_GATE = registerBlock("ginkgo_fence_gate",
            () -> new FenceGateBlock(ofFullCopy(Blocks.OAK_FENCE_GATE).sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    //public static final DeferredBlock<Block> GINKGO_BUTTON = registerBlock("ginkgo_button",
    //        () -> new ButtonBlock(ofFullCopy(Blocks.OAK_BUTTON)
    //                .noCollission().noCollission(),
    //                BlockSetType.OAK, 10, true));
    //public static final DeferredBlock<Block> GINKGO_PRESSURE_PLATE = registerBlock("ginkgo_pressure_plate",
    //        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, ofFullCopy(Blocks.OAK_PRESSURE_PLATE),
    //BlockSetType.IRON));
    //public static final DeferredBlock<Block> GINKGO_DOOR = registerBlock("ginkgo_door",
    //        () -> new DoorBlock(ofFullCopy(Blocks.OAK_DOOR)
    //                .noOcclusion(), BlockSetType.OAK));
    //public static final DeferredBlock<Block> GINKGO_TRAPDOOR = registerBlock("ginkgo_trapdoor",
    //        () -> new TrapDoorBlock(ofFullCopy(Blocks.OAK_TRAPDOOR)
    //                .noOcclusion(), BlockSetType.OAK));
    public static final DeferredBlock<Block> GINKGO_SAPLING = registerBlock("ginkgo_sapling",
            () -> new FlowerBlock(MobEffects.LEVITATION, 8,
                    ofFullCopy(Blocks.OAK_SAPLING).noOcclusion().noCollission().instabreak()));




    public static final DeferredBlock<Block> HYPER_CALAMITES_LOG = registerBlock("hyperflora_calamites_log",
            () -> new ModFlammableRotatedPillarBlock(ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> HYPER_CALAMITES_WOOD = registerBlock("hyperflora_calamites_wood",
            () -> new ModFlammableRotatedPillarBlock(ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> HYPER_CALAMITES_LEAVES = registerBlock("hyperflora_calamites_leaves",
            () -> new LeavesBlock(ofFullCopy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            });


    public static final DeferredBlock<Block> HYPER_CALAMITES_SAPLING = registerBlock("hyperflora_calamites_sapling",
            () -> new FlowerBlock(MobEffects.LEVITATION, 8,
                    ofFullCopy(Blocks.OAK_SAPLING).noOcclusion().noCollission().instabreak()));




    public static final DeferredBlock<Block> ARAUCARIA_LOG = registerBlock("araucaria_log",
            () -> new ModFlammableRotatedPillarBlock(ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> ARAUCARIA_WOOD = registerBlock("araucaria_wood",
            () -> new ModFlammableRotatedPillarBlock(ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<Block> ARAUCARIA_LEAVES = registerBlock("araucaria_leaves",
            () -> new LeavesBlock(ofFullCopy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            });





    public static final DeferredBlock<Block> COOKSONIA = registerBlock("cooksonia",
            () -> new PinkPetalsBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().sound(SoundType.PINK_PETALS).pushReaction(PushReaction.DESTROY)));




    public static final DeferredBlock<Block> CONCRETE_BARRIER = registerBlock("concrete_barrier",
            () -> new PreludeCustomRotateBlock(ofFullCopy(Blocks.STONE)
                    .strength(1.89f, 8.6f).requiresCorrectToolForDrops()));


    //public static final DeferredBlock<Block> TEETH_BLOCK = registerBlock("teeth", () -> new TeethBlock());
    //public static final DeferredBlock<Block> BARRIER_BLOCK = registerBlock("barrier", () -> new BarrierBlock());
    //public static final DeferredBlock<Block> EO_GEN = registerBlock("eolicgenerator", () -> new EolicgeneratorBlock());


    public static final DeferredBlock<Block> ADOBE_BLOCK = registerBlock("adobe_block",
            () -> new Block(ofFullCopy(Blocks.STONE).sound(SoundType.STONE)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> ADOBE_BLOCK_BRICKS = registerBlock("adobe_block_bricks",
            () -> new Block(ofFullCopy(Blocks.STONE).sound(SoundType.STONE)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> STEEL_GRATE_BLOCK = registerBlock("steel_grate_block",
            () -> new Block(ofFullCopy(Blocks.STONE).sound(SoundType.CHAIN)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> VOLCANO_BLOCK = registerBlock("volcano_block",
            () -> new Block(ofFullCopy(Blocks.STONE).sound(SoundType.BASALT)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> TUFF_DECORATIVE_BLOCK = registerBlock("tuff_decorative",
            () -> new Block(ofFullCopy(Blocks.TUFF).sound(SoundType.TUFF)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> ASPHALT_BLOCK = registerBlock("asphalt_block",
            () -> new Block(ofFullCopy(Blocks.STONE).sound(SoundType.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> REINFORCED_ASPHALT_BLOCK = registerBlock("reinforced_asphalt_block",
            () -> new Block(ofFullCopy(Blocks.STONE).sound(SoundType.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> ANCIENT_RELIC = registerBlock("ancient_relic",
            () -> new Block(ofFullCopy(Blocks.STONE).sound(SoundType.STONE)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> BITUMEN_STONE = registerBlock("bitumen_stone",
            () -> new Block(ofFullCopy(Blocks.STONE).sound(SoundType.STONE)
                    .strength(3f).requiresCorrectToolForDrops()));



    public static final DeferredBlock<Block> METAL_PILLAR = registerBlock("metal_pillar",
            () -> new PreludeMetalScaffoldingType(ofFullCopy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                    .strength(3f).requiresCorrectToolForDrops().noOcclusion()));



    private static <T extends Block> DeferredBlock<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    public static final DeferredBlock<Block> ANALYZER = registerBlock("analyzer",
            () -> new AnalyzerBlock(ofFullCopy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final DeferredBlock<Block> VAT = registerBlock("vat",
            () -> new VatBlock(ofFullCopy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final DeferredBlock<Block> CRUSHER = registerBlock("crusher",
            () -> new CrusherBlock(ofFullCopy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final DeferredBlock<Block> INCUBATOR = registerBlock("bacteriological_incubator",
            () -> new IncubatorBlock(ofFullCopy(Blocks.IRON_BLOCK).noOcclusion()));




    public static final DeferredBlock<Block> PIPE_ITEM = registerBlock("item_pipe",
            () -> new PipeBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion(), PipeBlock.Transport.ITEMS));

    public static final DeferredBlock<Block> PIPE_FLUID = registerBlock("fluid_pipe",
            () -> new PipeBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion(), PipeBlock.Transport.FLUIDS));

    public static final DeferredBlock<Block> PIPE_POWA = registerBlock("power_pipe",
            () -> new PipeBlock(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion(), PipeBlock.Transport.ENERGY));


    //==================================================================================

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        PreludeItems.ITEMS.register(name, () -> {
            Item.Properties props = new Item.Properties();
            //if (block.get() instanceof EggBlock) {
            //    // Set stack size to 1
            //    props = props.stacksTo(1);
            //}
            return new BlockItem(block.get(), props);
        });
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
