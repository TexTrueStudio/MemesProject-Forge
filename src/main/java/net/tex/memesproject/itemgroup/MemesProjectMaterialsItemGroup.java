
package net.tex.memesproject.itemgroup;

import net.tex.memesproject.item.MPMsItem;
import net.tex.memesproject.MemesprojectModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

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
