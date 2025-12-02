package net.rexbrx.prelude.client.CreaturesMR.chapter_one.torvosaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.TorvosaurusEntity;
import software.bernie.geckolib.model.GeoModel;

public class TorvosaurusModel extends GeoModel<TorvosaurusEntity> {
    @Override
    public ResourceLocation getAnimationResource(TorvosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/allosaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(TorvosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/torvosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TorvosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/torvosaurus.png");
    }
}