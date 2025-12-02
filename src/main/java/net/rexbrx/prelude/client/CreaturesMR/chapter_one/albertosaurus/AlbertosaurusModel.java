package net.rexbrx.prelude.client.CreaturesMR.chapter_one.albertosaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.AlbertosaurusEntity;
import software.bernie.geckolib.model.GeoModel;

public class AlbertosaurusModel extends GeoModel<AlbertosaurusEntity> {
    @Override
    public ResourceLocation getAnimationResource(AlbertosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/albertosaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(AlbertosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/albertosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AlbertosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/albertosaurus.png");
    }
}
