package net.rexbrx.prelude.client.CreaturesMR.chapter_one.sclerocephalus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.server.entity.common.chapter_one.AlbertosaurusEntity;
import net.rexbrx.prelude.server.entity.common.chapter_one.SclerocephalusEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class SclerocephalusRenderer extends GeoEntityRenderer<SclerocephalusEntity> {
    public SclerocephalusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SclerocephalusModel());
        this.shadowRadius = 0.367f;
    }

    @Override
    public RenderType getRenderType(SclerocephalusEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }

    @Override
    public void preRender(PoseStack poseStack, SclerocephalusEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {

        float scale = 0.734f;
        poseStack.scale(scale,scale,scale);
        super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);

    }
}
