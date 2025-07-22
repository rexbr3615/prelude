package net.rexbrx.prelude.server.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbrx.prelude.prelude;
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

    public static final RegistryObject<Item> PLASTER = ITEMS.register("plaster",
            () -> new PlasterItem(new Item.Properties()));

    public static final RegistryObject<Item> ESSENCE = ITEMS.register("essence",
            () -> new EssenceItem(new Item.Properties()));

    public static final RegistryObject<Item> CPU = ITEMS.register("cpu",
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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
