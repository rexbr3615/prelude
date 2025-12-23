package net.rexbrx.prelude.server.blocks;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.blocks.tile.*;

import java.util.function.Supplier;


public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, prelude.MODID);




    public static final Supplier<BlockEntityType<AnalyzerEntity>> ANALYZER_ENTITY =
            BLOCK_ENTITIES.register("analyzer_entity", () ->
                    BlockEntityType.Builder.of(AnalyzerEntity::new,
                            PreludeBlocks.ANALYZER.get()).build(null));

    public static final Supplier<BlockEntityType<VatEntity>> VAT_ENTITY =
            BLOCK_ENTITIES.register("vat_entity", () ->
                    BlockEntityType.Builder.of(VatEntity::new,
                            PreludeBlocks.VAT.get()).build(null));

    public static final Supplier<BlockEntityType<CrusherEntity>> CRUSHER_ENTITY =
            BLOCK_ENTITIES.register("crusher_entity", () ->
                    BlockEntityType.Builder.of(CrusherEntity::new,
                            PreludeBlocks.CRUSHER.get()).build(null));

    public static final Supplier<BlockEntityType<IncubatorEntity>> INCUBATOR_ENTITY =
            BLOCK_ENTITIES.register("incubator_entity", () ->
                    BlockEntityType.Builder.of(IncubatorEntity::new,
                            PreludeBlocks.INCUBATOR.get()).build(null));

    public static final Supplier<BlockEntityType<IndustrialCrusherEntity>> INDUSTRIAL_CRUSHER_ENTITY =
            BLOCK_ENTITIES.register("industrial_crusher_entity", () ->
                    BlockEntityType.Builder.of(IndustrialCrusherEntity::new,
                            PreludeBlocks.INDUSTRIAL_CRUSHER.get()).build(null));


    public static final Supplier<BlockEntityType<PipeBlockEntity>> TILE_ITEM_PIPE_ENTITY =
            BLOCK_ENTITIES.register("item_pipe_entity", () -> BlockEntityType.Builder.of(
                    PipeBlockEntity::new, PreludeBlocks.PIPE_ITEM.get()).build(null));

    public static final Supplier<BlockEntityType<PipeBlockEntity>> TILE_FLUID_PIPE_ENTITY =
            BLOCK_ENTITIES.register("fluid_pipe_entity", () -> BlockEntityType.Builder.of(
                    PipeBlockEntity::new, PreludeBlocks.PIPE_FLUID.get()).build(null));

    public static final Supplier<BlockEntityType<PipeBlockEntity>> TILE_POWER_PIPE_ENTITY =
            BLOCK_ENTITIES.register("power_pipe_entity", () -> BlockEntityType.Builder.of(
                    PipeBlockEntity::new, PreludeBlocks.PIPE_POWA.get()).build(null));


    public static final Supplier<BlockEntityType<GeneratorBlockEntity>> GENERATOR_BE =
            BLOCK_ENTITIES.register("generator_be", () -> BlockEntityType.Builder.of(
                    GeneratorBlockEntity::new, PreludeBlocks.GENERATOR.get()).build(null));




    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }}
