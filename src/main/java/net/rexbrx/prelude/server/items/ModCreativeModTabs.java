package net.rexbrx.prelude.server.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.blocks.PreludeBlocks;

import java.util.function.Supplier;


public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, prelude.MODID);

    public static final Supplier<CreativeModeTab> PRELUDE_TAB = CREATIVE_MODE_TABS.register("tutorial_tab0",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(PreludeItems.TOKEN.get()))
                    .title(Component.translatable("creativetab.prelude_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(PreludeItems.DISC_DRIVE.get());
                        pOutput.accept(PreludeItems.FLARE.get());
                        pOutput.accept(PreludeItems.DNA_NUCLEOTIDES.get());
                        pOutput.accept(PreludeItems.NUCLEOTIDES.get());

                        pOutput.accept(PreludeItems.AGAR.get());
                        pOutput.accept(PreludeItems.COOKSONIA_SPORES.get());

                        pOutput.accept(PreludeItems.PETRI_DISH.get());
                        pOutput.accept(PreludeItems.PETRI_DISH_AGAR.get());
                        pOutput.accept(PreludeItems.PETRI_DISH_PLANT_CELLS.get());
                        pOutput.accept(PreludeItems.PLANT_CELLS.get());
                        pOutput.accept(PreludeItems.BACTERIAS.get());

                        pOutput.accept(PreludeItems.COKE.get());
                        pOutput.accept(PreludeItems.LIGNITE.get());
                        pOutput.accept(PreludeItems.BITUMEN.get());
                        pOutput.accept(PreludeItems.BITUMEN_NUGGET.get());
                        pOutput.accept(PreludeItems.WIRE.get());
                        pOutput.accept(PreludeItems.NUTRIENTS.get());
                        pOutput.accept(PreludeItems.TINTED_ROD.get());

                        pOutput.accept(PreludeItems.PLASTER.get());





                        pOutput.accept(PreludeItems.RAW_MARBLE.get());
                        pOutput.accept(PreludeItems.SYRINGE.get());
                        pOutput.accept(PreludeItems.TEST_TUBE.get());

                        pOutput.accept(PreludeItems.CPU.get());
                        pOutput.accept(PreludeItems.GINKGO_NUTS.get());








                        pOutput.accept(PreludeItems.HYBRIDIZER.get());
                        pOutput.accept(PreludeItems.ESSENCE.get());
                        pOutput.accept(PreludeItems.COAL_DUST.get());
                        pOutput.accept(PreludeItems.CARBON_FIBRE_PLATE.get());
                        pOutput.accept(PreludeItems.STEEL_INGOT.get());
                        pOutput.accept(PreludeItems.STEEL_NUGGETS.get());
                        pOutput.accept(PreludeItems.GRAPHITE.get());
                        pOutput.accept(PreludeItems.NACRE.get());
                        pOutput.accept(PreludeItems.HEAT_DISSIPATOR.get());
                        pOutput.accept(PreludeItems.SATA.get());
                        pOutput.accept(PreludeItems.RAM.get());
                        pOutput.accept(PreludeItems.COMPUTER_MODULE.get());
                        pOutput.accept(PreludeItems.COMPUTER_SCREEN.get());
                        pOutput.accept(PreludeItems.GYPSUM_CRYSTAL.get());
                        pOutput.accept(PreludeItems.GYPSUM_POWDER.get());
                        pOutput.accept(PreludeItems.CRUSHER_BOX.get());
                        pOutput.accept(PreludeItems.STEEL_COGWHEEL.get());
                        pOutput.accept(PreludeItems.MECHANISM.get());









                        pOutput.accept(PreludeItems.DISKETTE.get());
                        //pOutput.accept(PreludeItems.SIMPLE_BOTTLE.get());
                        //pOutput.accept(PreludeBlocks.EO_GEN.get());

                        pOutput.accept(PreludeItems.TEST_DNA.get());
                        //pOutput.accept(PreludeItems.RAILGUN.get());
                        pOutput.accept(PreludeItems.TOKEN.get());

                        //pOutput.accept(PreludeBlocks.COOKSONIA_PLANT.get());

                        pOutput.accept(PreludeItems.PIPE_STATE_CHANGER.get());






                    })
                    .build());

    public static final Supplier<CreativeModeTab> PERIOD_TAB = CREATIVE_MODE_TABS.register("tutorial_tab1",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(PreludeItems.CRETACEOUS_DISK.get()))
                    .title(Component.translatable("creativetab.prelude_tab_1"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(PreludeItems.CRETACEOUS_DISK.get());
                        pOutput.accept(PreludeItems.JURASSIC_DISK.get());
                        pOutput.accept(PreludeItems.TRIASSIC_DISK.get());
                        pOutput.accept(PreludeItems.PERMIAN_DISK.get());
                        pOutput.accept(PreludeItems.DEVONIAN_DISK.get());

                        pOutput.accept(PreludeItems.PLANT_DISK.get());

                        pOutput.accept(PreludeItems.CRETACEOUS_FOSSIL.get());
                        pOutput.accept(PreludeItems.JURASSIC_FOSSIL.get());
                        pOutput.accept(PreludeItems.TRIASSIC_FOSSIL.get());
                        pOutput.accept(PreludeItems.PERMIAN_FOSSIL.get());
                        pOutput.accept(PreludeItems.DEVONIAN_FOSSIL.get());

                        pOutput.accept(PreludeItems.PLANT_FOSSIL.get());

                    })
                    .build());

    public static final Supplier<CreativeModeTab> DNA_TAB = CREATIVE_MODE_TABS.register("tutorial_tab2",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(PreludeItems.JURAVENATOR_DNA.get()))
                    .title(Component.translatable("creativetab.prelude_tab_2"))
                    .displayItems((pParameters, pOutput) -> {


                        pOutput.accept(PreludeItems.ALLOSAURUS_DNA.get());
                        pOutput.accept(PreludeItems.JURAVENATOR_DNA.get());
                        pOutput.accept(PreludeItems.GALLIMIMUS_DNA.get());
                        pOutput.accept(PreludeItems.MEGARAPTOR_DNA.get());
                        pOutput.accept(PreludeItems.RUGOPS_DNA.get());
                        pOutput.accept(PreludeItems.PROTEROSUCHUS_DNA.get());
                        //pOutput.accept(PreludeItems.INFERNORAPTOR_DNA.get());
                        pOutput.accept(PreludeItems.YUTYRANNUS_DNA.get());
                        pOutput.accept(PreludeItems.COELACANTH_DNA.get());
                        pOutput.accept(PreludeItems.CONODONTA_DNA.get());
                        pOutput.accept(PreludeItems.PTERANODON_DNA.get());
                        pOutput.accept(PreludeItems.THERIZINOSAURUS_DNA.get());
                        pOutput.accept(PreludeItems.TORVOSAURUS_DNA.get());
                        pOutput.accept(PreludeItems.CERATOSAURUS_DNA.get());
                        pOutput.accept(PreludeItems.OURANOSAURUS_DNA.get());
                        pOutput.accept(PreludeItems.AVACERATOPS_DNA.get());
                        pOutput.accept(PreludeItems.BAJADASAURUS_DNA.get());
                        pOutput.accept(PreludeItems.DEINOCHEIRUS_DNA.get());
                        pOutput.accept(PreludeItems.ALBERTOSAURUS_DNA.get());
                        pOutput.accept(PreludeItems.PUERTASAURUS_DNA.get());
                        pOutput.accept(PreludeItems.TANYSTROPHEUS_DNA.get());
                        pOutput.accept(PreludeItems.SIGILMASSASAURUS_DNA.get());
                        pOutput.accept(PreludeItems.MUTADON_DNA.get());
                        pOutput.accept(PreludeItems.ORODROMEUS_DNA.get());
                        pOutput.accept(PreludeItems.DRYOSAURUS_DNA.get());
                        pOutput.accept(PreludeItems.SILESAURUS_DNA.get());
                        pOutput.accept(PreludeItems.AUSTRORAPTOR_DNA.get());
                        pOutput.accept(PreludeItems.PARASAUROLOPHUS_DNA.get());
                        pOutput.accept(PreludeItems.SCLEROCEPHALUS_DNA.get());
                        pOutput.accept(PreludeItems.KENTROSAURUS_DNA.get());
                        pOutput.accept(PreludeItems.SIATS_DNA.get());
                        pOutput.accept(PreludeItems.JINFENGOPTERYX_DNA.get());
                        pOutput.accept(PreludeItems.CLADOSELACHE_DNA.get());
                        pOutput.accept(PreludeItems.ARGENTAVIS_DNA.get());


                    })
                    .build());

    public static final Supplier<CreativeModeTab> EGG_TAB = CREATIVE_MODE_TABS.register("tutorial_tab3",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(PreludeItems.JURAVENATOR_SPAWN_EGG.get()))
                    .title(Component.translatable("creativetab.prelude_tab_3"))
                    .displayItems((pParameters, pOutput) -> {


                        pOutput.accept(PreludeItems.JURAVENATOR_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.ALLOSAURUS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.GALLIMIMUS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.RUGOPS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.PROTEROSUCHUS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.MEGARAPTOR_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.YUTYRANNUS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.BLUE_COELACANTH_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.CONODONTA_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.PTERANODON_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.THERIZINOSAURUS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.TORVOSAURUS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.CERATOSAURUS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.OURANOSAURUS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.AVACERATOPS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.BAJADASAURUS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.DEINOCHEIRUS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.ALBERTOSAURUS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.PUERTASAURUS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.TANYSTROPHEUS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.SIGILMASSASAURUS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.MUTADON_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.ORODROMEUS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.DRYOSAURUS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.SILESAURUS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.AUSTRORAPTOR_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.PARASAUROLOPHUS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.SCLEROCEPHALUS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.KENTROSAURUS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.SIATS_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.JINFENGOPTERYX_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.CLADOSELACHE_SPAWN_EGG.get());
                        pOutput.accept(PreludeItems.ARGENTAVIS_SPAWN_EGG.get());


                    })
                    .build());

    public static final Supplier<CreativeModeTab> BLOCKS_TAB = CREATIVE_MODE_TABS.register("tutorial_tab4",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(PreludeBlocks.FOSSIL_ORE.get()))
                    .title(Component.translatable("creativetab.prelude_tab_4"))
                    .displayItems((pParameters, pOutput) -> {


                        pOutput.accept(PreludeBlocks.FOSSIL_ORE.get());
                        pOutput.accept(PreludeBlocks.DEEP_FOSSIL_ORE.get());
                        pOutput.accept(PreludeBlocks.ENCHASED_FOSSIL.get());
                        pOutput.accept(PreludeBlocks.ANTENNA_1X1.get());
                        pOutput.accept(PreludeBlocks.ANTENNA_2X2.get());
                        pOutput.accept(PreludeBlocks.ANTENNA_3X3.get());
                        pOutput.accept(PreludeBlocks.ANTENNA_4X4.get());
                        pOutput.accept(PreludeBlocks.ANTENNA_PART.get());
                        pOutput.accept(PreludeBlocks.ANTENNA_BASE.get());

                        pOutput.accept(PreludeBlocks.HIGH_SECURITY_FENCE.get());
                        pOutput.accept(PreludeBlocks.POWER_BOX.get());
                        pOutput.accept(PreludeBlocks.CABLE_BLOCK.get());
                        pOutput.accept(PreludeBlocks.CABLE_BLOCK_CORNER.get());
                        pOutput.accept(PreludeBlocks.SECURITY_BLOCK.get());

                        pOutput.accept(PreludeBlocks.MARBLE.get());
                        pOutput.accept(PreludeBlocks.MARBLE_BRICKS.get());
                        pOutput.accept(PreludeBlocks.MARBLE_PILLAR.get());
                        pOutput.accept(PreludeBlocks.MARBLE_FLOOR.get());
                        pOutput.accept(PreludeBlocks.MARBLE_TILES.get());

                        pOutput.accept(PreludeBlocks.GRAPHITE_BLOCK.get());
                        pOutput.accept(PreludeBlocks.GYPSUM_BLOCK.get());

                        pOutput.accept(PreludeBlocks.STEEL_GRATE_BLOCK.get());
                        pOutput.accept(PreludeBlocks.ADOBE_BLOCK.get());
                        pOutput.accept(PreludeBlocks.ADOBE_BLOCK_BRICKS.get());
                        pOutput.accept(PreludeBlocks.VOLCANO_BLOCK.get());
                        pOutput.accept(PreludeBlocks.TUFF_DECORATIVE_BLOCK.get());
                        pOutput.accept(PreludeBlocks.ASPHALT_BLOCK.get());
                        pOutput.accept(PreludeBlocks.REINFORCED_ASPHALT_BLOCK.get());
                        pOutput.accept(PreludeBlocks.ANCIENT_RELIC.get());
                        pOutput.accept(PreludeBlocks.BITUMEN_STONE.get());

                        //pOutput.accept(PreludeBlocks.BARRIER_BLOCK.get());
                        //pOutput.accept(PreludeBlocks.TEETH_BLOCK.get());

                        pOutput.accept(PreludeBlocks.COMMON_FENCE.get());


                        pOutput.accept(PreludeBlocks.FOSSIL_ORE.get());
                        pOutput.accept(PreludeBlocks.DEEP_FOSSIL_ORE.get());
                        pOutput.accept(PreludeBlocks.ENCHASED_FOSSIL.get());
                        //pOutput.accept(PreludeBlocks.BASIC_PIPE.get());
                        pOutput.accept(PreludeBlocks.ANTENNA_1X1.get());
                        pOutput.accept(PreludeBlocks.ANTENNA_2X2.get());
                        pOutput.accept(PreludeBlocks.ANTENNA_3X3.get());
                        pOutput.accept(PreludeBlocks.ANTENNA_4X4.get());
                        pOutput.accept(PreludeBlocks.ANTENNA_PART.get());
                        pOutput.accept(PreludeBlocks.ANTENNA_BASE.get());

                        pOutput.accept(PreludeBlocks.HIGH_SECURITY_FENCE.get());
                        pOutput.accept(PreludeBlocks.POWER_BOX.get());
                        pOutput.accept(PreludeBlocks.CABLE_BLOCK.get());
                        pOutput.accept(PreludeBlocks.CABLE_BLOCK_CORNER.get());
                        pOutput.accept(PreludeBlocks.SECURITY_BLOCK.get());

                        pOutput.accept(PreludeBlocks.MARBLE.get());
                        pOutput.accept(PreludeBlocks.MARBLE_BRICKS.get());
                        pOutput.accept(PreludeBlocks.MARBLE_PILLAR.get());
                        pOutput.accept(PreludeBlocks.MARBLE_FLOOR.get());
                        pOutput.accept(PreludeBlocks.MARBLE_TILES.get());

                        pOutput.accept(PreludeBlocks.GRAPHITE_BLOCK.get());
                        pOutput.accept(PreludeBlocks.GYPSUM_BLOCK.get());

                        pOutput.accept(PreludeBlocks.STEEL_GRATE_BLOCK.get());
                        pOutput.accept(PreludeBlocks.ADOBE_BLOCK.get());
                        pOutput.accept(PreludeBlocks.ADOBE_BLOCK_BRICKS.get());
                        pOutput.accept(PreludeBlocks.VOLCANO_BLOCK.get());
                        pOutput.accept(PreludeBlocks.TUFF_DECORATIVE_BLOCK.get());
                        pOutput.accept(PreludeBlocks.ASPHALT_BLOCK.get());
                        pOutput.accept(PreludeBlocks.REINFORCED_ASPHALT_BLOCK.get());
                        pOutput.accept(PreludeBlocks.ANCIENT_RELIC.get());
                        pOutput.accept(PreludeBlocks.BITUMEN_STONE.get());

                        pOutput.accept(PreludeBlocks.STEEL_BLOCK.get());
                        pOutput.accept(PreludeBlocks.METAL_PILLAR.get());

                    })
                    .build());

    public static final Supplier<CreativeModeTab> MACHINE_TAB = CREATIVE_MODE_TABS.register("tutorial_tab5",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(PreludeBlocks.INCUBATOR.get()))
                    .title(Component.translatable("creativetab.prelude_tab_5"))
                    .displayItems((pParameters, pOutput) -> {



                        pOutput.accept(PreludeBlocks.VAT.get());
                        pOutput.accept(PreludeBlocks.ANALYZER.get());
                        pOutput.accept(PreludeBlocks.CRUSHER.get());
                        pOutput.accept(PreludeBlocks.INCUBATOR.get());

                        pOutput.accept(PreludeBlocks.INDUSTRIAL_CRUSHER.get());

                        //pOutput.accept(PreludeBlocks.PIPE_POWA.get());
                        pOutput.accept(PreludeBlocks.PIPE_FLUID.get());
                        //pOutput.accept(PreludeBlocks.PIPE_ITEM.get());

                        pOutput.accept(PreludeItems.PIPE_STATE_CHANGER.get());



                    })
                    .build());

    public static final Supplier<CreativeModeTab> PLANT_TAB = CREATIVE_MODE_TABS.register("tutorial_tab6",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(PreludeBlocks.CALAMITES_SAPLING2.get()))
                    .title(Component.translatable("creativetab.prelude_tab_5"))
                    .displayItems((pParameters, pOutput) -> {


                        pOutput.accept(PreludeBlocks.SWARTPUNTIA.get());
                        pOutput.accept(PreludeBlocks.COOKSONIA.get());
                        pOutput.accept(PreludeBlocks.STROMATOLITES.get());
                        pOutput.accept(PreludeBlocks.STROMATOLITES_FULL.get());

                        pOutput.accept(PreludeBlocks.PROTOTAXITES_BLOCK.get());
                        pOutput.accept(PreludeBlocks.ENCRINUS_STEM.get());
                        pOutput.accept(PreludeBlocks.ENCRINUS.get());


                        pOutput.accept(PreludeBlocks.CALAMITES_LOG.get());
                        pOutput.accept(PreludeBlocks.CALAMITES_WOOD.get());
                        pOutput.accept(PreludeBlocks.CALAMITES_PLANKS.get());
                        //pOutput.accept(PreludeBlocks.CALAMITES_DOOR.get());
                        //pOutput.accept(PreludeBlocks.CALAMITES_BUTTON.get());
                        //pOutput.accept(PreludeBlocks.CALAMITES_PRESSURE_PLATE.get());
                        pOutput.accept(PreludeBlocks.CALAMITES_SLAB.get());
                        //pOutput.accept(PreludeBlocks.CALAMITES_STAIRS.get());
                        pOutput.accept(PreludeBlocks.CALAMITES_FENCE.get());
                        pOutput.accept(PreludeBlocks.CALAMITES_FENCE_GATE.get());
                        //pOutput.accept(PreludeBlocks.CALAMITES_TRAPDOOR.get());
                        pOutput.accept(PreludeBlocks.CALAMITES_LEAVES.get());
                        pOutput.accept(PreludeBlocks.CALAMITES_SAPLING2.get());

                        pOutput.accept(PreludeBlocks.GINKGO_LOG.get());
                        pOutput.accept(PreludeBlocks.GINKGO_WOOD.get());
                        pOutput.accept(PreludeBlocks.GINKGO_PLANKS.get());
                        //pOutput.accept(PreludeBlocks.GINKGO_DOOR.get());
                        //pOutput.accept(PreludeBlocks.GINKGO_BUTTON.get());
                        //pOutput.accept(PreludeBlocks.GINKGO_PRESSURE_PLATE.get());
                        pOutput.accept(PreludeBlocks.GINKGO_SLAB.get());
                        //pOutput.accept(PreludeBlocks.GINKGO_STAIRS.get());
                        pOutput.accept(PreludeBlocks.GINKGO_FENCE.get());
                        pOutput.accept(PreludeBlocks.GINKGO_FENCE_GATE.get());
                        //pOutput.accept(PreludeBlocks.GINKGO_TRAPDOOR.get());
                        pOutput.accept(PreludeBlocks.GINKGO_LEAVES.get());
                        pOutput.accept(PreludeBlocks.GINKGO_LEAVES_FRUIT.get());
                        pOutput.accept(PreludeBlocks.GINKGO_SAPLING.get());

                        pOutput.accept(PreludeBlocks.HYPER_CALAMITES_LOG.get());
                        pOutput.accept(PreludeBlocks.HYPER_CALAMITES_WOOD.get());
                        pOutput.accept(PreludeBlocks.HYPER_CALAMITES_LEAVES.get());
                        pOutput.accept(PreludeBlocks.HYPER_CALAMITES_SAPLING.get());

                        pOutput.accept(PreludeBlocks.ARAUCARIA_LOG.get());
                        pOutput.accept(PreludeBlocks.ARAUCARIA_WOOD.get());
                        pOutput.accept(PreludeBlocks.ARAUCARIA_LEAVES.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
