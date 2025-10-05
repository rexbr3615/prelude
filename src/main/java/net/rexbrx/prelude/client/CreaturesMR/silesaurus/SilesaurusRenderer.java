package net.rexbrx.prelude.client.CreaturesMR.silesaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.client.CreaturesMR.dryosaurus.DryosaurusModel;
import net.rexbrx.prelude.server.entity.common.DryosaurusEntity;
import net.rexbrx.prelude.server.entity.common.SilesaurusEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class SilesaurusRenderer extends GeoEntityRenderer<SilesaurusEntity> {
    public SilesaurusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SilesaurusModel());
        this.shadowRadius = 0.467f;
    }

    @Override
    public RenderType getRenderType(SilesaurusEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }

    @Override
    public void preRender(PoseStack poseStack, SilesaurusEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
                          float blue, float alpha) {
        float scale = 1.01f;
        this.scaleHeight = scale;
        this.scaleWidth = scale;
        super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
