package net.rexbrx.prelude.client.event;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.rexbrx.prelude.prelude;

@Mod(value = prelude.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = prelude.MODID, value = Dist.CLIENT)
public class PreludeModClient {
}
