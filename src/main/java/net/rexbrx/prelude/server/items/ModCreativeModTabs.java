package net.rexbrx.prelude.server.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.blocks.PreludeBlocks;

public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, prelude.MODID);

    public static final RegistryObject<CreativeModeTab> PRELUDE_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(PreludeItems.DISC_DRIVE.get()))
                    .title(Component.translatable("creativetab.prelude_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(PreludeItems.DISC_DRIVE.get());
                        pOutput.accept(PreludeItems.FLARE.get());
                        pOutput.accept(PreludeItems.DNA_NUCLEOTIDES.get());
                        pOutput.accept(PreludeItems.NUCLEOTIDES.get());

                        pOutput.accept(PreludeItems.PETRI_DISH.get());
                        pOutput.accept(PreludeItems.PETRI_DISH_AGAR.get());
                        pOutput.accept(PreludeItems.PETRI_DISH_PLANT_CELLS.get());
                        pOutput.accept(PreludeItems.PLANT_CELLS.get());
                        pOutput.accept(PreludeItems.BACTERIAS.get());

                        pOutput.accept(PreludeItems.COKE.get());
                        pOutput.accept(PreludeItems.LIGNITE.get());
                        pOutput.accept(PreludeItems.WIRE.get());
                        pOutput.accept(PreludeItems.NUTRIENTS.get());
                        pOutput.accept(PreludeItems.TINTED_ROD.get());

                        pOutput.accept(PreludeItems.PLASTER.get());

                        pOutput.accept(PreludeItems.CRETACEOUS_DISK.get());
                        pOutput.accept(PreludeItems.JURASSIC_DISK.get());
                        pOutput.accept(PreludeItems.TRIASSIC_DISK.get());
                        pOutput.accept(PreludeItems.PLANT_DISK.get());

                        pOutput.accept(PreludeItems.CRETACEOUS_FOSSIL.get());
                        pOutput.accept(PreludeItems.JURASSIC_FOSSIL.get());
                        pOutput.accept(PreludeItems.TRIASSIC_FOSSIL.get());
                        pOutput.accept(PreludeItems.PLANT_FOSSIL.get());

                        pOutput.accept(PreludeItems.RAW_MARBLE.get());

                        pOutput.accept(PreludeItems.ALLOSAURUS_DNA.get());
                        pOutput.accept(PreludeItems.GALLIMIMUS_DNA.get());
                        pOutput.accept(PreludeItems.JURAVENATOR_DNA.get());
                        pOutput.accept(PreludeItems.MEGARAPTOR_DNA.get());
                        pOutput.accept(PreludeItems.RUGOPS_DNA.get());
                        pOutput.accept(PreludeItems.PROTEROSUCHUS_DNA.get());
                        pOutput.accept(PreludeItems.INFERNORAPTOR_DNA.get());
                        pOutput.accept(PreludeItems.YUTYRANNUS_DNA.get());
                        pOutput.accept(PreludeItems.COELACANTH_DNA.get());
                        pOutput.accept(PreludeItems.CONODONTA_DNA.get());
                        pOutput.accept(PreludeItems.PTERANODON_DNA.get());
                        pOutput.accept(PreludeItems.THERIZINOSAURUS_DNA.get());
                        pOutput.accept(PreludeItems.TORVOSAURUS_DNA.get());

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

                        pOutput.accept(PreludeItems.ESSENCE.get());

                        pOutput.accept(PreludeBlocks.VAT.get());
                        pOutput.accept(PreludeBlocks.ANALYZER.get());
                        pOutput.accept(PreludeBlocks.SWARTPUNTIA.get());
                        pOutput.accept(PreludeBlocks.COMMON_FENCE.get());
                        pOutput.accept(PreludeBlocks.PROTOTAXITES_BLOCK.get());
                        pOutput.accept(PreludeBlocks.ENCRINUS_STEM.get());
                        pOutput.accept(PreludeBlocks.ENCRINUS.get());
                        pOutput.accept(PreludeBlocks.FOSSIL_ORE.get());
                        pOutput.accept(PreludeBlocks.DEEP_FOSSIL_ORE.get());
                        pOutput.accept(PreludeBlocks.ENCHASED_FOSSIL.get());
                        pOutput.accept(PreludeBlocks.BASIC_PIPE.get());
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

                        pOutput.accept(PreludeBlocks.CALAMITES_LOG.get());
                        pOutput.accept(PreludeBlocks.CALAMITES_WOOD.get());
                        pOutput.accept(PreludeBlocks.CALAMITES_PLANKS.get());
                        pOutput.accept(PreludeBlocks.CALAMITES_DOOR.get());
                        pOutput.accept(PreludeBlocks.CALAMITES_BUTTON.get());
                        pOutput.accept(PreludeBlocks.CALAMITES_PRESSURE_PLATE.get());
                        pOutput.accept(PreludeBlocks.CALAMITES_SLAB.get());
                        pOutput.accept(PreludeBlocks.CALAMITES_STAIRS.get());
                        pOutput.accept(PreludeBlocks.CALAMITES_FENCE.get());
                        pOutput.accept(PreludeBlocks.CALAMITES_FENCE_GATE.get());
                        pOutput.accept(PreludeBlocks.CALAMITES_TRAPDOOR.get());
                        pOutput.accept(PreludeBlocks.CALAMITES_LEAVES.get());
                        pOutput.accept(PreludeBlocks.CALAMITES_SAPLING2.get());


                        pOutput.accept(PreludeItems.TEST_DNA.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
