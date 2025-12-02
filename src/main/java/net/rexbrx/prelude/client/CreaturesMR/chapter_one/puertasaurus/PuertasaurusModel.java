package net.rexbrx.prelude.client.CreaturesMR.chapter_one.puertasaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.PuertasaurusEntity;
import software.bernie.geckolib.model.GeoModel;

public class PuertasaurusModel extends GeoModel<PuertasaurusEntity> {
    @Override
    public ResourceLocation getAnimationResource(PuertasaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/puerta.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(PuertasaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/puerta.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PuertasaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/puertasaurus.png");
    }
}
