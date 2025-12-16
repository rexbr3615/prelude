package net.rexbrx.prelude.client.CreaturesMR.chapter_omega.monolophosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.client.CreaturesMR.chapter_omega.irritator.IrritatorModel;
import net.rexbrx.prelude.server.entity.common.chapter_omega.IrritatorEntity;
import net.rexbrx.prelude.server.entity.common.chapter_omega.MonolophosaurusEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class MonolophosaurusRenderer extends GeoEntityRenderer<MonolophosaurusEntity> {
    public MonolophosaurusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new MonolophosaurusModel());
        this.shadowRadius = 1.29f;
    }

    @Override
    public RenderType getRenderType(MonolophosaurusEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }


    @Override
    public void preRender(PoseStack poseStack, MonolophosaurusEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
        float scale = 1.15f;
        poseStack.scale(scale,scale,scale);
        super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);

    }
}
