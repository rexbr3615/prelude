package net.rexbrx.prelude.client.CreaturesMR.chapter_one.therizinosaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.chapter_one.TherizinosaurusEntity;
import software.bernie.geckolib.model.GeoModel;

public class TherizinosaurusModel extends GeoModel<TherizinosaurusEntity> {
    @Override
    public ResourceLocation getAnimationResource(TherizinosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "animations/therizinosaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(TherizinosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "geo/therizinosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TherizinosaurusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(prelude.MODID, "textures/dinosaurs/therizinosaurus.png");
    }
}