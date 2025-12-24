package net.rexbrx.prelude.client.CreaturesMR.chapter_omega.diplodocus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_omega.DiplodocusEntity;
import net.rexbrx.prelude.server.entity.common.chapter_omega.MonolophosaurusEntity;
import software.bernie.geckolib.model.GeoModel;

public class DiplodocusModel extends GeoModel<DiplodocusEntity> {
    @Override
    public ResourceLocation getAnimationResource(DiplodocusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/diplodocus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(DiplodocusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/diplodocus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DiplodocusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/diplodocus.png");
    }
}
