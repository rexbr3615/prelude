package net.rexbrx.prelude.client.ModelsMR.vat;// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class VatModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("prelude", "vat"), "main");
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bb_main;

	public VatModel(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(41, 80).addBox(-8.0F, -5.0F, 0.0F, 16.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.0F, -12.0F, -0.9163F, 0.0F, 0.0F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(41, 70).addBox(3.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(37, 90).addBox(3.0F, 21.0F, 10.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(82, 80).addBox(4.0F, -1.5F, -0.75F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(27, 88).addBox(4.0F, -0.5F, 10.25F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(41, 75).addBox(-6.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(50, 90).addBox(-6.0F, 21.0F, 10.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 88).addBox(-5.0F, -1.5F, -0.75F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(32, 88).addBox(-5.0F, -0.5F, 10.25F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 70).addBox(-8.0F, -13.0F, -12.0F, 16.0F, 13.0F, 4.0F, new CubeDeformation(0.05F))
		.texOffs(0, 49).addBox(-8.0F, -4.0F, -8.0F, 16.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 49).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 4.0F, 16.0F, new CubeDeformation(0.05F))
		.texOffs(65, 21).addBox(-7.5F, -12.0F, -7.5F, 15.0F, 8.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(65, 45).addBox(-8.0F, -32.0F, 8.0F, 16.0F, 32.0F, 2.0F, new CubeDeformation(0.05F))
		.texOffs(0, 49).addBox(-8.0F, -32.0F, -8.0F, 16.0F, 4.0F, 16.0F, new CubeDeformation(0.05F))
		.texOffs(0, 0).addBox(-7.5F, -28.0F, -7.5F, 15.0F, 12.0F, 15.0F, new CubeDeformation(0.05F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}