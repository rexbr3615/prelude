package net.rexbrx.prelude.client.CreaturesMR.chapter_one.gallimimus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.GallimimusEntity;
import software.bernie.geckolib.model.GeoModel;

public class GallimimusModel extends GeoModel<GallimimusEntity> {
    @Override
    public ResourceLocation getAnimationResource(GallimimusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/gallimimus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(GallimimusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/gallimimus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GallimimusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/gallimimus.png");
    }
}
