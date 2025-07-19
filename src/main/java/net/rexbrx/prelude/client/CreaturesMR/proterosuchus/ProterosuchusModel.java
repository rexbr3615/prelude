package net.rexbrx.prelude.client.CreaturesMR.proterosuchus;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.ProterosuchusEntity;
import net.rexbrx.prelude.server.entity.common.RugopsEntity;
import software.bernie.geckolib.model.GeoModel;

public class ProterosuchusModel extends GeoModel<ProterosuchusEntity> {
    @Override
    public ResourceLocation getAnimationResource(ProterosuchusEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/proterosuchus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(ProterosuchusEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/proterosuchus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ProterosuchusEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/proterosuchus.png");
    }

}