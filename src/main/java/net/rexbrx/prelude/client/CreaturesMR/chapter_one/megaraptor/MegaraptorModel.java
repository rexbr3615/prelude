package net.rexbrx.prelude.client.CreaturesMR.chapter_one.megaraptor;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.MegaraptorEntity;
import software.bernie.geckolib.model.GeoModel;

public class MegaraptorModel extends GeoModel<MegaraptorEntity> {
    @Override
    public ResourceLocation getAnimationResource(MegaraptorEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/allosaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(MegaraptorEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/megaraptor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MegaraptorEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/megaraptor.png");
    }

}