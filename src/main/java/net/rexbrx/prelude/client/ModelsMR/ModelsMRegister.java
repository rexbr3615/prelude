package net.rexbrx.prelude.client.ModelsMR;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.rexbrx.prelude.client.ModelsMR.industrial.cruser_alt.IndustrialCrusher;
import net.rexbrx.prelude.client.ModelsMR.vat.VatModel;

@EventBusSubscriber(value = {Dist.CLIENT})
public class ModelsMRegister {
    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(VatModel.LAYER_LOCATION, VatModel::createBodyLayer);
        event.registerLayerDefinition(IndustrialCrusher.LAYER_LOCATION, IndustrialCrusher::createBodyLayer);
    }
}