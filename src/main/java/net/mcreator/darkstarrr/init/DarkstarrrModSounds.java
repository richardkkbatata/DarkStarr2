
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkstarrr.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.darkstarrr.DarkstarrrMod;

public class DarkstarrrModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, DarkstarrrMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSICHORROR = REGISTRY.register("musichorror", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("darkstarrr", "musichorror")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HORRORAMBIENT = REGISTRY.register("horrorambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("darkstarrr", "horrorambient")));
}
