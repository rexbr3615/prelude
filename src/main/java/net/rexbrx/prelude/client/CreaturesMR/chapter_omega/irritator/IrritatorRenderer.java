package net.rexbrx.prelude.client.CreaturesMR.chapter_omega.irritator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.client.CreaturesMR.chapter_one.allosaurus.AllosaurusModel;
import net.rexbrx.prelude.server.entity.common.chapter_omega.IrritatorEntity;
import net.rexbrx.prelude.server.entity.common.chapter_one.AllosaurusEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class IrritatorRenderer extends GeoEntityRenderer<IrritatorEntity> {
    public IrritatorRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new IrritatorModel());
        this.shadowRadius = 1.29f;
    }

    @Override
    public RenderType getRenderType(IrritatorEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }


    @Override
    public void preRender(PoseStack poseStack, IrritatorEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
        float scale = 1.45f;
        poseStack.scale(scale,scale,scale);
        super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);

    }
}
