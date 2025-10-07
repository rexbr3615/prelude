package net.rexbrx.prelude.server.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.blocks.common.*;
import net.rexbrx.prelude.server.blocks.common.PipeBlock;
import net.rexbrx.prelude.server.blocks.other.barrier.BarrierBlock;
import net.rexbrx.prelude.server.blocks.other.teeth.TeethBlock;
import net.rexbrx.prelude.server.items.PreludeItems;
import net.rexbrx.prelude.server.items.common.ModRotatedPillarBlock;
import net.rexbrx.prelude.server.procedurals.EncaseFossil;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Supplier;

public class PreludeBlocks
{
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, prelude.MODID);

    //==================================================================================


    public static final RegistryObject<Block> ENCHASED_FOSSIL = registerBlock("enchased_fossil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GRAPHITE_BLOCK = registerBlock("graphite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.BASALT)
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GYPSUM_BLOCK = registerBlock("gypsum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.BASALT)
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PROTOTAXITES_BLOCK = registerBlock("prototaxites_block",
            () -> new PrototaxitesBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).randomTicks()));

    public static final RegistryObject<Block> FOSSIL_ORE = registerBlock("fossil_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEP_FOSSIL_ORE = registerBlock("deep_fossil_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> SWARTPUNTIA = registerBlock("swartpuntia",
            () -> new BlockPreludeCustomWaterGrass(
                    BlockBehaviour.Properties.copy(Blocks.SEAGRASS).noOcclusion()));
    public static final RegistryObject<Block> STROMATOLITES = registerBlock("stromatolites",
            () -> new BlockPreludeCustomWaterGrass(
                    BlockBehaviour.Properties.copy(Blocks.SEAGRASS).noOcclusion()));
    public static final RegistryObject<Block> STROMATOLITES_FULL = registerBlock("stromatolite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<GrowingPlantHeadBlock> ENCRINUS = registerBlock("encrinus",
            () -> new BlockEncrinusTop(BlockBehaviour.Properties.copy(Blocks.KELP)
                    .noCollission()
                    .randomTicks()
                    .instabreak()

                    .sound(SoundType.WET_GRASS)));

    public static final RegistryObject<GrowingPlantBlock> ENCRINUS_STEM = registerBlock("encrinus_stem",
            () -> new BlockEncrinus(BlockBehaviour.Properties.copy(Blocks.KELP_PLANT)
                    .noCollission()
                    .randomTicks()
                    .instabreak()

                    .sound(SoundType.WET_GRASS)));

    public static final RegistryObject<Block> COMMON_FENCE = registerBlock("common_fence",
            () -> new PreludeFence());

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.NETHERITE_BLOCK)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ANTENNA_4X4 = registerBlock("antenna1",
            () -> new AntennaBaseBlock());
    public static final RegistryObject<Block> ANTENNA_3X3 = registerBlock("antenna2",
            () -> new AntennaBaseBlock());
    public static final RegistryObject<Block> ANTENNA_2X2 = registerBlock("antenna3",
            () -> new AntennaBaseBlock());
    public static final RegistryObject<Block> ANTENNA_1X1 = registerBlock("antenna4",
            () -> new AntennaBaseBlock());
    public static final RegistryObject<Block> ANTENNA_PART = registerBlock("antenna_part",
            () -> new AntennaBaseBlock());
    public static final RegistryObject<Block> ANTENNA_BASE = registerBlock("antenna_base",
            () -> new AntennaBaseBlock());

    public static final RegistryObject<Block> POWER_BOX = registerBlock("power_box",
            () -> new PreludeInWallBlock());
    public static final RegistryObject<Block> CABLE_BLOCK = registerBlock("cable_block",
            () -> new PreludeInWallBlock());
    public static final RegistryObject<Block> CABLE_BLOCK_CORNER = registerBlock("cable_block_corner",
            () -> new PreludeInWallBlock());

    public static final RegistryObject<Block> BASIC_PIPE = registerBlock("basic_pipe",
            () -> new PipeBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).noOcclusion()));

    public static final RegistryObject<Block> COOKSONIA_PLANT = registerBlockWithoutBlockItem("cooksonia_plant",
            () -> new CooksoniaPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> HIGH_SECURITY_FENCE = registerBlock("high_security_fence",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> SECURITY_BLOCK = registerBlock("security_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MARBLE = registerBlock("marble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.45f, 4.6f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MARBLE_BRICKS = registerBlock("marble_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.45f, 4.6f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MARBLE_TILES = registerBlock("marble_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.45f, 4.6f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MARBLE_FLOOR = registerBlock("marble_floor",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.25f, 4.2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MARBLE_PILLAR = registerBlock("marble_pillar",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.25f, 4.2f).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> CALAMITES_LOG = registerBlock("calamites_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> CALAMITES_WOOD = registerBlock("calamites_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> CALAMITES_PLANKS = registerBlock("calamites_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
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
    public static final RegistryObject<Block> CALAMITES_LEAVES = registerBlock("calamites_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
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
    public static final RegistryObject<Block> CALAMITES_STAIRS = registerBlock("calamites_stairs",
            () -> new StairBlock(() -> PreludeBlocks.CALAMITES_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> CALAMITES_SLAB = registerBlock("calamites_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> CALAMITES_FENCE = registerBlock("calamites_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> CALAMITES_FENCE_GATE = registerBlock("calamites_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> CALAMITES_BUTTON = registerBlock("calamites_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)
                    .noCollission(),
                    BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> CALAMITES_PRESSURE_PLATE = registerBlock("calamites_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE),
                    BlockSetType.IRON));

    public static final RegistryObject<Block> CALAMITES_DOOR = registerBlock("calamites_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)
                    .noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> CALAMITES_TRAPDOOR = registerBlock("calamites_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)
                    .noOcclusion(), BlockSetType.OAK));

    public static final RegistryObject<Block> CALAMITES_SAPLING2 = registerBlock("calamites_sapling1",
            () -> new FlowerBlock(MobEffects.LEVITATION, 8,
                    BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).noOcclusion().noCollission().instabreak()));



    public static final RegistryObject<Block> GINKGO_LOG = registerBlock("ginkgo_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> GINKGO_WOOD = registerBlock("ginkgo_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> GINKGO_PLANKS = registerBlock("ginkgo_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
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
    public static final RegistryObject<Block> GINKGO_LEAVES = registerBlock("ginkgo_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
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
    public static final RegistryObject<Block> GINKGO_LEAVES_FRUIT = registerBlock("ginkgo_leaves_fruit",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
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
    public static final RegistryObject<Block> GINKGO_STAIRS = registerBlock("ginkgo_stairs",
            () -> new StairBlock(() -> PreludeBlocks.CALAMITES_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> GINKGO_SLAB = registerBlock("ginkgo_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> GINKGO_FENCE = registerBlock("ginkgo_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> GINKGO_FENCE_GATE = registerBlock("ginkgo_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> GINKGO_BUTTON = registerBlock("ginkgo_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)
                    .noCollission().noCollission(),
                    BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> GINKGO_PRESSURE_PLATE = registerBlock("ginkgo_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE),
    BlockSetType.IRON));
    public static final RegistryObject<Block> GINKGO_DOOR = registerBlock("ginkgo_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)
                    .noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> GINKGO_TRAPDOOR = registerBlock("ginkgo_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)
                    .noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> GINKGO_SAPLING = registerBlock("ginkgo_sapling",
            () -> new FlowerBlock(MobEffects.LEVITATION, 8,
                    BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).noOcclusion().noCollission().instabreak()));













    public static final RegistryObject<Block> COOKSONIA = registerBlock("cooksonia",
            () -> new PinkPetalsBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().sound(SoundType.PINK_PETALS).pushReaction(PushReaction.DESTROY)));




    public static final RegistryObject<Block> CONCRETE_BARRIER = registerBlock("concrete_barrier",
            () -> new PreludeCustomRotateBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.89f, 8.6f).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> TEETH_BLOCK = registerBlock("teeth", () -> new TeethBlock());
    public static final RegistryObject<Block> BARRIER_BLOCK = registerBlock("barrier", () -> new BarrierBlock());


    public static final RegistryObject<Block> ADOBE_BLOCK = registerBlock("adobe_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ADOBE_BLOCK_BRICKS = registerBlock("adobe_block_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STEEL_GRATE_BLOCK = registerBlock("steel_grate_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.CHAIN)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> VOLCANO_BLOCK = registerBlock("volcano_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.BASALT)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TUFF_DECORATIVE_BLOCK = registerBlock("tuff_decorative",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.TUFF)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ASPHALT_BLOCK = registerBlock("asphalt_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> REINFORCED_ASPHALT_BLOCK = registerBlock("reinforced_asphalt_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ANCIENT_RELIC = registerBlock("ancient_relic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)
                    .strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BITUMEN_STONE = registerBlock("bitumen_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)
                    .strength(3f).requiresCorrectToolForDrops()));

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }




    public static final RegistryObject<Block> ANALYZER = registerBlock("analyzer",
            () -> new AnalyzerBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> VAT = registerBlock("vat",
            () -> new VatBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> CRUSHER = registerBlock("crusher",
            () -> new CrusherBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    //==================================================================================

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return PreludeItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
