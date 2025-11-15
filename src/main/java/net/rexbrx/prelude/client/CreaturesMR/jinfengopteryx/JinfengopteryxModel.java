package net.rexbrx.prelude.client.CreaturesMR.jinfengopteryx;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.JinfengopteryxEntity;
import net.rexbrx.prelude.server.entity.common.JuravenatorEntity;
import software.bernie.geckolib.model.GeoModel;

public class JinfengopteryxModel extends GeoModel<JinfengopteryxEntity> {
    @Override
    public ResourceLocation getAnimationResource(JinfengopteryxEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/jinfengopteryx.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(JinfengopteryxEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/jinfengopteryx.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(JinfengopteryxEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/jinfengopteryx.png");
    }

}