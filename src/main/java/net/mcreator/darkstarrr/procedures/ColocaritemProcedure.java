package net.mcreator.darkstarrr.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;

import net.mcreator.darkstarrr.init.DarkstarrrModBlocks;

public class ColocaritemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack storingItem = ItemStack.EMPTY;
		double blockItemQtty = 0;
		double playerItemQtty = 0;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == DarkstarrrModBlocks.SUPORTE_DE_ITENS.get()) {
			storingItem = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).copy();
			blockItemQtty = new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).getCount();
					}
					return 0;
				}
			}.getAmount(world, BlockPos.containing(x, y, z), 0);
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = (new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						if (world instanceof ILevelExtension _ext) {
							IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
							if (_itemHandler != null)
								return _itemHandler.getStackInSlot(slotid).copy();
						}
						return ItemStack.EMPTY;
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 0)).copy();
				_setstack.setCount((int) blockItemQtty);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				ItemStack _setstack = storingItem.copy();
				_setstack.setCount((int) playerItemQtty);
				_itemHandlerModifiable.setStackInSlot(0, _setstack);
			}
		}
	}
}
