package net.rexbrx.prelude.client.CreaturesMR.chapter_omega.monolophosaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_omega.MonolophosaurusEntity;
import software.bernie.geckolib.model.GeoModel;

public class MonolophosaurusModel extends GeoModel<MonolophosaurusEntity> {
    @Override
    public ResourceLocation getAnimationResource(MonolophosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/allosaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(MonolophosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/monolophosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MonolophosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/monolophosaurus.png");
    }
}
