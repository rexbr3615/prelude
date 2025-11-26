package net.rexbrx.prelude.client.CreaturesMR.argentavis;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.AllosaurusEntity;
import net.rexbrx.prelude.server.entity.common.ArgentavisEntity;
import software.bernie.geckolib.model.GeoModel;

public class ArgentavisModel extends GeoModel<ArgentavisEntity> {
    @Override
    public ResourceLocation getAnimationResource(ArgentavisEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/argentavis.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(ArgentavisEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/argentavis.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ArgentavisEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/argentavis.png");
    }
}
