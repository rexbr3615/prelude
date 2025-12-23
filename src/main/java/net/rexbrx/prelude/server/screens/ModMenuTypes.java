package net.rexbrx.prelude.server.screens;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.network.IContainerFactory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.screens.menu.*;


public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(Registries.MENU, prelude.MODID);


    public static final DeferredHolder<MenuType<?>, MenuType<AnalyzerMenu>> ANALYZER_MENU =
            registerMenuType("analyzer_menu", AnalyzerMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<VatMenu>> VAT_MENU =
            registerMenuType("vat_menu", VatMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<CrusherMenu>> CRUSHER_MENU =
            registerMenuType("crusher_menu", CrusherMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<IncubatorMenu>> INCUBATOR_MENU =
            registerMenuType("incubator_menu", IncubatorMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<IndustrialCrusherMenu>> INDUSTRIAL_CRUSHER_MENU =
            registerMenuType("industrial_crusher_menu", IndustrialCrusherMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<GeneratorMenu>> GENERATOR_MENU =
            registerMenuType("generator_menu", GeneratorMenu::new);




    private static <T extends AbstractContainerMenu>DeferredHolder<MenuType<?>, MenuType<T>> registerMenuType(String name,
                                                                                                              IContainerFactory<T> factory) {
        return MENUS.register(name, () -> IMenuTypeExtension.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
