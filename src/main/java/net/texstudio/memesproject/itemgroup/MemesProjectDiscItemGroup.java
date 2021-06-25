
package net.texstudio.memesproject.itemgroup;

import net.texstudio.memesproject.item.NightVoyagerItem;
import net.texstudio.memesproject.MemesprojectModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@MemesprojectModElements.ModElement.Tag
public class MemesProjectDiscItemGroup extends MemesprojectModElements.ModElement {
	public MemesProjectDiscItemGroup(MemesprojectModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmemes_project_disc") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(NightVoyagerItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
