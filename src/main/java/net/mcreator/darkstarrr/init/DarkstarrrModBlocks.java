
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkstarrr.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.darkstarrr.block.SuporteDeItensBlock;
import net.mcreator.darkstarrr.block.GreenDimensionPortalBlock;
import net.mcreator.darkstarrr.block.DarkstaroakBlock;
import net.mcreator.darkstarrr.block.DarkOreBlock;
import net.mcreator.darkstarrr.block.DarkOakLeavesBlock;
import net.mcreator.darkstarrr.block.DarkGrassundergroundBlock;
import net.mcreator.darkstarrr.block.DarkGrassBlock;
import net.mcreator.darkstarrr.block.DarkDimensionPortalBlock;
import net.mcreator.darkstarrr.DarkstarrrMod;

public class DarkstarrrModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(DarkstarrrMod.MODID);
	public static final DeferredBlock<Block> GREEN_DIMENSION_PORTAL = REGISTRY.register("green_dimension_portal", GreenDimensionPortalBlock::new);
	public static final DeferredBlock<Block> DARK_ORE = REGISTRY.register("dark_ore", DarkOreBlock::new);
	public static final DeferredBlock<Block> DARK_GRASSUNDERGROUND = REGISTRY.register("dark_grassunderground", DarkGrassundergroundBlock::new);
	public static final DeferredBlock<Block> DARK_GRASS = REGISTRY.register("dark_grass", DarkGrassBlock::new);
	public static final DeferredBlock<Block> DARK_DIMENSION_PORTAL = REGISTRY.register("dark_dimension_portal", DarkDimensionPortalBlock::new);
	public static final DeferredBlock<Block> DARK_OAK_LEAVES = REGISTRY.register("dark_oak_leaves", DarkOakLeavesBlock::new);
	public static final DeferredBlock<Block> DARKSTAROAK = REGISTRY.register("darkstaroak", DarkstaroakBlock::new);
	public static final DeferredBlock<Block> SUPORTE_DE_ITENS = REGISTRY.register("suporte_de_itens", SuporteDeItensBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
