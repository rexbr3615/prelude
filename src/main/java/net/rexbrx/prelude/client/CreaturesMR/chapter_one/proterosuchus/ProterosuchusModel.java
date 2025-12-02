package net.rexbrx.prelude.client.CreaturesMR.chapter_one.proterosuchus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.ProterosuchusEntity;
import software.bernie.geckolib.model.GeoModel;

public class ProterosuchusModel extends GeoModel<ProterosuchusEntity> {
    @Override
    public ResourceLocation getAnimationResource(ProterosuchusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/proterosuchus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(ProterosuchusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/proterosuchus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ProterosuchusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/proterosuchus.png");
    }

}