package net.rexbrx.prelude.client.CreaturesMR.chapter_one.ceratosaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.CeratosaurusEntity;
import software.bernie.geckolib.model.GeoModel;

public class CeratosaurusModel extends GeoModel<CeratosaurusEntity> {
    @Override
    public ResourceLocation getAnimationResource(CeratosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/allosaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(CeratosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/ceratosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CeratosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/ceratosaurus.png");
    }
}