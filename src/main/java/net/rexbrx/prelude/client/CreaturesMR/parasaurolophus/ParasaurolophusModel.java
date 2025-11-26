package net.rexbrx.prelude.client.CreaturesMR.parasaurolophus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.OuranosaurusEntity;
import net.rexbrx.prelude.server.entity.common.ParasaurolophusEntity;
import software.bernie.geckolib.model.GeoModel;

public class ParasaurolophusModel extends GeoModel<ParasaurolophusEntity> {
    @Override
    public ResourceLocation getAnimationResource(ParasaurolophusEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/parasaurolophus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(ParasaurolophusEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/parasaurolophus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ParasaurolophusEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/parasaurolophus.png");
    }
}
