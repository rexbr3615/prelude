package net.rexbrx.prelude.client.ModelsMR;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.rexbrx.prelude.client.ModelsMR.Barrier.BarrierModel;
import net.rexbrx.prelude.client.ModelsMR.Eolic.Modeleolic_generator;
import net.rexbrx.prelude.client.ModelsMR.SharkTeeth.Modelteeth;
import net.rexbrx.prelude.client.ModelsMR.vat.VatModel;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ModelsMRegister {
    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(Modelteeth.LAYER_LOCATION, Modelteeth::createBodyLayer);
        event.registerLayerDefinition(BarrierModel.LAYER_LOCATION, BarrierModel::createBodyLayer);
        event.registerLayerDefinition(Modeleolic_generator.LAYER_LOCATION, Modeleolic_generator::createBodyLayer);
        event.registerLayerDefinition(VatModel.LAYER_LOCATION, VatModel::createBodyLayer);

    }
}