package net.rexbrx.prelude.client.CreaturesMR.albertosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.server.entity.common.AlbertosaurusEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class AlbertosaurusRenderer extends GeoEntityRenderer<AlbertosaurusEntity> {
    public AlbertosaurusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AlbertosaurusModel());
        this.shadowRadius = 1.29f;
    }

    @Override
    public RenderType getRenderType(AlbertosaurusEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }


    public void preRender(float widthScale, float heightScale, PoseStack poseStack, AlbertosaurusEntity animatable, BakedGeoModel model, boolean isReRender, float partialTick, int packedLight, int packedOverlay) {
        float scale = 1.05f;
        this.scaleHeight = scale;
        this.scaleWidth = scale;
    }
}
