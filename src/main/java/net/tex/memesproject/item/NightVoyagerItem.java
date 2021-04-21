
package net.tex.memesproject.item;

import net.tex.memesproject.itemgroup.MemesProjectDiscItemGroup;
import net.tex.memesproject.MemesprojectModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

@MemesprojectModElements.ModElement.Tag
public class NightVoyagerItem extends MemesprojectModElements.ModElement {
	@ObjectHolder("memesproject:night_voyager")
	public static final Item block = null;
	public NightVoyagerItem(MemesprojectModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MemesprojectModElements.sounds.get(new ResourceLocation("memesproject:night-voyager")),
					new Item.Properties().group(MemesProjectDiscItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("night_voyager");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
