package net.rexbrx.prelude;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(prelude.MODID)
public class prelude {
    public static final String MODID = "prelude";
    public static final Logger LOGGER = LogUtils.getLogger();


    public prelude(IEventBus modEventBus, ModContainer modContainer) {
        NeoForge.EVENT_BUS.register(this);

        //PreludeItems.register(modEventBus);
        //PreludeCreativeModeTabs.register(modEventBus);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("Prelude!");
    }
}
