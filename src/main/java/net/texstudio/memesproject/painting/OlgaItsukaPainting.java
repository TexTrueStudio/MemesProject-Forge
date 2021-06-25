
package net.texstudio.memesproject.painting;

import net.texstudio.memesproject.MemesprojectModElements;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

@MemesprojectModElements.ModElement.Tag
public class OlgaItsukaPainting extends MemesprojectModElements.ModElement {
	public OlgaItsukaPainting(MemesprojectModElements instance) {
		super(instance, 49);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(20, 50).setRegistryName("olga_itsuka"));
	}
}
