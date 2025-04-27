package net.mcreator.darkstarrr.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.darkstarrr.init.DarkstarrrModEntities;
import net.mcreator.darkstarrr.init.DarkstarrrModBlocks;

public class DarkStalkerNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double rng = 0;
		rng = Mth.nextInt(RandomSource.create(), 1, 100);
		if (rng == 1) {
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == DarkstarrrModBlocks.DARK_GRASS.get()) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = DarkstarrrModEntities.DARK_STALKER.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				return true;
			}
		}
		return false;
	}
}
