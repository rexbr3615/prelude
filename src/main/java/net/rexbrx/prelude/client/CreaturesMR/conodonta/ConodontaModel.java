package net.rexbrx.prelude.client.CreaturesMR.conodonta;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.BlueCoelacanthEntity;
import net.rexbrx.prelude.server.entity.common.ConodontaEntity;
import software.bernie.geckolib.model.GeoModel;

public class ConodontaModel extends GeoModel<ConodontaEntity> {
    @Override
    public ResourceLocation getAnimationResource(ConodontaEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/conodonta.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(ConodontaEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/conodonta.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ConodontaEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/conodonta.png");
    }
}