package net.rexbrx.prelude.client.CreaturesMR.chapter_one.silesaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.SilesaurusEntity;
import software.bernie.geckolib.model.GeoModel;

public class SilesaurusModel extends GeoModel<SilesaurusEntity> {
    @Override
    public ResourceLocation getAnimationResource(SilesaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/silesaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(SilesaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/silesaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SilesaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/silesaurus.png");
    }
}
