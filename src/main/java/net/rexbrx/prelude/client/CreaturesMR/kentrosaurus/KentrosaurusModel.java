package net.rexbrx.prelude.client.CreaturesMR.kentrosaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.KentrosaurusEntity;
import net.rexbrx.prelude.server.entity.common.ParasaurolophusEntity;
import software.bernie.geckolib.model.GeoModel;

public class KentrosaurusModel extends GeoModel<KentrosaurusEntity> {
    @Override
    public ResourceLocation getAnimationResource(KentrosaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/parasaurolophus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(KentrosaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/kentrosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(KentrosaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/kentrosaurus.png");
    }
}
