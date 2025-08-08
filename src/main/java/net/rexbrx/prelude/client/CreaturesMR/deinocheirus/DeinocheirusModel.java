package net.rexbrx.prelude.client.CreaturesMR.deinocheirus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.DeinocheirusEntity;
import software.bernie.geckolib.model.GeoModel;

public class DeinocheirusModel extends GeoModel<DeinocheirusEntity> {
    @Override
    public ResourceLocation getAnimationResource(DeinocheirusEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/deinocheirus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(DeinocheirusEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/deinocheirus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DeinocheirusEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/deinocheirus.png");
    }
}