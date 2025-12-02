package net.rexbrx.prelude.client.CreaturesMR.chapter_one.rugops;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.RugopsEntity;
import software.bernie.geckolib.model.GeoModel;

public class RugopsModel extends GeoModel<RugopsEntity> {
    @Override
    public ResourceLocation getAnimationResource(RugopsEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/rugops.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(RugopsEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/rugops.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RugopsEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/rugops.png");
    }

}