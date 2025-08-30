package net.rexbrx.prelude.server.blocks;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.blocks.other.barrier.BarrierBlockEntity;
import net.rexbrx.prelude.server.blocks.other.teeth.TeethBlockEntity;
import net.rexbrx.prelude.server.blocks.tile.AnalyzerEntity;
import net.rexbrx.prelude.server.blocks.tile.CrusherEntity;
import net.rexbrx.prelude.server.blocks.tile.VatEntity;


public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, prelude.MODID);




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







    public static final RegistryObject<BlockEntityType<TeethBlockEntity>> TEETH_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("teeth_entity", () ->
                    BlockEntityType.Builder.of(TeethBlockEntity::new,
                    PreludeBlocks.TEETH_BLOCK.get()).build(null));
    public static final RegistryObject<BlockEntityType<BarrierBlockEntity>> BARRIER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("barrier_entity", () ->
                    BlockEntityType.Builder.of(BarrierBlockEntity::new,
                            PreludeBlocks.BARRIER_BLOCK.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
