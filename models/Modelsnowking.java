// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelsnowking extends EntityModel<Entity> {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public Modelsnowking() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-6.0F, -13.0F, -6.0F, 12.0F, 11.0F, 12.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(6.0F, -13.0F, -5.0F, 1.0F, 11.0F, 10.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-5.0F, -13.0F, -7.0F, 10.0F, 11.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-7.0F, -13.0F, -5.0F, 1.0F, 11.0F, 10.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-5.0F, -13.0F, 6.0F, 10.0F, 11.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-5.0F, -21.0F, -5.0F, 10.0F, 8.0F, 10.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-6.0F, -21.0F, -4.0F, 1.0F, 8.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(5.0F, -21.0F, -4.0F, 1.0F, 8.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 111).addBox(-4.0F, -21.0F, -6.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(22, 31).addBox(-4.0F, -21.0F, 5.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-1.0F, -23.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(2.0F, -23.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-3.0F, -23.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-1.0F, -23.0F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-2.0F, -25.0F, 1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(1.0F, -25.0F, 1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(1.0F, -25.0F, -2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-2.0F, -25.0F, -2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(114, 125).addBox(-1.0F, -18.0F, -7.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(112, 123).addBox(0.0F, -18.0F, -11.0F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(124, 69).addBox(-11.0F, -23.0F, -7.0F, 1.0F, 17.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(116, 87).addBox(-12.0F, -24.0F, -8.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(120, 87).addBox(-11.0F, -24.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(120, 87).addBox(-13.0F, -24.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(120, 87).addBox(-11.0F, -24.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(120, 87).addBox(-9.0F, -24.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(120, 87).addBox(-12.0F, -26.0F, -9.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(120, 87).addBox(-12.0F, -26.0F, -5.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(120, 87).addBox(-13.0F, -26.0F, -8.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(120, 87).addBox(-9.0F, -26.0F, -8.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(116, 82).addBox(-12.0F, -26.0F, -8.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(124, 84).addBox(-11.0F, -28.0F, -7.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(122, 84).addBox(-12.0F, -27.0F, -8.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(122, 84).addBox(-10.0F, -27.0F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(120, 83).addBox(-11.0F, -27.0F, -8.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-10.3301F, -13.4641F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.829F, 0.0F, 2.0944F);
		cube_r1.setTextureOffset(120, 95).addBox(-1.0F, -4.5F, -5.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -2.0F, 0.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.1309F);
		cube_r2.setTextureOffset(120, 95).addBox(8.0F, -10.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}