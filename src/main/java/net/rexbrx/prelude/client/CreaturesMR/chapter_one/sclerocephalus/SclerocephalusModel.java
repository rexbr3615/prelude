package net.rexbrx.prelude.client.CreaturesMR.chapter_one.sclerocephalus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.SclerocephalusEntity;
import software.bernie.geckolib.model.GeoModel;

public class SclerocephalusModel extends GeoModel<SclerocephalusEntity> {
    @Override
    public ResourceLocation getAnimationResource(SclerocephalusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/sclerocephalus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(SclerocephalusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/sclerocephalus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SclerocephalusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/sclerocephalus.png");
    }


}