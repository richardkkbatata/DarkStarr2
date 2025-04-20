
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkstarrr.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.darkstarrr.item.GreenDimensionItem;
import net.mcreator.darkstarrr.DarkstarrrMod;

public class DarkstarrrModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(DarkstarrrMod.MODID);
	public static final DeferredItem<Item> GREEN_DIMENSION = REGISTRY.register("green_dimension", GreenDimensionItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
