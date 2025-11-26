package net.rexbrx.prelude.client.CreaturesMR.puertasaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.AvaceratopsEntity;
import net.rexbrx.prelude.server.entity.common.PuertasaurusEntity;
import software.bernie.geckolib.model.GeoModel;

public class PuertasaurusModel extends GeoModel<PuertasaurusEntity> {
    @Override
    public ResourceLocation getAnimationResource(PuertasaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/puerta.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(PuertasaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/puerta.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PuertasaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/puertasaurus.png");
    }
}
