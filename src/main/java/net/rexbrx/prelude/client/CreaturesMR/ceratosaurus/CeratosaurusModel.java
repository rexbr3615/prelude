package net.rexbrx.prelude.client.CreaturesMR.ceratosaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.CeratosaurusEntity;
import net.rexbrx.prelude.server.entity.common.TorvosaurusEntity;
import software.bernie.geckolib.model.GeoModel;

public class CeratosaurusModel extends GeoModel<CeratosaurusEntity> {
    @Override
    public ResourceLocation getAnimationResource(CeratosaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/allosaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(CeratosaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/ceratosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CeratosaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/ceratosaurus.png");
    }
}