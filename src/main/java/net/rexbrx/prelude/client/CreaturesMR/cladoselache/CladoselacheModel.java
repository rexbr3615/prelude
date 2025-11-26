package net.rexbrx.prelude.client.CreaturesMR.cladoselache;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.rexbrx.prelude.prelude;
import net.rexbrx.prelude.server.entity.common.BlueCoelacanthEntity;
import net.rexbrx.prelude.server.entity.common.CladoselacheEntity;
import net.rexbrx.prelude.server.entity.common.SclerocephalusEntity;
import net.rexbrx.prelude.server.entity.common.YutyrannusEntity;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;

public class CladoselacheModel extends GeoModel<CladoselacheEntity> {
    @Override
    public ResourceLocation getAnimationResource(CladoselacheEntity entity) {
        return new ResourceLocation(prelude.MODID, "animations/coelacanth.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(CladoselacheEntity entity) {
        return new ResourceLocation(prelude.MODID, "geo/cladoselache.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CladoselacheEntity entity) {
        return new ResourceLocation(prelude.MODID, "textures/dinosaurs/cladoselache.png");
    }

    @Override
    public void setCustomAnimations(CladoselacheEntity entity, long uniqueID, AnimationState<CladoselacheEntity> animationState) {
        super.setCustomAnimations(entity, uniqueID, animationState);

        // Obtenha os ossos da cauda
        CoreGeoBone back1 = this.getAnimationProcessor().getBone("bone");
        CoreGeoBone tail1 = this.getAnimationProcessor().getBone("root3");
        CoreGeoBone tail2 = this.getAnimationProcessor().getBone("bone2");
        CoreGeoBone neck1 = this.getAnimationProcessor().getBone("bone3");

        // Obtenha a rotação da cabeça para a base do movimento
        float netHeadYaw = Mth.clamp(entity.getYRot() - entity.yBodyRot, -45, 45); // Limita pra não girar demais
        float baseYaw = (float) Math.toRadians(-netHeadYaw) * 0.25F;
        float dotYaw = (float) Math.toRadians(netHeadYaw) * 0.25F;

        // Soma com a rotação atual da animação
        if (tail1 != null) tail1.setRotY(tail1.getRotY() + baseYaw);
        if (tail2 != null) tail2.setRotY(tail2.getRotY() + baseYaw);
        if (back1 != null) back1.setRotY(back1.getRotY() + baseYaw);
        if (neck1 != null) neck1.setRotY(neck1.getRotY() + dotYaw);
    }

}