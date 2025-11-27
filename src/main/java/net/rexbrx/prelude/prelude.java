package net.rexbrx.prelude;

import net.rexbrx.prelude.server.entity.EntityInit;
import net.rexbrx.prelude.server.entity.items.PreludeItems;
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

        PreludeItems.register(modEventBus);
        EntityInit.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("Prelude!");
    }
}
