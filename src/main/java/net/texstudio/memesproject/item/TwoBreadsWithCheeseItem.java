
package net.texstudio.memesproject.item;

import net.texstudio.memesproject.MemesprojectModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

@MemesprojectModElements.ModElement.Tag
public class TwoBreadsWithCheeseItem extends MemesprojectModElements.ModElement {
	@ObjectHolder("memesproject:two_breads_with_cheese")
	public static final Item block = null;

	public TwoBreadsWithCheeseItem(MemesprojectModElements instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(500).saturation(40f).setAlwaysEdible()

							.build()));
			setRegistryName("two_breads_with_cheese");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 500;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
