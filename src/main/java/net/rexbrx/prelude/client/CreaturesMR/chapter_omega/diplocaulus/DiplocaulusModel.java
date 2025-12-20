package net.rexbrx.prelude.client.CreaturesMR.chapter_omega.diplocaulus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_omega.DiplocaulusEntity;
import net.rexbrx.prelude.server.entity.common.chapter_one.SclerocephalusEntity;
import software.bernie.geckolib.model.GeoModel;

public class DiplocaulusModel extends GeoModel<DiplocaulusEntity> {
    @Override
    public ResourceLocation getAnimationResource(DiplocaulusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/sclerocephalus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(DiplocaulusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/diplocaulus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DiplocaulusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/diplocaulus.png");
    }


}
