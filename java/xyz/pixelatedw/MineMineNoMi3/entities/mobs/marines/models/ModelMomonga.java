package xyz.pixelatedw.MineMineNoMi3.entities.mobs.marines.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelMomonga extends ModelBiped
{
	// fields
	ModelRenderer hair1;
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer hair2;

	public ModelMomonga()
	{
		textureWidth = 64;
		textureHeight = 64;		

		hair1 = new ModelRenderer(this, 33, 10);
		hair1.addBox(0F, 0F, 0F, 2, 2, 3);
		hair1.setRotationPoint(-1F, -8.133333F, 3.4F);
		hair1.setTextureSize(64, 32);
		hair1.mirror = true;
		setRotation(hair1, 0.3346075F, 0F, 0F);
		head = new ModelRenderer(this, 0, 0);
		head.addBox(-4F, -8F, -4F, 8, 8, 8);
		head.setRotationPoint(0F, 0F, 0F);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		body = new ModelRenderer(this, 16, 16);
		body.addBox(-4F, 0F, -2F, 8, 12, 4);
		body.setRotationPoint(0F, 0F, 0F);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		rightarm = new ModelRenderer(this, 40, 16);
		rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
		rightarm.setRotationPoint(-5F, 2F, 0F);
		rightarm.setTextureSize(64, 32);
		rightarm.mirror = true;
		setRotation(rightarm, 0F, 0F, 0F);
		leftarm = new ModelRenderer(this, 40, 16);
		leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
		leftarm.setRotationPoint(5F, 2F, 0F);
		leftarm.setTextureSize(64, 32);
		leftarm.mirror = true;
		setRotation(leftarm, 0F, 0F, 0F);
		rightleg = new ModelRenderer(this, 0, 16);
		rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
		rightleg.setRotationPoint(-2F, 12F, 0F);
		rightleg.setTextureSize(64, 32);
		rightleg.mirror = true;
		setRotation(rightleg, 0F, 0F, 0F);
		leftleg = new ModelRenderer(this, 0, 16);
		leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
		leftleg.setRotationPoint(2F, 12F, 0F);
		leftleg.setTextureSize(64, 32);
		leftleg.mirror = true;
		setRotation(leftleg, 0F, 0F, 0F);
		hair2 = new ModelRenderer(this, 33, 0);
		hair2.addBox(0F, 0F, 0F, 2, 8, 1);
		hair2.setRotationPoint(-1F, -7F, 5F);
		hair2.setTextureSize(64, 32);
		hair2.mirror = true;
		setRotation(hair2, 0.1858931F, 0F, 0F);
		/*sword3 = new ModelRenderer(this, 0, 42);
		sword3.addBox(-1.5F, 8.5F, -16F, 1, 1, 12);
		sword3.setRotationPoint(-5F, 2F, 0F);
		sword3.setTextureSize(64, 32);
		sword3.mirror = true;
		setRotation(sword3, 0F, 0F, 0F);*/
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		//sword2.render(f5);
		//sword1.render(f5);
		hair1.render(f5);
		head.render(f5);
		body.render(f5);
		rightarm.render(f5);
		leftarm.render(f5);
		rightleg.render(f5);
		leftleg.render(f5);
		hair2.render(f5);
		//sword3.render(f5);
		
		this.bipedHeadwear.showModel = false;
		this.bipedHead.showModel = false;
		this.bipedLeftLeg.showModel = false;
		this.bipedRightLeg.showModel = false;
		this.bipedBody.showModel = false;
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
		leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
		rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.0F * f1;
		leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
		rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.0F * f1;
		/*sword1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.0F * f1;
		sword2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.0F * f1;
		sword3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.0F * f1;*/
	}

}
