package net.rexbrx.prelude.client.CreaturesMR.chapter_one.argentavis;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.ArgentavisEntity;
import software.bernie.geckolib.model.GeoModel;

public class ArgentavisModel extends GeoModel<ArgentavisEntity> {
    @Override
    public ResourceLocation getAnimationResource(ArgentavisEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/argentavis.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(ArgentavisEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/argentavis.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ArgentavisEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/argentavis.png");
    }
}
