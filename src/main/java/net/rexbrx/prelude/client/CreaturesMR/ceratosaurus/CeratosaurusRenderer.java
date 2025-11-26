package net.rexbrx.prelude.client.CreaturesMR.ceratosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.client.CreaturesMR.torvosaurus.TorvosaurusModel;
import net.rexbrx.prelude.server.entity.common.CeratosaurusEntity;
import net.rexbrx.prelude.server.entity.common.TorvosaurusEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class CeratosaurusRenderer extends GeoEntityRenderer<CeratosaurusEntity> {
    public CeratosaurusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CeratosaurusModel());
        this.shadowRadius = 1.18f;
    }

    @Override
    public RenderType getRenderType(CeratosaurusEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }

    @Override
    public void preRender(PoseStack poseStack, CeratosaurusEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
                          float blue, float alpha) {
        float scale = 0.921f;
        this.scaleHeight = scale;
        this.scaleWidth = scale;
        super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }
}