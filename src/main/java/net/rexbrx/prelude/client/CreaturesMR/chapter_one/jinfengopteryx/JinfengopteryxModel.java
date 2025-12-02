package net.rexbrx.prelude.client.CreaturesMR.chapter_one.jinfengopteryx;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.JinfengopteryxEntity;
import software.bernie.geckolib.model.GeoModel;

public class JinfengopteryxModel extends GeoModel<JinfengopteryxEntity> {
    @Override
    public ResourceLocation getAnimationResource(JinfengopteryxEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/jinfengopteryx.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(JinfengopteryxEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/jinfengopteryx.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(JinfengopteryxEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/jinfengopteryx.png");
    }

}