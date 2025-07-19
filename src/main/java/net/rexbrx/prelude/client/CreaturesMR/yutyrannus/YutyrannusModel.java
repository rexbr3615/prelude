package net.rexbrx.prelude.client.CreaturesMR.yutyrannus;

import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.AllosaurusEntity;
import net.rexbrx.prelude.server.entity.common.YutyrannusEntity;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationProcessor;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;

public class YutyrannusModel extends GeoModel<YutyrannusEntity> {
    @Override
    public ResourceLocation getAnimationResource(YutyrannusEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/allosaurus.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(YutyrannusEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/yutyrannus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(YutyrannusEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/yutyrannus.png");
    }

    @Override
    public void setCustomAnimations(YutyrannusEntity entity, long uniqueID, AnimationState<YutyrannusEntity> animationState) {
        super.setCustomAnimations(entity, uniqueID, animationState);

        // Obtenha os ossos da cauda
        CoreGeoBone tail1 = this.getAnimationProcessor().getBone("tail1");
        CoreGeoBone tail2 = this.getAnimationProcessor().getBone("tail2");
        CoreGeoBone tail3 = this.getAnimationProcessor().getBone("tail3");
        CoreGeoBone tail4 = this.getAnimationProcessor().getBone("tail4");
        CoreGeoBone tail5 = this.getAnimationProcessor().getBone("tail5");
        CoreGeoBone tail6 = this.getAnimationProcessor().getBone("tail6");

        // Obtenha a rotação da cabeça para a base do movimento
        float netHeadYaw = Mth.clamp(entity.getYRot() - entity.yBodyRot, -45, 45); // Limita pra não girar demais
        float baseYaw = (float) Math.toRadians(-netHeadYaw) * 0.2F;


        // Soma com a rotação atual da animação
        if (tail1 != null) tail1.setRotY(tail1.getRotY() + baseYaw);
        if (tail2 != null) tail2.setRotY(tail2.getRotY() + baseYaw);
        if (tail3 != null) tail3.setRotY(tail3.getRotY() + baseYaw);
        if (tail4 != null) tail4.setRotY(tail4.getRotY() + baseYaw);
        if (tail5 != null) tail5.setRotY(tail5.getRotY() + baseYaw);
        if (tail6 != null) tail6.setRotY(tail6.getRotY() + baseYaw);
    }

}
