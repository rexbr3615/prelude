package net.rexbrx.prelude.client.CreaturesMR.proterosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbrx.prelude.client.CreaturesMR.rugops.RugopsModel;
import net.rexbrx.prelude.server.entity.common.ProterosuchusEntity;
import net.rexbrx.prelude.server.entity.common.RugopsEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class ProterosuchusRenderer extends GeoEntityRenderer<ProterosuchusEntity> {
    public ProterosuchusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ProterosuchusModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public RenderType getRenderType(ProterosuchusEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }

    @Override
    public void preRender(PoseStack poseStack, ProterosuchusEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
                          float blue, float alpha) {
        float scale = 0.568F;
        this.scaleHeight = scale;
        this.scaleWidth = scale;
        super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
