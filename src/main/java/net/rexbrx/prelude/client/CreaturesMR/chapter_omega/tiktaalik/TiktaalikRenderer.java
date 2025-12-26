package net.rexbrx.prelude.client.CreaturesMR.chapter_omega.tiktaalik;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.server.entity.common.chapter_omega.TiktaalikEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class TiktaalikRenderer extends GeoEntityRenderer<TiktaalikEntity> {
    public TiktaalikRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TiktaalikModel());
        this.shadowRadius = 0.128f;
    }

    @Override
    public RenderType getRenderType(TiktaalikEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }

    @Override
    public void preRender(PoseStack poseStack, TiktaalikEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {

        float scale = 0.57899f;
        poseStack.scale(scale,scale,scale);
        super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);

    }
}
