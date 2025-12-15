package net.rexbrx.prelude.client.ModelsMR.industrial.cruser_alt;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class IndustrialCrusher<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("prelude", "crusher"), "main");
	private final ModelPart root;
	private final ModelPart crush2;
	private final ModelPart l5;
	private final ModelPart h9;
	private final ModelPart h10;
	private final ModelPart l6;
	private final ModelPart h11;
	private final ModelPart h12;
	private final ModelPart l7;
	private final ModelPart h13;
	private final ModelPart h14;
	private final ModelPart l8;
	private final ModelPart h15;
	private final ModelPart h16;
	private final ModelPart crush1;
	private final ModelPart l1;
	private final ModelPart h1;
	private final ModelPart h2;
	private final ModelPart l3;
	private final ModelPart h5;
	private final ModelPart h6;
	private final ModelPart l2;
	private final ModelPart h3;
	private final ModelPart h4;
	private final ModelPart l4;
	private final ModelPart h7;
	private final ModelPart h8;

	public IndustrialCrusher(ModelPart root) {
		this.root = root.getChild("root");
		this.crush2 = this.root.getChild("crush2");
		this.l5 = this.crush2.getChild("l5");
		this.h9 = this.l5.getChild("h9");
		this.h10 = this.l5.getChild("h10");
		this.l6 = this.crush2.getChild("l6");
		this.h11 = this.l6.getChild("h11");
		this.h12 = this.l6.getChild("h12");
		this.l7 = this.crush2.getChild("l7");
		this.h13 = this.l7.getChild("h13");
		this.h14 = this.l7.getChild("h14");
		this.l8 = this.crush2.getChild("l8");
		this.h15 = this.l8.getChild("h15");
		this.h16 = this.l8.getChild("h16");
		this.crush1 = this.root.getChild("crush1");
		this.l1 = this.crush1.getChild("l1");
		this.h1 = this.l1.getChild("h1");
		this.h2 = this.l1.getChild("h2");
		this.l3 = this.crush1.getChild("l3");
		this.h5 = this.l3.getChild("h5");
		this.h6 = this.l3.getChild("h6");
		this.l2 = this.crush1.getChild("l2");
		this.h3 = this.l2.getChild("h3");
		this.h4 = this.l2.getChild("h4");
		this.l4 = this.crush1.getChild("l4");
		this.h7 = this.l4.getChild("h7");
		this.h8 = this.l4.getChild("h8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create().texOffs(0, 23).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(65, 56).addBox(-8.0F, -16.0F, -8.25F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-26.0F, -14.0F, -5.0F, 51.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition crush2 = root.addOrReplaceChild("crush2", CubeListBuilder.create().texOffs(65, 23).addBox(-13.0F, -14.0F, -3.0F, 26.0F, 26.0F, 6.0F, new CubeDeformation(0.1F)), PartPose.offset(-17.0F, -7.0F, 0.0F));

		PartDefinition l5 = crush2.addOrReplaceChild("l5", CubeListBuilder.create().texOffs(58, 89).addBox(-6.0F, -17.0F, -1.0F, 12.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition h9 = l5.addOrReplaceChild("h9", CubeListBuilder.create().texOffs(23, 105).addBox(-9.0F, 0.0F, -1.0F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -17.0F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition h10 = l5.addOrReplaceChild("h10", CubeListBuilder.create().texOffs(46, 105).addBox(0.0F, 0.0F, -1.0F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -17.0F, 0.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition l6 = crush2.addOrReplaceChild("l6", CubeListBuilder.create().texOffs(87, 89).addBox(-6.0F, -17.0F, -1.0F, 12.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition h11 = l6.addOrReplaceChild("h11", CubeListBuilder.create().texOffs(69, 105).addBox(-9.0F, 0.0F, -1.0F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -17.0F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition h12 = l6.addOrReplaceChild("h12", CubeListBuilder.create().texOffs(92, 105).addBox(0.0F, 0.0F, -1.0F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -17.0F, 0.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition l7 = crush2.addOrReplaceChild("l7", CubeListBuilder.create().texOffs(94, 73).addBox(-6.0F, -17.0F, -1.0F, 12.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition h13 = l7.addOrReplaceChild("h13", CubeListBuilder.create().texOffs(0, 113).addBox(-9.0F, 0.0F, -1.0F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -17.0F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition h14 = l7.addOrReplaceChild("h14", CubeListBuilder.create().texOffs(23, 113).addBox(0.0F, 0.0F, -1.0F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -17.0F, 0.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition l8 = crush2.addOrReplaceChild("l8", CubeListBuilder.create().texOffs(94, 81).addBox(-6.0F, -17.0F, -1.0F, 12.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition h15 = l8.addOrReplaceChild("h15", CubeListBuilder.create().texOffs(46, 113).addBox(-9.0F, 0.0F, -1.0F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -17.0F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition h16 = l8.addOrReplaceChild("h16", CubeListBuilder.create().texOffs(69, 113).addBox(0.0F, 0.0F, -1.0F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -17.0F, 0.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition crush1 = root.addOrReplaceChild("crush1", CubeListBuilder.create().texOffs(0, 56).addBox(-13.0F, -14.0F, -3.0F, 26.0F, 26.0F, 6.0F, new CubeDeformation(0.1F)), PartPose.offset(17.0F, -7.0F, 0.0F));

		PartDefinition l1 = crush1.addOrReplaceChild("l1", CubeListBuilder.create().texOffs(65, 73).addBox(-6.0F, -17.0F, -1.0F, 12.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition h1 = l1.addOrReplaceChild("h1", CubeListBuilder.create().texOffs(0, 97).addBox(-9.0F, 0.0F, -1.0F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -17.0F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition h2 = l1.addOrReplaceChild("h2", CubeListBuilder.create().texOffs(23, 97).addBox(0.0F, 0.0F, -1.0F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -17.0F, 0.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition l3 = crush1.addOrReplaceChild("l3", CubeListBuilder.create().texOffs(0, 89).addBox(-6.0F, -17.0F, -1.0F, 12.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition h5 = l3.addOrReplaceChild("h5", CubeListBuilder.create().texOffs(92, 97).addBox(-9.0F, 0.0F, -1.0F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -17.0F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition h6 = l3.addOrReplaceChild("h6", CubeListBuilder.create().texOffs(98, 56).addBox(0.0F, 0.0F, -1.0F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -17.0F, 0.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition l2 = crush1.addOrReplaceChild("l2", CubeListBuilder.create().texOffs(65, 81).addBox(-6.0F, -17.0F, -1.0F, 12.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition h3 = l2.addOrReplaceChild("h3", CubeListBuilder.create().texOffs(46, 97).addBox(-9.0F, 0.0F, -1.0F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -17.0F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition h4 = l2.addOrReplaceChild("h4", CubeListBuilder.create().texOffs(69, 97).addBox(0.0F, 0.0F, -1.0F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -17.0F, 0.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition l4 = crush1.addOrReplaceChild("l4", CubeListBuilder.create().texOffs(29, 89).addBox(-6.0F, -17.0F, -1.0F, 12.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition h7 = l4.addOrReplaceChild("h7", CubeListBuilder.create().texOffs(98, 64).addBox(-9.0F, 0.0F, -1.0F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -17.0F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition h8 = l4.addOrReplaceChild("h8", CubeListBuilder.create().texOffs(0, 105).addBox(0.0F, 0.0F, -1.0F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -17.0F, 0.0F, 0.0F, 0.0F, 0.48F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer,
							   int packedLight, int packedOverlay, int color) {
		int argb = color;
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, argb);
	}

	@Override
	public void setupAnim(T t, float v, float v1, float v2, float v3, float v4) {
		this.crush1.zRot = v2 / -25.f;
		this.crush2.zRot = v2 / 25.f;
	}
}