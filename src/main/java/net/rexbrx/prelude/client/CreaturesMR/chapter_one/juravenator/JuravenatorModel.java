package net.rexbrx.prelude.client.CreaturesMR.chapter_one.juravenator;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.JuravenatorEntity;
import software.bernie.geckolib.model.GeoModel;

public class JuravenatorModel extends GeoModel<JuravenatorEntity> {
    @Override
    public ResourceLocation getAnimationResource(JuravenatorEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/juravenatorv4.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(JuravenatorEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/juravenatorv3.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(JuravenatorEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/juravenator.png");
    }

}
