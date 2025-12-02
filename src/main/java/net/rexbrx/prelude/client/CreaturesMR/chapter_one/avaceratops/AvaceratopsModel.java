package net.rexbrx.prelude.client.CreaturesMR.chapter_one.avaceratops;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.AvaceratopsEntity;
import software.bernie.geckolib.model.GeoModel;

public class AvaceratopsModel extends GeoModel<AvaceratopsEntity> {
    @Override
    public ResourceLocation getAnimationResource(AvaceratopsEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/avaceratops.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(AvaceratopsEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/avaceratops.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AvaceratopsEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/avaceratops.png");
    }
}
