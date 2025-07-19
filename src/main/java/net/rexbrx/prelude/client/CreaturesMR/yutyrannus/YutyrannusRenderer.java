package net.rexbrx.prelude.client.CreaturesMR.yutyrannus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.client.CreaturesMR.allosaurus.AllosaurusModel;
import net.rexbrx.prelude.server.entity.common.AllosaurusEntity;
import net.rexbrx.prelude.server.entity.common.YutyrannusEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class YutyrannusRenderer extends GeoEntityRenderer<YutyrannusEntity> {
    public YutyrannusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new YutyrannusModel());
        this.shadowRadius = 1.29f;
    }

    @Override
    public RenderType getRenderType(YutyrannusEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }

    @Override
    public void preRender(PoseStack poseStack, YutyrannusEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
                          float blue, float alpha) {
        float scale = 1.211f;
        this.scaleHeight = scale;
        this.scaleWidth = scale;
        super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }
}