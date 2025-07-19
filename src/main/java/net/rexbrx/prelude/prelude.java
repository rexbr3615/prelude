package net.rexbrx.prelude;


import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.rexbrx.prelude.server.blocks.ModBlockEntities;
import net.rexbrx.prelude.server.blocks.PreludeBlocks;
import net.rexbrx.prelude.server.entity.EntityInit;
import net.rexbrx.prelude.server.items.ModCreativeModTabs;
import net.rexbrx.prelude.server.items.PreludeItems;
import net.rexbrx.prelude.server.recipes.ModRecipes;
import net.rexbrx.prelude.server.screens.ModMenuTypes;
import org.slf4j.Logger;
import software.bernie.geckolib.GeckoLib;


@Mod(prelude.MODID)
public class prelude
{
    public static final String MODID = "prelude";
    private static final Logger LOGGER = LogUtils.getLogger();

    public prelude() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);
        PreludeItems.register(modEventBus);
        EntityInit.REGISTRY.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);
        PreludeBlocks.register(modEventBus);
        ModRecipes.register(modEventBus);

        GeckoLib.initialize();

        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }

}
