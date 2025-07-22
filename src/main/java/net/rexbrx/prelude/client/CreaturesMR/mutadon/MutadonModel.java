package net.rexbrx.prelude.client.CreaturesMR.mutadon;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.MutadonEntity;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;

public class MutadonModel extends GeoModel<MutadonEntity> {
    @Override
    public ResourceLocation getAnimationResource(MutadonEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/mutadon.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(MutadonEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/mutadon.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MutadonEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/mutadon.png");
    }

    @Override
    public void setCustomAnimations(MutadonEntity entity, long uniqueID, AnimationState<MutadonEntity> animationState) {
        super.setCustomAnimations(entity, uniqueID, animationState);

        // Obtenha os ossos da cauda
        CoreGeoBone tail1 = this.getAnimationProcessor().getBone("bone");
        CoreGeoBone tail2 = this.getAnimationProcessor().getBone("bone1");
        CoreGeoBone tail3 = this.getAnimationProcessor().getBone("bone2");
        CoreGeoBone tail4 = this.getAnimationProcessor().getBone("bone3");
        CoreGeoBone tail5 = this.getAnimationProcessor().getBone("bone4");
        CoreGeoBone tail6 = this.getAnimationProcessor().getBone("bone5");

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
