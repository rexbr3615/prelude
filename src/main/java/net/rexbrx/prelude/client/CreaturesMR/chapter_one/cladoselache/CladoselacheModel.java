package net.rexbrx.prelude.client.CreaturesMR.chapter_one.cladoselache;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.CladoselacheEntity;
import software.bernie.geckolib.model.GeoModel;

public class CladoselacheModel extends GeoModel<CladoselacheEntity> {
    @Override
    public ResourceLocation getAnimationResource(CladoselacheEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/coelacanth.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(CladoselacheEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/cladoselache.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CladoselacheEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/cladoselache.png");
    }


}