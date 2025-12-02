package net.rexbrx.prelude.client.CreaturesMR.chapter_one.yutyrannus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.YutyrannusEntity;
import software.bernie.geckolib.model.GeoModel;

public class YutyrannusModel extends GeoModel<YutyrannusEntity> {
    @Override
    public ResourceLocation getAnimationResource(YutyrannusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/allosaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(YutyrannusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/yutyrannus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(YutyrannusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/yutyrannus.png");
    }



}
