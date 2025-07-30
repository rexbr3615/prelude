package net.rexbrx.prelude.client.CreaturesMR.torvosaurus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.TherizinosaurusEntity;
import net.rexbrx.prelude.server.entity.common.TorvosaurusEntity;
import net.rexbrx.prelude.server.entity.common.YutyrannusEntity;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;

public class TorvosaurusModel extends GeoModel<TorvosaurusEntity> {
    @Override
    public ResourceLocation getAnimationResource(TorvosaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/allosaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(TorvosaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/torvosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TorvosaurusEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/torvosaurus.png");
    }
}