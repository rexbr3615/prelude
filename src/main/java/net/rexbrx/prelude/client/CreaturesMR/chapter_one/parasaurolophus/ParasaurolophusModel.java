package net.rexbrx.prelude.client.CreaturesMR.chapter_one.parasaurolophus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.ParasaurolophusEntity;
import software.bernie.geckolib.model.GeoModel;

public class ParasaurolophusModel extends GeoModel<ParasaurolophusEntity> {
    @Override
    public ResourceLocation getAnimationResource(ParasaurolophusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/parasaurolophus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(ParasaurolophusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/parasaurolophus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ParasaurolophusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/parasaurolophus.png");
    }
}
