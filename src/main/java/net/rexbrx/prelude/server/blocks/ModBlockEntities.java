package net.rexbrx.prelude.server.blocks;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.blocks.other.EolicgeneratorBlockEntity;
import net.rexbrx.prelude.server.blocks.other.barrier.BarrierBlockEntity;
import net.rexbrx.prelude.server.blocks.other.teeth.TeethBlockEntity;
import net.rexbrx.prelude.server.blocks.tile.*;


public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(NeoForgeRegistries.BLOCK_ENTITY_TYPES, prelude.MODID);




    public static final RegistryObject<BlockEntityType<AnalyzerEntity>> ANALYZER_ENTITY =
            BLOCK_ENTITIES.register("analyzer_entity", () ->
                    BlockEntityType.Builder.of(AnalyzerEntity::new,
                            PreludeBlocks.ANALYZER.get()).build(null));

    public static final RegistryObject<BlockEntityType<VatEntity>> VAT_ENTITY =
            BLOCK_ENTITIES.register("vat_entity", () ->
                    BlockEntityType.Builder.of(VatEntity::new,
                            PreludeBlocks.VAT.get()).build(null));

    public static final RegistryObject<BlockEntityType<CrusherEntity>> CRUSHER_ENTITY =
            BLOCK_ENTITIES.register("crusher_entity", () ->
                    BlockEntityType.Builder.of(CrusherEntity::new,
                            PreludeBlocks.CRUSHER.get()).build(null));

    public static final RegistryObject<BlockEntityType<IncubatorEntity>> INCUBATOR_ENTITY =
            BLOCK_ENTITIES.register("incubator_entity", () ->
                    BlockEntityType.Builder.of(IncubatorEntity::new,
                            PreludeBlocks.INCUBATOR.get()).build(null));





    public static final RegistryObject<BlockEntityType<TeethBlockEntity>> TEETH_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("teeth_entity", () ->
                    BlockEntityType.Builder.of(TeethBlockEntity::new,
                    PreludeBlocks.TEETH_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BarrierBlockEntity>> BARRIER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("barrier_entity", () ->
                    BlockEntityType.Builder.of(BarrierBlockEntity::new,
                            PreludeBlocks.BARRIER_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<EolicgeneratorBlockEntity>> EOLICGENERATOR =
            BLOCK_ENTITIES.register("eolic_entity", () ->
                    BlockEntityType.Builder.of(EolicgeneratorBlockEntity::new,
                            PreludeBlocks.EO_GEN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
