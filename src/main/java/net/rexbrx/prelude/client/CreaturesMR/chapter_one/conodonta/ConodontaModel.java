package net.rexbrx.prelude.client.CreaturesMR.chapter_one.conodonta;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.ConodontaEntity;
import software.bernie.geckolib.model.GeoModel;

public class ConodontaModel extends GeoModel<ConodontaEntity> {
    @Override
    public ResourceLocation getAnimationResource(ConodontaEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/conodonta.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(ConodontaEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/conodonta.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ConodontaEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/conodonta.png");
    }
}