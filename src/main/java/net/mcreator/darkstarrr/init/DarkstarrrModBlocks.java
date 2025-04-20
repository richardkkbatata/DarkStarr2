
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkstarrr.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.darkstarrr.block.GreenDimensionPortalBlock;
import net.mcreator.darkstarrr.DarkstarrrMod;

public class DarkstarrrModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(DarkstarrrMod.MODID);
	public static final DeferredBlock<Block> DARK_DIMENSION_PORTAL = REGISTRY.register("dark_dimension_portal", GreenDimensionPortalBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
