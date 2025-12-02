package net.rexbrx.prelude.client.CreaturesMR.chapter_one.allosaurus;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;
import net.rexbrx.prelude.server.entity.common.chapter_one.AllosaurusEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class AllosaurusRenderer extends GeoEntityRenderer<AllosaurusEntity> {
    public AllosaurusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AllosaurusModel());
        this.shadowRadius = 1.29f;
    }

    @Override
    public RenderType getRenderType(AllosaurusEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }


    public void preRender(PoseStack poseStack, AllosaurusEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
                          float blue, float alpha) {
        float scale = 1.05f;
        this.scaleHeight = scale;
        this.scaleWidth = scale;
    }
}
