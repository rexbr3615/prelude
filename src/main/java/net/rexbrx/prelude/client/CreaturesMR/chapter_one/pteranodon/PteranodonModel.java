package net.rexbrx.prelude.client.CreaturesMR.chapter_one.pteranodon;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.PteranodonEntity;
import software.bernie.geckolib.model.GeoModel;

public class PteranodonModel extends GeoModel<PteranodonEntity> {
    @Override
    public ResourceLocation getAnimationResource(PteranodonEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/pteranodon.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(PteranodonEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/pteranodon.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PteranodonEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/pteranodon.png");
    }

}