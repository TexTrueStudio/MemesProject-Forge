
package net.texstudio.memesproject.itemgroup;

import net.texstudio.memesproject.item.StoneGrainIngotItem;
import net.texstudio.memesproject.MemesprojectModElements;

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
				return new ItemStack(StoneGrainIngotItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
