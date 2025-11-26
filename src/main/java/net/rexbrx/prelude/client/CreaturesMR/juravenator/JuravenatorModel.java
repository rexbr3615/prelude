package net.rexbrx.prelude.client.CreaturesMR.juravenator;

import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.JuravenatorEntity;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationProcessor;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;

public class JuravenatorModel extends GeoModel<JuravenatorEntity> {
    @Override
    public ResourceLocation getAnimationResource(JuravenatorEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/juravenatorv4.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(JuravenatorEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/juravenatorv3.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(JuravenatorEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/juravenator.png");
    }

}
