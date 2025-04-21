
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkstarrr.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.darkstarrr.block.entity.SuporteDeItensBlockEntity;
import net.mcreator.darkstarrr.DarkstarrrMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class DarkstarrrModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, DarkstarrrMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> SUPORTE_DE_ITENS = register("suporte_de_itens", DarkstarrrModBlocks.SUPORTE_DE_ITENS, SuporteDeItensBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SUPORTE_DE_ITENS.get(), (blockEntity, side) -> ((SuporteDeItensBlockEntity) blockEntity).getItemHandler());
	}
}
