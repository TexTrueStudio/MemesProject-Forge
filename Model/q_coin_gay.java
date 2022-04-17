// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class q_coin_penguin extends EntityModel<Entity> {
	private final ModelRenderer headhat;
	private final ModelRenderer mouth_r1;
	private final ModelRenderer right_foot;
	private final ModelRenderer leg_r1;
	private final ModelRenderer left_foot;
	private final ModelRenderer leg_r2;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bb_main;
	private final ModelRenderer cloak_r1;

	public q_coin_penguin() {
		texWidth = 64;
		texHeight = 64;

		headhat = new ModelRenderer(this);
		headhat.setPos(0.0F, 24.0F, 2.0F);
		headhat.texOffs(22, 20).addBox(-4.0F, -22.0F, -5.0F, 8.0F, 6.0F, 6.0F, 0.0F, false);
		headhat.texOffs(21, 46).addBox(-5.0F, -26.0872F, -6.0019F, 10.0F, 4.0F, 8.0F, 0.0F, false);
		headhat.texOffs(0, 34).addBox(-4.0F, -26.0872F, -7.0019F, 8.0F, 3.0F, 1.0F, 0.0F, false);
		headhat.texOffs(14, 41).addBox(-3.0F, -25.0872F, 1.9981F, 6.0F, 2.0F, 1.0F, 0.0F, false);

		mouth_r1 = new ModelRenderer(this);
		mouth_r1.setPos(-2.0F, -18.0F, -3.0F);
		headhat.addChild(mouth_r1);
		setRotationAngle(mouth_r1, 0.0873F, 0.0F, 0.0F);
		mouth_r1.texOffs(10, 28).addBox(0.0F, -1.0F, -6.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		right_foot = new ModelRenderer(this);
		right_foot.setPos(0.0F, 24.0F, 0.0F);
		right_foot.texOffs(0, 20).addBox(-6.0F, -1.0F, -5.0F, 4.0F, 1.0F, 7.0F, 0.0F, false);

		leg_r1 = new ModelRenderer(this);
		leg_r1.setPos(-3.5F, -3.5F, 0.5F);
		right_foot.addChild(leg_r1);
		setRotationAngle(leg_r1, 0.0F, 0.0F, 0.0873F);
		leg_r1.texOffs(3, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		left_foot = new ModelRenderer(this);
		left_foot.setPos(0.0F, 24.0F, 0.0F);
		left_foot.texOffs(0, 20).addBox(2.0F, -1.0F, -5.0F, 4.0F, 1.0F, 7.0F, 0.0F, false);

		leg_r2 = new ModelRenderer(this);
		leg_r2.setPos(3.5F, -4.5F, 0.5F);
		left_foot.addChild(leg_r2);
		setRotationAngle(leg_r2, 0.0F, 0.0F, -0.0873F);
		leg_r2.texOffs(3, 23).addBox(-0.5872F, 0.4962F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setPos(5.5F, 10.0F, 3.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(-11.4801F, -1.0678F, -2.0F);
		bone4.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.1309F);
		cube_r1.texOffs(30, 8).addBox(-1.0307F, 0.0963F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.1309F);
		cube_r2.texOffs(30, 8).addBox(0.5F, -1.0F, -4.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setPos(0.0F, 24.0F, 0.0F);
		bb_main.texOffs(0, 0).addBox(-6.0F, -16.0F, -4.0F, 12.0F, 12.0F, 8.0F, 0.0F, false);

		cloak_r1 = new ModelRenderer(this);
		cloak_r1.setPos(0.0F, -16.0F, 4.0F);
		bb_main.addChild(cloak_r1);
		setRotationAngle(cloak_r1, 0.2618F, 0.0F, 0.0F);
		cloak_r1.texOffs(29, 32).addBox(-5.0F, 0.0F, 0.0F, 10.0F, 14.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		headhat.render(matrixStack, buffer, packedLight, packedOverlay);
		right_foot.render(matrixStack, buffer, packedLight, packedOverlay);
		left_foot.render(matrixStack, buffer, packedLight, packedOverlay);
		bone4.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}