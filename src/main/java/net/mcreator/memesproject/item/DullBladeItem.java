
package net.mcreator.memesproject.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.memesproject.itemgroup.MemesProjectWeaponsItemGroup;
import net.mcreator.memesproject.MemesprojectModElements;

@MemesprojectModElements.ModElement.Tag
public class DullBladeItem extends MemesprojectModElements.ModElement {
	@ObjectHolder("memesproject:dull_blade")
	public static final Item block = null;
	public DullBladeItem(MemesprojectModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 78f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(MemesProjectWeaponsItemGroup.tab)) {
		}.setRegistryName("dull_blade"));
	}
}
