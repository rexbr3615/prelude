package net.rexbrx.prelude.client.CreaturesMR.albertosaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.AlbertosaurusEntity;
import software.bernie.geckolib.model.GeoModel;

public class AlbertosaurusModel extends GeoModel<AlbertosaurusEntity> {
    @Override
    public ResourceLocation getAnimationResource(AlbertosaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/albertosaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(AlbertosaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/albertosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AlbertosaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/albertosaurus.png");
    }
}
