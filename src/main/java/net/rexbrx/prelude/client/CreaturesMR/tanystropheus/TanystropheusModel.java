package net.rexbrx.prelude.client.CreaturesMR.tanystropheus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.RugopsEntity;
import net.rexbrx.prelude.server.entity.common.TanystropheusEntity;
import software.bernie.geckolib.model.GeoModel;

public class TanystropheusModel extends GeoModel<TanystropheusEntity> {
    @Override
    public ResourceLocation getAnimationResource(TanystropheusEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/tany.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(TanystropheusEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/tany.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TanystropheusEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/tanystropheus.png");
    }

}