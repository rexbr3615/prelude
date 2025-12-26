package net.rexbrx.prelude.client.CreaturesMR.chapter_omega.tiktaalik;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_omega.TiktaalikEntity;
import software.bernie.geckolib.model.GeoModel;

public class TiktaalikModel extends GeoModel<TiktaalikEntity> {
    @Override
    public ResourceLocation getAnimationResource(TiktaalikEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/tiktaalik.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(TiktaalikEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/tiktaalik.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TiktaalikEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/tiktaalik.png");
    }


}
