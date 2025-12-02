package net.rexbrx.prelude.client.CreaturesMR.chapter_one.coelacanth.blue;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.BlueCoelacanthEntity;
import software.bernie.geckolib.model.GeoModel;

public class BlueCoelacanthModel extends GeoModel<BlueCoelacanthEntity> {
    @Override
    public ResourceLocation getAnimationResource(BlueCoelacanthEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/coelacanth.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(BlueCoelacanthEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/coelacanth.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BlueCoelacanthEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/coelacanth02.png");
    }
}