package net.rexbrx.prelude.client.CreaturesMR.chapter_one.bajadasaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.BajadasaurusEntity;
import software.bernie.geckolib.model.GeoModel;

public class BajadasaurusModel extends GeoModel<BajadasaurusEntity> {
    @Override
    public ResourceLocation getAnimationResource(BajadasaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/bajadassaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(BajadasaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/bajadassaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BajadasaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/bajadassaurus.png");
    }
}
