package net.rexbrx.prelude.client.CreaturesMR.ouranosaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.OuranosaurusEntity;
import software.bernie.geckolib.model.GeoModel;

public class OuranosaurusModel extends GeoModel<OuranosaurusEntity> {
    @Override
    public ResourceLocation getAnimationResource(OuranosaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/ouranosaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(OuranosaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/ouranosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(OuranosaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/ouranosaurus.png");
    }
}
