package net.rexbrx.prelude.server.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.blocks.PreludeBlocks;
import net.rexbrx.prelude.server.entity.EntityInit;
import net.rexbrx.prelude.server.items.common.*;

public class PreludeItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(prelude.MODID);

    public static final DeferredItem<Item> PIPE_STATE_CHANGER = ITEMS.register("pipe_wrench",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DISC_DRIVE = ITEMS.register("diskdrive",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NUCLEOTIDES = ITEMS.register("nucleotides",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DNA_NUCLEOTIDES = ITEMS.register("dna_nucleotides",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> WIRE = ITEMS.register("wire",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NUTRIENTS = ITEMS.register("nutrients",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TINTED_ROD = ITEMS.register("covered_rod",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> FLARE = ITEMS.register("flare",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SYRINGE = ITEMS.register("syringe",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> AGAR = ITEMS.register("agar",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TEST_TUBE = ITEMS.register("test_tube",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> JURAVENATOR_SPAWN_EGG = ITEMS.register("juravenator_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.JURAVENATOR,0x4d2817, 0x946c5a,
                    new Item.Properties()));

    public static final DeferredItem<Item> ALLOSAURUS_SPAWN_EGG = ITEMS.register("allosaurus_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.ALLOSAURUS,0xf56942, 0xfff9f7,
                    new Item.Properties()));

    public static final DeferredItem<Item> GALLIMIMUS_SPAWN_EGG = ITEMS.register("gallimimus_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.GALLIMIMUS,0x1a0e0e, 0xff8f8f,
                    new Item.Properties()));

    public static final DeferredItem<Item> RUGOPS_SPAWN_EGG = ITEMS.register("rugops_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.RUGOPS,0x0a3b01, 0x93e883,
                    new Item.Properties()));

    public static final DeferredItem<Item> PROTEROSUCHUS_SPAWN_EGG = ITEMS.register("proterosuchus_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.PROTEROSUCHUS,0x202020, 0xf15b0f,
                    new Item.Properties()));

    public static final DeferredItem<Item> MEGARAPTOR_SPAWN_EGG = ITEMS.register("megaraptor_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.MEGARAPTOR,0x0f0b0b, 0x484343,
                    new Item.Properties()));

    public static final DeferredItem<Item> YUTYRANNUS_SPAWN_EGG = ITEMS.register("yutyrannus_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.YUTYRANNUS,0xffffff, 0x696ee4,
                    new Item.Properties()));

    public static final DeferredItem<Item> BLUE_COELACANTH_SPAWN_EGG = ITEMS.register("blue_coelacanth_spawn",
            () -> new DeferredSpawnEggItem(EntityInit.BLUE_COELACANTH,0xffffff, 0xffffff,
                    new Item.Properties()));

    public static final DeferredItem<Item> CONODONTA_SPAWN_EGG = ITEMS.register("conodonta_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.CONODONTA,0xffffff, 0xffffff,
                    new Item.Properties()));

    public static final DeferredItem<Item> PTERANODON_SPAWN_EGG = ITEMS.register("pteranodon_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.PTERANODON,0xebc934, 0xdeca71,
                    new Item.Properties()));

    public static final DeferredItem<Item> THERIZINOSAURUS_SPAWN_EGG = ITEMS.register("therizinosaurus_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.THERIZINOSAURUS,0x212121, 0x5e5353,
                    new Item.Properties()));

    public static final DeferredItem<Item> TORVOSAURUS_SPAWN_EGG = ITEMS.register("torvosaurus_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.TORVOSAURUS,0x420006, 0x8a0a14,
                    new Item.Properties()));

    public static final DeferredItem<Item> MUTADON_SPAWN_EGG = ITEMS.register("mutadon_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.MUTADON,0x30302c, 0x7d7a6d,
                    new Item.Properties()));

    public static final DeferredItem<Item> CERATOSAURUS_SPAWN_EGG = ITEMS.register("ceratosaurus_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.CERATOSAURUS,0xf7b76d, 0xe6e6aa,
                    new Item.Properties()));

    public static final DeferredItem<Item> OURANOSAURUS_SPAWN_EGG = ITEMS.register("ouranosaurus_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.OURANOSAURUS,0x065c09, 0x022e04,
                    new Item.Properties()));

    public static final DeferredItem<Item> AVACERATOPS_SPAWN_EGG = ITEMS.register("avaceratops_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.AVACERATOPS,0x04850a, 0xdb9340,
                    new Item.Properties()));

    public static final DeferredItem<Item> BAJADASAURUS_SPAWN_EGG = ITEMS.register("bajadasaurus_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.BAJADASAURUS,0x2b2218, 0x170f07,
                    new Item.Properties()));

    public static final DeferredItem<Item> DEINOCHEIRUS_SPAWN_EGG = ITEMS.register("deinocheirus_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.DEINOCHEIRUS,0x361602, 0x6b3818,
                    new Item.Properties()));

    public static final DeferredItem<Item> ALBERTOSAURUS_SPAWN_EGG = ITEMS.register("albertosaurus_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.ALBERTOSAURUS,0xfcf0cc, 0xe85a2e,
                    new Item.Properties()));

    public static final DeferredItem<Item> PUERTASAURUS_SPAWN_EGG = ITEMS.register("puertasaurus_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.PUERTASAURUS,0x3d312f, 0x917673,
                    new Item.Properties()));

    public static final DeferredItem<Item> TANYSTROPHEUS_SPAWN_EGG = ITEMS.register("tanystropheus_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.TANYSTROPHEUS,0x000000, 0xffffff,
                    new Item.Properties()));

    public static final DeferredItem<Item> SIGILMASSASAURUS_SPAWN_EGG = ITEMS.register("sigilmassasaurus_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.SIGILMASSASAURUS,0x401909, 0x6e3117,
                    new Item.Properties()));

    public static final DeferredItem<Item> ORODROMEUS_SPAWN_EGG = ITEMS.register("orodromeus_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.ORODROMEUS,0x080300, 0x291001,
                    new Item.Properties()));

    public static final DeferredItem<Item> DRYOSAURUS_SPAWN_EGG = ITEMS.register("dryosaurus_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.DRYOSAURUS,0x1c9416, 0x022400,
                    new Item.Properties()));

    public static final DeferredItem<Item> SILESAURUS_SPAWN_EGG = ITEMS.register("silesaurus_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.SILESAURUS,0xe8e8e8, 0x6e6e6e,
                    new Item.Properties()));

    public static final DeferredItem<Item> AUSTRORAPTOR_SPAWN_EGG = ITEMS.register("austroraptor_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.AUSTRORAPTOR,0x6b3818, 0x6e6e6e,
                    new Item.Properties()));

    public static final DeferredItem<Item> PARASAUROLOPHUS_SPAWN_EGG = ITEMS.register("parasaurolophus_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.PARASAUROLOPHUS,0x536953, 0x748774,
                    new Item.Properties()));

    public static final DeferredItem<Item> SCLEROCEPHALUS_SPAWN_EGG = ITEMS.register("sclerocephalus_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.SCLEROCEPHALUS,0x949da8, 0xc8d2de,
                    new Item.Properties()));

    public static final DeferredItem<Item> KENTROSAURUS_SPAWN_EGG = ITEMS.register("kentrosaurus_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.KENTROSAURUS,0xf7dec3, 0xb88c5c,
                    new Item.Properties()));

    public static final DeferredItem<Item> SIATS_SPAWN_EGG = ITEMS.register("siats_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.SIATS,0x073604, 0x175c13,
                    new Item.Properties()));

    public static final DeferredItem<Item> JINFENGOPTERYX_SPAWN_EGG = ITEMS.register("jinfengopteryx_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.JINFENGOPTERYX,0x9e603f, 0x362116,
                    new Item.Properties()));

    public static final DeferredItem<Item> CLADOSELACHE_SPAWN_EGG = ITEMS.register("cladoselache_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.CLADOSELACHE,0xffffff, 0xffffff,
                    new Item.Properties()));

    public static final DeferredItem<Item> ARGENTAVIS_SPAWN_EGG = ITEMS.register("argentavis_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.ARGENTAVIS,0x69270f, 0xed4305,
                    new Item.Properties()));

    public static final DeferredItem<Item> IRRITATOR_SPAWN_EGG = ITEMS.register("irritator_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.IRRITATOR,0x10470e, 0x23d963,
                    new Item.Properties()));

    public static final DeferredItem<Item> MONOLOPHOSAURUS_SPAWN_EGG = ITEMS.register("monolophosaurus_spawn_egg",
            () -> new DeferredSpawnEggItem(EntityInit.MONOLOPHOSAURUS,0x356E34, 0xf73105,
                    new Item.Properties()));



    public static final DeferredItem<Item> PLASTER = ITEMS.register("plaster",
            () -> new PlasterItem(new Item.Properties()));

    public static final DeferredItem<Item> ESSENCE = ITEMS.register("essence",
            () -> new EssenceItem(new Item.Properties()));

    public static final DeferredItem<Item> CPU = ITEMS.register("cpu",
            () -> new EssenceItem(new Item.Properties()));

    public static final DeferredItem<Item> DISKETTE = ITEMS.register("diskette",
            () -> new EssenceItem(new Item.Properties()));

    public static final DeferredItem<Item> RAW_MARBLE = ITEMS.register("raw_marble",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CRETACEOUS_DISK = ITEMS.register("cretaceous_disk",
            () -> new CretaceousDisk(new Item.Properties()));
    public static final DeferredItem<Item> JURASSIC_DISK = ITEMS.register("jurassic_disk",
            () -> new JurassicDisk(new Item.Properties()));
    public static final DeferredItem<Item> TRIASSIC_DISK = ITEMS.register("triassic_disk",
            () -> new TriassicDisk(new Item.Properties()));
    public static final DeferredItem<Item> PERMIAN_DISK = ITEMS.register("permian_disk",
            () -> new PermianDisk(new Item.Properties()));
    public static final DeferredItem<Item> DEVONIAN_DISK = ITEMS.register("devonian_disk",
            () -> new DevonianDisk(new Item.Properties()));

    public static final DeferredItem<Item> PLANT_DISK = ITEMS.register("plant_disk",
            () -> new PlantDisk(new Item.Properties()));

    public static final DeferredItem<Item> DEVONIAN_FOSSIL = ITEMS.register("devonian_fossil",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PERMIAN_FOSSIL = ITEMS.register("permian_fossil",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TRIASSIC_FOSSIL = ITEMS.register("triassic_fossil",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> JURASSIC_FOSSIL = ITEMS.register("jurassic_fossil",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRETACEOUS_FOSSIL = ITEMS.register("cretaceous_fossil",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PLANT_FOSSIL = ITEMS.register("plant_fossil",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ALLOSAURUS_DNA = ITEMS.register("allosaurus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> JURAVENATOR_DNA = ITEMS.register("juravenator_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> GALLIMIMUS_DNA = ITEMS.register("gallimimus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> PROTEROSUCHUS_DNA = ITEMS.register("proterosuchus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> INFERNORAPTOR_DNA = ITEMS.register("infernoraptor_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> RUGOPS_DNA = ITEMS.register("rugops_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> MEGARAPTOR_DNA = ITEMS.register("megaraptor_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> YUTYRANNUS_DNA = ITEMS.register("yutyrannus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> CONODONTA_DNA = ITEMS.register("conodonta_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> PTERANODON_DNA = ITEMS.register("pteranodon_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> THERIZINOSAURUS_DNA = ITEMS.register("therizinosaurus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> TORVOSAURUS_DNA = ITEMS.register("torvosaurus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> COELACANTH_DNA = ITEMS.register("coelacanth_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> CERATOSAURUS_DNA = ITEMS.register("ceratosaurus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> OURANOSAURUS_DNA = ITEMS.register("ouranosaurus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> AVACERATOPS_DNA = ITEMS.register("avaceratops_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> BAJADASAURUS_DNA = ITEMS.register("bajadasaurus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> DEINOCHEIRUS_DNA = ITEMS.register("deinocheirus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> ALBERTOSAURUS_DNA = ITEMS.register("albertosaurus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> PUERTASAURUS_DNA = ITEMS.register("puertasaurus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> TANYSTROPHEUS_DNA = ITEMS.register("tanystropheus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> SIGILMASSASAURUS_DNA = ITEMS.register("sigilmassasaurus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> MUTADON_DNA = ITEMS.register("mutadon_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> ORODROMEUS_DNA = ITEMS.register("orodromeus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> DRYOSAURUS_DNA = ITEMS.register("dryosaurus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> SILESAURUS_DNA = ITEMS.register("silesaurus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> AUSTRORAPTOR_DNA = ITEMS.register("austroraptor_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> PARASAUROLOPHUS_DNA = ITEMS.register("parasaurolophus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> SCLEROCEPHALUS_DNA = ITEMS.register("sclerocephalus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> KENTROSAURUS_DNA = ITEMS.register("kentrosaurus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> SIATS_DNA = ITEMS.register("siats_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> JINFENGOPTERYX_DNA = ITEMS.register("jinfengopteryx_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> CLADOSELACHE_DNA = ITEMS.register("cladoselache_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> ARGENTAVIS_DNA = ITEMS.register("argentavis_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> IRRITATOR_DNA = ITEMS.register("irritator_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> MONOLOPHOSAURUS_DNA = ITEMS.register("monolophosaurus_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> TEST_DNA = ITEMS.register("test_dna",
            () -> new ItemDNA(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> PETRI_DISH = ITEMS.register("petri_dish",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> PETRI_DISH_AGAR = ITEMS.register("petri_dish_agar",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> PETRI_DISH_PLANT_CELLS = ITEMS.register("petri_dish_plant_cells",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> PLANT_CELLS = ITEMS.register("plant_cells",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> BACTERIAS = ITEMS.register("bacterias",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> COKE = ITEMS.register("coke",
            () -> new PreludeFuelItem(new Item.Properties()));
    public static final DeferredItem<Item> LIGNITE = ITEMS.register("lignite",
            () -> new PreludeFuelItem(new Item.Properties()));

    public static final DeferredItem<Item> BITUMEN = ITEMS.register("bitumen",
            () -> new PreludeFuelItem(new Item.Properties()));
    public static final DeferredItem<Item> BITUMEN_NUGGET = ITEMS.register("bitumen_nugget",
            () -> new PreludeFuelItem(new Item.Properties()));

    public static final DeferredItem<Item> COAL_DUST = ITEMS.register("coal_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CARBON_FIBRE_PLATE = ITEMS.register("carbon_fibre_plate",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_NUGGETS = ITEMS.register("steel_nuggets",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GRAPHITE = ITEMS.register("graphite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NACRE = ITEMS.register("nacre",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HEAT_DISSIPATOR = ITEMS.register("heat_dissipator",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SATA = ITEMS.register("sata",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAM = ITEMS.register("ram",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COMPUTER_MODULE = ITEMS.register("computer_modules",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COMPUTER_SCREEN = ITEMS.register("computer_screen",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GYPSUM_CRYSTAL = ITEMS.register("gypsum_crystal",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GYPSUM_POWDER = ITEMS.register("gypsum_powder",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRUSHER_BOX = ITEMS.register("crusher_box",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_COGWHEEL = ITEMS.register("steel_cogwheel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MECHANISM = ITEMS.register("mechanism",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TOKEN = ITEMS.register("token",
            () -> new TokenItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> HYBRIDIZER = ITEMS.register("hybridizer",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> GINKGO_NUTS = ITEMS.register("ginkgo_nuts",
            () -> new Item(new Item.Properties().food(ModFoods.GINKGO_NUTS)));

    //public static final DeferredItem<Item> RAILGUN = ITEMS.register("railgun",
    //        () -> new GravityGunItem(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> COOKSONIA_SPORES = ITEMS.register("cooksonia_spores",
            () -> new ItemNameBlockItem(PreludeBlocks.COOKSONIA_PLANT.get(), new Item.Properties()));




    
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
