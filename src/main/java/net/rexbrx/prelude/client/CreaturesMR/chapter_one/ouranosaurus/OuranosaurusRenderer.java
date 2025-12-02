package net.rexbrx.prelude.client.CreaturesMR.chapter_one.ouranosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.server.entity.common.chapter_one.OuranosaurusEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class OuranosaurusRenderer extends GeoEntityRenderer<OuranosaurusEntity> {
    public OuranosaurusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new OuranosaurusModel());
        this.shadowRadius = 0.567f;
    }

    @Override
    public RenderType getRenderType(OuranosaurusEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }

    public void preRender(PoseStack poseStack, OuranosaurusEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
                          float blue, float alpha) {
        float scale = 1.45f;
        this.scaleHeight = scale;
        this.scaleWidth = scale;
    }
}
