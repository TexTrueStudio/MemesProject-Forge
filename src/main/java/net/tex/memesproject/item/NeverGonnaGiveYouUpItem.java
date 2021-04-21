
package net.tex.memesproject.item;

import net.tex.memesproject.itemgroup.MemesProjectDiscItemGroup;
import net.tex.memesproject.MemesprojectModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;

import java.util.List;

@MemesprojectModElements.ModElement.Tag
public class NeverGonnaGiveYouUpItem extends MemesprojectModElements.ModElement {
	@ObjectHolder("memesproject:never_gonna_give_you_up")
	public static final Item block = null;
	public NeverGonnaGiveYouUpItem(MemesprojectModElements instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MemesprojectModElements.sounds.get(new ResourceLocation("memesproject:never_gonna_give_you_up")),
					new Item.Properties().group(MemesProjectDiscItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("never_gonna_give_you_up");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Rickroll"));
		}
	}
}
