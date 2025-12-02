package net.rexbrx.prelude.client.CreaturesMR.chapter_one.kentrosaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.KentrosaurusEntity;
import software.bernie.geckolib.model.GeoModel;

public class KentrosaurusModel extends GeoModel<KentrosaurusEntity> {
    @Override
    public ResourceLocation getAnimationResource(KentrosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/parasaurolophus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(KentrosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/kentrosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(KentrosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/kentrosaurus.png");
    }
}
