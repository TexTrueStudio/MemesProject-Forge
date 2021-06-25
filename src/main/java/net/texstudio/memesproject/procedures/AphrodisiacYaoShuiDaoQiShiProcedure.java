package net.texstudio.memesproject.procedures;

import net.texstudio.memesproject.MemesprojectModElements;
import net.texstudio.memesproject.MemesprojectMod;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@MemesprojectModElements.ModElement.Tag
public class AphrodisiacYaoShuiDaoQiShiProcedure extends MemesprojectModElements.ModElement {
	public AphrodisiacYaoShuiDaoQiShiProcedure(MemesprojectModElements instance) {
		super(instance, 35);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MemesprojectMod.LOGGER.warn("Failed to load dependency entity for procedure AphrodisiacYaoShuiDaoQiShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.MAGIC, (float) 4);
		if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).giveExperiencePoints((int) -50);
		}
	}
}
