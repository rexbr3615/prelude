package net.rexbrx.prelude.client.ModelsMR.Eolic;

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

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeleolic_generator<T extends Entity> extends EntityModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in
    // the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("prelude", "modeleolic_generator"), "main");
    public final ModelPart bone;
    public final ModelPart bone10;
    public final ModelPart fan_all;
    public final ModelPart fan1;
    public final ModelPart fan2;
    public final ModelPart fan3;
    public final ModelPart bone2;
    public final ModelPart bone3;
    public final ModelPart bone4;
    public final ModelPart bone5;
    public final ModelPart bone6;
    public final ModelPart bone7;
    public final ModelPart bone8;
    public final ModelPart bone9;

    public Modeleolic_generator(ModelPart root) {
        this.bone = root.getChild("bone");
        this.bone10 = this.bone.getChild("bone10");
        this.fan_all = this.bone10.getChild("fan_all");
        this.fan1 = this.fan_all.getChild("fan1");
        this.fan2 = this.fan_all.getChild("fan2");
        this.fan3 = this.fan_all.getChild("fan3");
        this.bone2 = this.bone.getChild("bone2");
        this.bone3 = this.bone2.getChild("bone3");
        this.bone4 = this.bone.getChild("bone4");
        this.bone5 = this.bone4.getChild("bone5");
        this.bone6 = this.bone.getChild("bone6");
        this.bone7 = this.bone6.getChild("bone7");
        this.bone8 = this.bone.getChild("bone8");
        this.bone9 = this.bone8.getChild("bone9");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition bone = partdefinition.addOrReplaceChild("bone",
                CubeListBuilder.create().texOffs(25, 43).addBox(-5.0F, -12.0F, -5.0F, 10.0F, 12.0F, 10.0F, new CubeDeformation(0.05F)).texOffs(66, 43).addBox(-4.0F, -24.0F, -4.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(25, 20)
                        .addBox(-4.0F, -104.0F, -6.0F, 8.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(25, 66).addBox(-2.0F, -104.0F, 0.0F, 4.0F, 1.0F, 15.0F, new CubeDeformation(0.05F)).texOffs(70, 38)
                        .addBox(-5.0F, -104.0F, 15.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)).texOffs(90, 0).addBox(-3.0F, -103.0F, 7.0F, 6.0F, 5.0F, 4.0F, new CubeDeformation(0.05F)).texOffs(0, 0)
                        .addBox(-3.0F, -96.0F, -3.0F, 6.0F, 72.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(25, 0).addBox(-8.0F, -3.0F, -8.0F, 16.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 24.0F, 0.0F));
        PartDefinition bone10 = bone.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(90, 10).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -100.0F, -6.0F));
        PartDefinition fan_all = bone10.addOrReplaceChild("fan_all", CubeListBuilder.create().texOffs(85, 94).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -2.0F));
        PartDefinition fan1 = fan_all.addOrReplaceChild("fan1", CubeListBuilder.create().texOffs(64, 66).addBox(-1.0F, -33.0F, -0.5F, 2.0F, 33.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0944F));
        PartDefinition fan2 = fan_all.addOrReplaceChild("fan2", CubeListBuilder.create().texOffs(71, 64).addBox(-1.0F, -33.0F, -0.5F, 2.0F, 33.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0944F));
        PartDefinition fan3 = fan_all.addOrReplaceChild("fan3", CubeListBuilder.create().texOffs(78, 64).addBox(-1.0F, -33.0F, -0.5F, 2.0F, 33.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(70, 20).addBox(-5.0F, -8.0F, 0.0F, 10.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -8.0F, -0.1745F, 0.0F, 0.0F));
        PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(70, 32).addBox(-5.0F, -2.0F, 0.0F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
        PartDefinition bone4 = bone.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 83).addBox(-5.0F, -8.0F, -3.0F, 10.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 8.0F, 0.1745F, 0.0F, 0.0F));
        PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(85, 76).addBox(-5.0F, -2.0F, -3.0F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
        PartDefinition bone6 = bone.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(27, 83).addBox(-5.0F, -8.0F, -3.0F, 10.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.0F, -3.0F, 0.0F, 0.1745F, -1.5708F, 0.0F));
        PartDefinition bone7 = bone6.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(85, 82).addBox(-5.0F, -2.0F, -3.0F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
        PartDefinition bone8 = bone.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(85, 64).addBox(-5.0F, -8.0F, -3.0F, 10.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -3.0F, 0.0F, 0.1745F, 1.5708F, 0.0F));
        PartDefinition bone9 = bone8.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(85, 88).addBox(-5.0F, -2.0F, -3.0F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.fan_all.zRot = ageInTicks / 30.f;
    }
}
