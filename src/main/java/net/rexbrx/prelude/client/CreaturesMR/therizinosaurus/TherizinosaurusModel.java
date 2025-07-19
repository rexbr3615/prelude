package net.rexbrx.prelude.client.CreaturesMR.therizinosaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.AllosaurusEntity;
import net.rexbrx.prelude.server.entity.common.TherizinosaurusEntity;
import software.bernie.geckolib.model.GeoModel;

public class TherizinosaurusModel extends GeoModel<TherizinosaurusEntity> {
    @Override
    public ResourceLocation getAnimationResource(TherizinosaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/therizinosaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(TherizinosaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/therizinosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TherizinosaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/therizinosaurus.png");
    }
}