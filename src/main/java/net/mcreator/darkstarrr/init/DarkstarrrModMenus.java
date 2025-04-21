
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkstarrr.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.darkstarrr.world.inventory.GuisuporteMenu;
import net.mcreator.darkstarrr.DarkstarrrMod;

public class DarkstarrrModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, DarkstarrrMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<GuisuporteMenu>> GUISUPORTE = REGISTRY.register("guisuporte", () -> IMenuTypeExtension.create(GuisuporteMenu::new));
}
