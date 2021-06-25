
package net.texstudio.memesproject.item;

import net.texstudio.memesproject.itemgroup.MemesProjectDiscItemGroup;
import net.texstudio.memesproject.MemesprojectModElements;

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
public class GoyangUburUburRemixedItem extends MemesprojectModElements.ModElement {
	@ObjectHolder("memesproject:goyang_ubur_ubur_remixed")
	public static final Item block = null;
	public GoyangUburUburRemixedItem(MemesprojectModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MemesprojectModElements.sounds.get(new ResourceLocation("memesproject:goyang_ubur_ubur_remixed")),
					new Item.Properties().group(MemesProjectDiscItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("goyang_ubur_ubur_remixed");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Ding~"));
		}
	}
}
