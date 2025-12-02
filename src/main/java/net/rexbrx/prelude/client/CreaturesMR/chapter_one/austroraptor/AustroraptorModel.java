package net.rexbrx.prelude.client.CreaturesMR.chapter_one.austroraptor;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.AustroraptorEntity;
import software.bernie.geckolib.model.GeoModel;

public class AustroraptorModel extends GeoModel<AustroraptorEntity> {
    @Override
    public ResourceLocation getAnimationResource(AustroraptorEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/austroraptor.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(AustroraptorEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/austroraptor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AustroraptorEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/austroraptor.png");
    }
}
