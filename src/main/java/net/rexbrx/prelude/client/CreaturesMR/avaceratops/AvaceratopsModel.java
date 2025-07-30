package net.rexbrx.prelude.client.CreaturesMR.avaceratops;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.AvaceratopsEntity;
import net.rexbrx.prelude.server.entity.common.GallimimusEntity;
import software.bernie.geckolib.model.GeoModel;

public class AvaceratopsModel extends GeoModel<AvaceratopsEntity> {
    @Override
    public ResourceLocation getAnimationResource(AvaceratopsEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/avaceratops.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(AvaceratopsEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/avaceratops.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AvaceratopsEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/avaceratops.png");
    }
}
