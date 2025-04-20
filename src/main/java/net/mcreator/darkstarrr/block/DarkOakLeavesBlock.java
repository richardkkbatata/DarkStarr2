
package net.mcreator.darkstarrr.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class DarkOakLeavesBlock extends Block {
	public DarkOakLeavesBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.AZALEA_LEAVES).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}
}