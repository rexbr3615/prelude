package net.rexbrx.prelude.client.CreaturesMR.kentrosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.client.CreaturesMR.parasaurolophus.ParasaurolophusModel;
import net.rexbrx.prelude.server.entity.common.KentrosaurusEntity;
import net.rexbrx.prelude.server.entity.common.ParasaurolophusEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class KentrosaurusRenderer extends GeoEntityRenderer<KentrosaurusEntity> {
    public KentrosaurusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new KentrosaurusModel());
        this.shadowRadius = 0.580f;
    }

    @Override
    public RenderType getRenderType(KentrosaurusEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }

    @Override
    public void preRender(PoseStack poseStack, KentrosaurusEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
                          float blue, float alpha) {
        float scale = 1.04f;
        this.scaleHeight = scale;
        this.scaleWidth = scale;
        super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
