
package net.mcreator.darkstarrr.item;

public class DarkDimensionItem extends Item {

	public DarkDimensionItem() {
		super(new Item.Properties().rarity(Rarity.EPIC).durability(64));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("item.darkstarrr.dark_dimension.description_0"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		Player entity = context.getPlayer();
		BlockPos pos = context.getClickedPos().relative(context.getClickedFace());
		ItemStack itemstack = context.getItemInHand();
		Level world = context.getLevel();
		if (!entity.mayUseItemAt(pos, context.getClickedFace(), itemstack)) {
			return InteractionResult.FAIL;
		} else {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			boolean success = false;

			if (world.isEmptyBlock(pos) && true) {
				DarkDimensionPortalBlock.portalSpawn(world, pos);
				itemstack.hurtAndBreak(1, entity, LivingEntity.getSlotForHand(context.getHand()));
				success = true;
			}

			return success ? InteractionResult.SUCCESS : InteractionResult.FAIL;
		}
	}
}
