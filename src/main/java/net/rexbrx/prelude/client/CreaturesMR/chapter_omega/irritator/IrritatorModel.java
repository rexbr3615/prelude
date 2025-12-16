package net.rexbrx.prelude.client.CreaturesMR.chapter_omega.irritator;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_omega.IrritatorEntity;
import software.bernie.geckolib.model.GeoModel;

public class IrritatorModel extends GeoModel<IrritatorEntity> {
    @Override
    public ResourceLocation getAnimationResource(IrritatorEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/allosaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(IrritatorEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/irritator.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IrritatorEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/irritator.png");
    }
}
