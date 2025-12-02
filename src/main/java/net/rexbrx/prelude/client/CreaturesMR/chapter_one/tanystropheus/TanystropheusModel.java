package net.rexbrx.prelude.client.CreaturesMR.chapter_one.tanystropheus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.TanystropheusEntity;
import software.bernie.geckolib.model.GeoModel;

public class TanystropheusModel extends GeoModel<TanystropheusEntity> {
    @Override
    public ResourceLocation getAnimationResource(TanystropheusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/tany.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(TanystropheusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/tany.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TanystropheusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/tanystropheus.png");
    }

}