package net.rexbrx.prelude.client.CreaturesMR.chapter_one.allosaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.AllosaurusEntity;
import software.bernie.geckolib.model.GeoModel;

public class AllosaurusModel extends GeoModel<AllosaurusEntity> {
    @Override
    public ResourceLocation getAnimationResource(AllosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/allosaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(AllosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/allosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AllosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/allosaurs.png");
    }
}
