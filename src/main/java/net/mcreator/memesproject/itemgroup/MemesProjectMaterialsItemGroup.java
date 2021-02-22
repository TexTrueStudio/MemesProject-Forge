
package net.mcreator.memesproject.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.memesproject.item.MPMsItem;
import net.mcreator.memesproject.MemesprojectModElements;

@MemesprojectModElements.ModElement.Tag
public class MemesProjectMaterialsItemGroup extends MemesprojectModElements.ModElement {
	public MemesProjectMaterialsItemGroup(MemesprojectModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmemes_project_materials") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MPMsItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
