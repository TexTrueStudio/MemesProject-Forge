package net.texstudio.memesproject.procedures;

import net.texstudio.memesproject.MemesprojectModElements;
import net.texstudio.memesproject.MemesprojectMod;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@MemesprojectModElements.ModElement.Tag
public class DonkeymeatDangShiWuBeiChiShiProcedure extends MemesprojectModElements.ModElement {
	public DonkeymeatDangShiWuBeiChiShiProcedure(MemesprojectModElements instance) {
		super(instance, 30);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MemesprojectMod.LOGGER.warn("Failed to load dependency entity for procedure DonkeymeatDangShiWuBeiChiShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH, (int) 60, (int) 5));
	}
}
