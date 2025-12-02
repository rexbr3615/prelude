package net.rexbrx.prelude.client.CreaturesMR.chapter_one.sigilmassasaurus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.SigilmassasaurusEntity;
import software.bernie.geckolib.model.GeoModel;

public class SigilmassasaurusModel extends GeoModel<SigilmassasaurusEntity> {
    @Override
    public ResourceLocation getAnimationResource(SigilmassasaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/allosaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(SigilmassasaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/sigilmassasaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SigilmassasaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/sigilmassasaurus.png");
    }



}