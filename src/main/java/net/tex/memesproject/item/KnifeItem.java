
package net.tex.memesproject.item;

import net.tex.memesproject.itemgroup.MemesProjectWeaponsItemGroup;
import net.tex.memesproject.MemesprojectModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.Blocks;

import java.util.List;

@MemesprojectModElements.ModElement.Tag
public class KnifeItem extends MemesprojectModElements.ModElement {
	@ObjectHolder("memesproject:knife")
	public static final Item block = null;
	public KnifeItem(MemesprojectModElements instance) {
		super(instance, 38);
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
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.IRON_INGOT, (int) (1)), new ItemStack(Blocks.IRON_BLOCK, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(MemesProjectWeaponsItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("It's just a knife. . . ."));
			}
		}.setRegistryName("knife"));
	}
}
