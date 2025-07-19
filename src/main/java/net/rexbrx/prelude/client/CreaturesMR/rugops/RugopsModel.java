package net.rexbrx.prelude.client.CreaturesMR.rugops;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.RugopsEntity;
import software.bernie.geckolib.model.GeoModel;

public class RugopsModel extends GeoModel<RugopsEntity> {
    @Override
    public ResourceLocation getAnimationResource(RugopsEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/rugops.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(RugopsEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/rugops.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RugopsEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/rugops.png");
    }

}