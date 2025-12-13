package net.rexbrx.prelude.client.CreaturesMR.chapter_one.conodonta;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.CowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.server.entity.common.chapter_one.AlbertosaurusEntity;
import net.rexbrx.prelude.server.entity.common.chapter_one.ConodontaEntity;
import net.rexbrx.prelude.server.entity.common.chapter_one.PuertasaurusEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import static java.awt.Color.*;
import static snownee.jade.overlay.OverlayRenderer.alpha;

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
    public void preRender(PoseStack poseStack, ConodontaEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
        float scale = 0.05f;
        poseStack.scale(scale,scale,scale);
        super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);
    }
}