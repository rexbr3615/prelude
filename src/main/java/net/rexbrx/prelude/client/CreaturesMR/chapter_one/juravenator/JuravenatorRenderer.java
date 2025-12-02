package net.rexbrx.prelude.client.CreaturesMR.chapter_one.juravenator;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;
import net.rexbrx.prelude.server.entity.common.chapter_one.JuravenatorEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class JuravenatorRenderer extends GeoEntityRenderer<JuravenatorEntity> {
    public JuravenatorRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new JuravenatorModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public RenderType getRenderType(JuravenatorEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }

    public void preRender(PoseStack poseStack, JuravenatorEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
                          float blue, float alpha) {
        float scale = 0.35f;
        this.scaleHeight = scale;
        this.scaleWidth = scale;
    }
}

