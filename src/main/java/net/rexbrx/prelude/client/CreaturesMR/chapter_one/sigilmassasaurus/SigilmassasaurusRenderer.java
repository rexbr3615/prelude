package net.rexbrx.prelude.client.CreaturesMR.chapter_one.sigilmassasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.server.entity.common.chapter_one.AlbertosaurusEntity;
import net.rexbrx.prelude.server.entity.common.chapter_one.SigilmassasaurusEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class SigilmassasaurusRenderer extends GeoEntityRenderer<SigilmassasaurusEntity> {
    public SigilmassasaurusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SigilmassasaurusModel());
        this.shadowRadius = 0.67f;
    }

    @Override
    public RenderType getRenderType(SigilmassasaurusEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }

    @Override
    public void preRender(PoseStack poseStack, SigilmassasaurusEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {

        float scale = 1.034f;
        poseStack.scale(scale,scale,scale);
        super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);

    }
}
