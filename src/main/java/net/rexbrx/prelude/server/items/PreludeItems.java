package net.rexbrx.prelude.server.items;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.blocks.PreludeBlocks;
import net.rexbrx.prelude.server.entity.EntityInit;
import net.rexbrx.prelude.server.items.common.*;

public class PreludeItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, prelude.MODID);

    public static final RegistryObject<Item> DISC_DRIVE = ITEMS.register("diskdrive",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NUCLEOTIDES = ITEMS.register("nucleotides",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DNA_NUCLEOTIDES = ITEMS.register("dna_nucleotides",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WIRE = ITEMS.register("wire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NUTRIENTS = ITEMS.register("nutrients",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TINTED_ROD = ITEMS.register("covered_rod",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FLARE = ITEMS.register("flare",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SYRINGE = ITEMS.register("syringe",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> AGAR = ITEMS.register("agar",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TEST_TUBE = ITEMS.register("test_tube",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JURAVENATOR_SPAWN_EGG = ITEMS.register("juravenator_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.JURAVENATOR,0x4d2817, 0x946c5a,
                    new Item.Properties()));

    public static final RegistryObject<Item> ALLOSAURUS_SPAWN_EGG = ITEMS.register("allosaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.ALLOSAURUS,0xf56942, 0xfff9f7,
                    new Item.Properties()));

    public static final RegistryObject<Item> GALLIMIMUS_SPAWN_EGG = ITEMS.register("gallimimus_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.GALLIMIMUS,0x1a0e0e, 0xff8f8f,
                    new Item.Properties()));

    public static final RegistryObject<Item> RUGOPS_SPAWN_EGG = ITEMS.register("rugops_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.RUGOPS,0x0a3b01, 0x93e883,
                    new Item.Properties()));

    public static final RegistryObject<Item> PROTEROSUCHUS_SPAWN_EGG = ITEMS.register("proterosuchus_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.PROTEROSUCHUS,0x202020, 0xf15b0f,
                    new Item.Properties()));

    public static final RegistryObject<Item> MEGARAPTOR_SPAWN_EGG = ITEMS.register("megaraptor_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.MEGARAPTOR,0x0f0b0b, 0x484343,
                    new Item.Properties()));

    public static final RegistryObject<Item> YUTYRANNUS_SPAWN_EGG = ITEMS.register("yutyrannus_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.YUTYRANNUS,0xffffff, 0x696ee4,
                    new Item.Properties()));

    public static final RegistryObject<Item> BLUE_COELACANTH_SPAWN_EGG = ITEMS.register("blue_coelacanth_spawn",
            () -> new ForgeSpawnEggItem(EntityInit.BLUE_COELACANTH,0xffffff, 0xffffff,
                    new Item.Properties()));

    public static final RegistryObject<Item> CONODONTA_SPAWN_EGG = ITEMS.register("conodonta_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.CONODONTA,0xffffff, 0xffffff,
                    new Item.Properties()));

    public static final RegistryObject<Item> PTERANODON_SPAWN_EGG = ITEMS.register("pteranodon_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.PTERANODON,0xebc934, 0xdeca71,
                    new Item.Properties()));

    public static final RegistryObject<Item> THERIZINOSAURUS_SPAWN_EGG = ITEMS.register("therizinosaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.THERIZINOSAURUS,0x212121, 0x5e5353,
                    new Item.Properties()));

    public static final RegistryObject<Item> TORVOSAURUS_SPAWN_EGG = ITEMS.register("torvosaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.TORVOSAURUS,0x420006, 0x8a0a14,
                    new Item.Properties()));

    public static final RegistryObject<Item> MUTADON_SPAWN_EGG = ITEMS.register("mutadon_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.MUTADON,0xffffff, 0xffffff,
                    new Item.Properties()));

    public static final RegistryObject<Item> CERATOSAURUS_SPAWN_EGG = ITEMS.register("ceratosaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.CERATOSAURUS,0xf7b76d, 0xe6e6aa,
                    new Item.Properties()));

    public static final RegistryObject<Item> OURANOSAURUS_SPAWN_EGG = ITEMS.register("ouranosaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.OURANOSAURUS,0x065c09, 0x022e04,
                    new Item.Properties()));

    public static final RegistryObject<Item> AVACERATOPS_SPAWN_EGG = ITEMS.register("avaceratops_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.AVACERATOPS,0x04850a, 0xdb9340,
                    new Item.Properties()));

    public static final RegistryObject<Item> BAJADASAURUS_SPAWN_EGG = ITEMS.register("bajadasaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.BAJADASAURUS,0x2b2218, 0x170f07,
                    new Item.Properties()));

    public static final RegistryObject<Item> DEINOCHEIRUS_SPAWN_EGG = ITEMS.register("deinocheirus_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.DEINOCHEIRUS,0x361602, 0x6b3818,
                    new Item.Properties()));

    public static final RegistryObject<Item> ALBERTOSAURUS_SPAWN_EGG = ITEMS.register("albertosaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.ALBERTOSAURUS,0xfcf0cc, 0xe85a2e,
                    new Item.Properties()));

    public static final RegistryObject<Item> PUERTASAURUS_SPAWN_EGG = ITEMS.register("puertasaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.PUERTASAURUS,0x3d312f, 0x917673,
                    new Item.Properties()));

    public static final RegistryObject<Item> TANYSTROPHEUS_SPAWN_EGG = ITEMS.register("tanystropheus_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.TANYSTROPHEUS,0x000000, 0xffffff,
                    new Item.Properties()));

    public static final RegistryObject<Item> SIGILMASSASAURUS_SPAWN_EGG = ITEMS.register("sigilmassasaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.SIGILMASSASAURUS,0x000000, 0xffffff,
                    new Item.Properties()));

    public static final RegistryObject<Item> PLASTER = ITEMS.register("plaster",
            () -> new PlasterItem(new Item.Properties()));

    public static final RegistryObject<Item> ESSENCE = ITEMS.register("essence",
            () -> new EssenceItem(new Item.Properties()));

    public static final RegistryObject<Item> CPU = ITEMS.register("cpu",
            () -> new EssenceItem(new Item.Properties()));

    public static final RegistryObject<Item> DISKETTE = ITEMS.register("diskette",
            () -> new EssenceItem(new Item.Properties()));

    public static final RegistryObject<Item> RAW_MARBLE = ITEMS.register("raw_marble",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRETACEOUS_DISK = ITEMS.register("cretaceous_disk",
            () -> new CretaceousDisk(new Item.Properties()));

    public static final RegistryObject<Item> JURASSIC_DISK = ITEMS.register("jurassic_disk",
            () -> new JurassicDisk(new Item.Properties()));

    public static final RegistryObject<Item> TRIASSIC_DISK = ITEMS.register("triassic_disk",
            () -> new TriassicDisk(new Item.Properties()));

    public static final RegistryObject<Item> PLANT_DISK = ITEMS.register("plant_disk",
            () -> new PlantDisk(new Item.Properties()));

    public static final RegistryObject<Item> TRIASSIC_FOSSIL = ITEMS.register("triassic_fossil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JURASSIC_FOSSIL = ITEMS.register("jurassic_fossil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRETACEOUS_FOSSIL = ITEMS.register("cretaceous_fossil",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLANT_FOSSIL = ITEMS.register("plant_fossil",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALLOSAURUS_DNA = ITEMS.register("allosaurus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> JURAVENATOR_DNA = ITEMS.register("juravenator_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GALLIMIMUS_DNA = ITEMS.register("gallimimus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PROTEROSUCHUS_DNA = ITEMS.register("proterosuchus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> INFERNORAPTOR_DNA = ITEMS.register("infernoraptor_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RUGOPS_DNA = ITEMS.register("rugops_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MEGARAPTOR_DNA = ITEMS.register("megaraptor_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> YUTYRANNUS_DNA = ITEMS.register("yutyrannus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CONODONTA_DNA = ITEMS.register("conodonta_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PTERANODON_DNA = ITEMS.register("pteranodon_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> THERIZINOSAURUS_DNA = ITEMS.register("therizinosaurus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TORVOSAURUS_DNA = ITEMS.register("torvosaurus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> COELACANTH_DNA = ITEMS.register("coelacanth_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CERATOSAURUS_DNA = ITEMS.register("ceratosaurus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> OURANOSAURUS_DNA = ITEMS.register("ouranosaurus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AVACERATOPS_DNA = ITEMS.register("avaceratops_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BAJADASAURUS_DNA = ITEMS.register("bajadasaurus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DEINOCHEIRUS_DNA = ITEMS.register("deinocheirus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ALBERTOSAURUS_DNA = ITEMS.register("albertosaurus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PUERTASAURUS_DNA = ITEMS.register("puertasaurus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TANYSTROPHEUS_DNA = ITEMS.register("tanystropheus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SIGILMASSASAURUS_DNA = ITEMS.register("sigilmassasaurus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TEST_DNA = ITEMS.register("test_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> PETRI_DISH = ITEMS.register("petri_dish",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PETRI_DISH_AGAR = ITEMS.register("petri_dish_agar",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PETRI_DISH_PLANT_CELLS = ITEMS.register("petri_dish_plant_cells",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PLANT_CELLS = ITEMS.register("plant_cells",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BACTERIAS = ITEMS.register("bacterias",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> COKE = ITEMS.register("coke",
            () -> new PreludeFuelItem(new Item.Properties()));
    public static final RegistryObject<Item> LIGNITE = ITEMS.register("lignite",
            () -> new PreludeFuelItem(new Item.Properties()));

    public static final RegistryObject<Item> COAL_DUST = ITEMS.register("coal_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CARBON_FIBRE_PLATE = ITEMS.register("carbon_fibre_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_NUGGETS = ITEMS.register("steel_nuggets",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRAPHITE = ITEMS.register("graphite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NACRE = ITEMS.register("nacre",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEAT_DISSIPATOR = ITEMS.register("heat_dissipator",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SATA = ITEMS.register("sata",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAM = ITEMS.register("ram",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMPUTER_MODULE = ITEMS.register("computer_modules",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMPUTER_SCREEN = ITEMS.register("computer_screen",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GYPSUM_CRYSTAL = ITEMS.register("gypsum_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GYPSUM_POWDER = ITEMS.register("gypsum_powder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHER_BOX = ITEMS.register("crusher_box",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_COGWHEEL = ITEMS.register("steel_cogwheel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MECHANISM = ITEMS.register("mechanism",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOKEN = ITEMS.register("token",
            () -> new TokenItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> GINKGO_NUTS = ITEMS.register("ginkgo_nuts",
            () -> new Item(new Item.Properties().food(ModFoods.GINKGO_NUTS)));

    public static final RegistryObject<Item> RAILGUN = ITEMS.register("railgun",
            () -> new GravityGunItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> COOKSONIA_SPORES = ITEMS.register("cooksonia_spores",
            () -> new ItemNameBlockItem(PreludeBlocks.COOKSONIA_PLANT.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
