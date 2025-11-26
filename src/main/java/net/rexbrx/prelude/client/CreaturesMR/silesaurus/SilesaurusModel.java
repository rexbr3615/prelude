package net.rexbrx.prelude.client.CreaturesMR.silesaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.DryosaurusEntity;
import net.rexbrx.prelude.server.entity.common.SilesaurusEntity;
import software.bernie.geckolib.model.GeoModel;

public class SilesaurusModel extends GeoModel<SilesaurusEntity> {
    @Override
    public ResourceLocation getAnimationResource(SilesaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/silesaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(SilesaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/silesaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SilesaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/silesaurus.png");
    }
}
