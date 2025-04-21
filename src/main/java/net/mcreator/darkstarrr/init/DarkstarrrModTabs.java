
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkstarrr.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.darkstarrr.DarkstarrrMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class DarkstarrrModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DarkstarrrMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(DarkstarrrModItems.GREEN_DIMENSION.get());
			tabData.accept(DarkstarrrModItems.DARK_DIMENSION.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(DarkstarrrModBlocks.DARK_ORE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(DarkstarrrModBlocks.DARK_GRASSUNDERGROUND.get().asItem());
			tabData.accept(DarkstarrrModBlocks.DARK_GRASS.get().asItem());
			tabData.accept(DarkstarrrModBlocks.DARKSTAROAK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(DarkstarrrModItems.DARK_STALKER_SPAWN_EGG.get());
		}
	}
}
