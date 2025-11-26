package net.rexbrx.prelude.client.CreaturesMR.megaraptor;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.MegaraptorEntity;
import net.rexbrx.prelude.server.entity.common.RugopsEntity;
import software.bernie.geckolib.model.GeoModel;

public class MegaraptorModel extends GeoModel<MegaraptorEntity> {
    @Override
    public ResourceLocation getAnimationResource(MegaraptorEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/allosaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(MegaraptorEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/megaraptor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MegaraptorEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/megaraptor.png");
    }

}