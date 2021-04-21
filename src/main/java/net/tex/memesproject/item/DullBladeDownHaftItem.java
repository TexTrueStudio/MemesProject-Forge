
package net.tex.memesproject.item;

import net.tex.memesproject.itemgroup.MemesProjectMaterialsItemGroup;
import net.tex.memesproject.MemesprojectModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@MemesprojectModElements.ModElement.Tag
public class DullBladeDownHaftItem extends MemesprojectModElements.ModElement {
	@ObjectHolder("memesproject:dull_blade_down_haft")
	public static final Item block = null;
	public DullBladeDownHaftItem(MemesprojectModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MemesProjectMaterialsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("dull_blade_down_haft");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
