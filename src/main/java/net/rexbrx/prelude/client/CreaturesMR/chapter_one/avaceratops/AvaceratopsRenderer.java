package net.rexbrx.prelude.client.CreaturesMR.chapter_one.avaceratops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.server.entity.common.chapter_one.AvaceratopsEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class AvaceratopsRenderer extends GeoEntityRenderer<AvaceratopsEntity> {
    public AvaceratopsRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AvaceratopsModel());
        this.shadowRadius = 0.467f;
    }

    @Override
    public RenderType getRenderType(AvaceratopsEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }

    public void preRender(PoseStack poseStack, AvaceratopsEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
                          float blue, float alpha) {
        float scale = 1.01f;
        this.scaleHeight = scale;
        this.scaleWidth = scale;
    }
}