package net.rexbrx.prelude.client.CreaturesMR.gallimimus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.AllosaurusEntity;
import net.rexbrx.prelude.server.entity.common.GallimimusEntity;
import software.bernie.geckolib.model.GeoModel;

public class GallimimusModel extends GeoModel<GallimimusEntity> {
    @Override
    public ResourceLocation getAnimationResource(GallimimusEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/gallimimus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(GallimimusEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/gallimimus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GallimimusEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/gallimimus.png");
    }
}
