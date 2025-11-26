package net.rexbrx.prelude.client.CreaturesMR.austroraptor;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.AustroraptorEntity;
import software.bernie.geckolib.model.GeoModel;

public class AustroraptorModel extends GeoModel<AustroraptorEntity> {
    @Override
    public ResourceLocation getAnimationResource(AustroraptorEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/austroraptor.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(AustroraptorEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/austroraptor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AustroraptorEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/austroraptor.png");
    }
}
