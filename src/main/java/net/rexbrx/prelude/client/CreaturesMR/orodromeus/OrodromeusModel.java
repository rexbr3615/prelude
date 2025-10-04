package net.rexbrx.prelude.client.CreaturesMR.orodromeus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.OrodromeusEntity;
import software.bernie.geckolib.model.GeoModel;

public class OrodromeusModel extends GeoModel<OrodromeusEntity> {
    @Override
    public ResourceLocation getAnimationResource(OrodromeusEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/orodromeus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(OrodromeusEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/orodromeus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(OrodromeusEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/orodromeus.png");
    }
}