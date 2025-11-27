package net.rexbrx.prelude.server.entity.items;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rexbrx.prelude.prelude;

public class PreludeItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(prelude.MODID);

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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
