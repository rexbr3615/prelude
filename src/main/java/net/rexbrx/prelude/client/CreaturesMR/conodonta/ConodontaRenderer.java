package net.rexbrx.prelude.client.CreaturesMR.conodonta;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.client.CreaturesMR.coelacanth.blue.BlueCoelacanthModel;
import net.rexbrx.prelude.server.entity.common.BlueCoelacanthEntity;
import net.rexbrx.prelude.server.entity.common.ConodontaEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class ConodontaRenderer extends GeoEntityRenderer<ConodontaEntity> {
    public ConodontaRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ConodontaModel());
        this.shadowRadius = 0.04f;
    }

    @Override
    public RenderType getRenderType(ConodontaEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }

    @Override
    public void preRender(PoseStack poseStack, ConodontaEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
                          float blue, float alpha) {
        float scale = 0.05f;
        this.scaleHeight = scale;
        this.scaleWidth = scale;
        super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }
}