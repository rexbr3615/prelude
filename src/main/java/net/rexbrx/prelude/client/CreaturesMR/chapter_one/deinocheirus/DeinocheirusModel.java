package net.rexbrx.prelude.client.CreaturesMR.chapter_one.deinocheirus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.DeinocheirusEntity;
import software.bernie.geckolib.model.GeoModel;

public class DeinocheirusModel extends GeoModel<DeinocheirusEntity> {
    @Override
    public ResourceLocation getAnimationResource(DeinocheirusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/deinocheirus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(DeinocheirusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/deinocheirus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DeinocheirusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/deinocheirus.png");
    }
}