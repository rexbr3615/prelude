package net.rexbrx.prelude.client.CreaturesMR.chapter_one.orodromeus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.server.entity.common.chapter_one.OrodromeusEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class OrodromeusRenderer extends GeoEntityRenderer<OrodromeusEntity> {
    public OrodromeusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new OrodromeusModel());
        this.shadowRadius = 0.467f;
    }

    @Override
    public RenderType getRenderType(OrodromeusEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }

    public void preRender(PoseStack poseStack, OrodromeusEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
                          float blue, float alpha) {
        float scale = 0.79f;
        this.scaleHeight = scale;
        this.scaleWidth = scale;
    }
}