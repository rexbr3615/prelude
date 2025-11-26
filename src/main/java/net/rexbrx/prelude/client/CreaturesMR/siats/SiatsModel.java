package net.rexbrx.prelude.client.CreaturesMR.siats;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.AllosaurusEntity;
import net.rexbrx.prelude.server.entity.common.SiatsEntity;
import software.bernie.geckolib.model.GeoModel;

public class SiatsModel extends GeoModel<SiatsEntity> {
    @Override
    public ResourceLocation getAnimationResource(SiatsEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/allosaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(SiatsEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/siats.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SiatsEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/siats.png");
    }
}
