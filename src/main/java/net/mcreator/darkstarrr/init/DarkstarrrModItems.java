
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkstarrr.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.darkstarrr.item.GreenDimensionItem;
import net.mcreator.darkstarrr.item.DarkDimensionItem;
import net.mcreator.darkstarrr.DarkstarrrMod;

public class DarkstarrrModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(DarkstarrrMod.MODID);
	public static final DeferredItem<Item> GREEN_DIMENSION = REGISTRY.register("green_dimension", GreenDimensionItem::new);
	public static final DeferredItem<Item> DARK_ORE = block(DarkstarrrModBlocks.DARK_ORE);
	public static final DeferredItem<Item> DARK_GRASSUNDERGROUND = block(DarkstarrrModBlocks.DARK_GRASSUNDERGROUND);
	public static final DeferredItem<Item> DARK_GRASS = block(DarkstarrrModBlocks.DARK_GRASS);
	public static final DeferredItem<Item> DARK_DIMENSION = REGISTRY.register("dark_dimension", DarkDimensionItem::new);
	public static final DeferredItem<Item> DARK_OAK_LEAVES = block(DarkstarrrModBlocks.DARK_OAK_LEAVES);
	public static final DeferredItem<Item> DARKSTAROAK = block(DarkstarrrModBlocks.DARKSTAROAK);
	public static final DeferredItem<Item> DARK_STALKER_SPAWN_EGG = REGISTRY.register("dark_stalker_spawn_egg", () -> new DeferredSpawnEggItem(DarkstarrrModEntities.DARK_STALKER, -16777216, -3407872, new Item.Properties()));
	public static final DeferredItem<Item> SUPORTE_DE_ITENS = block(DarkstarrrModBlocks.SUPORTE_DE_ITENS);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
