package net.rexbrx.prelude.client.CreaturesMR.chapter_one.dryosaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.DryosaurusEntity;
import software.bernie.geckolib.model.GeoModel;

public class DryosaurusModel extends GeoModel<DryosaurusEntity> {
    @Override
    public ResourceLocation getAnimationResource(DryosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/allosaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(DryosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/dryosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DryosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/dryosaurus.png");
    }
}