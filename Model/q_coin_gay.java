// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class q_coin_gay<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "q_coin_gay"), "main");
	private final ModelPart headhat;
	private final ModelPart right_foot;
	private final ModelPart left_foot;
	private final ModelPart bone4;
	private final ModelPart bb_main;

	public q_coin_gay(ModelPart root) {
		this.headhat = root.getChild("headhat");
		this.right_foot = root.getChild("right_foot");
		this.left_foot = root.getChild("left_foot");
		this.bone4 = root.getChild("bone4");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition headhat = partdefinition.addOrReplaceChild("headhat", CubeListBuilder.create().texOffs(22, 20).addBox(-4.0F, -22.0F, -5.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(21, 46).addBox(-5.0F, -26.0872F, -6.0019F, 10.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 34).addBox(-4.0F, -26.0872F, -7.0019F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 41).addBox(-3.0F, -25.0872F, 1.9981F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 2.0F));

		PartDefinition mouth_r1 = headhat.addOrReplaceChild("mouth_r1", CubeListBuilder.create().texOffs(10, 28).addBox(0.0F, -1.0F, -6.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -18.0F, -3.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition right_foot = partdefinition.addOrReplaceChild("right_foot", CubeListBuilder.create().texOffs(0, 20).addBox(-6.0F, -1.0F, -5.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leg_r1 = right_foot.addOrReplaceChild("leg_r1", CubeListBuilder.create().texOffs(3, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -3.5F, 0.5F, 0.0F, 0.0F, 0.0873F));

		PartDefinition left_foot = partdefinition.addOrReplaceChild("left_foot", CubeListBuilder.create().texOffs(0, 20).addBox(2.0F, -1.0F, -5.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leg_r2 = left_foot.addOrReplaceChild("leg_r2", CubeListBuilder.create().texOffs(3, 23).addBox(-0.5872F, 0.4962F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -4.5F, 0.5F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(5.5F, 10.0F, 3.0F));

		PartDefinition cube_r1 = bone4.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(30, 8).addBox(-1.0307F, 0.0963F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.4801F, -1.0678F, -2.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r2 = bone4.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(30, 8).addBox(0.5F, -1.0F, -4.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -16.0F, -4.0F, 12.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cloak_r1 = bb_main.addOrReplaceChild("cloak_r1", CubeListBuilder.create().texOffs(29, 32).addBox(-5.0F, 0.0F, 0.0F, 10.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.0F, 4.0F, 0.2618F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		headhat.render(poseStack, buffer, packedLight, packedOverlay);
		right_foot.render(poseStack, buffer, packedLight, packedOverlay);
		left_foot.render(poseStack, buffer, packedLight, packedOverlay);
		bone4.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}