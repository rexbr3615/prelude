package net.rexbrx.prelude.client.CreaturesMR.chapter_one.mutadon;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.MutadonEntity;
import software.bernie.geckolib.model.GeoModel;

public class MutadonModel extends GeoModel<MutadonEntity> {
    @Override
    public ResourceLocation getAnimationResource(MutadonEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/mutadon.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(MutadonEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/mutadon.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MutadonEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/mutadon.png");
    }



}
