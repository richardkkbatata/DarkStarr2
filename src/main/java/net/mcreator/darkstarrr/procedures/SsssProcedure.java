package net.mcreator.darkstarrr.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.darkstarrr.entity.DarkStalkerEntity;
import net.mcreator.darkstarrr.DarkstarrrMod;

import java.util.Comparator;

public class SsssProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		DarkstarrrMod.queueServerWork(5, () -> {
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true).isEmpty()) {
				((Entity) world.getEntitiesOfClass(DarkStalkerEntity.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y, z));
			}
		});
	}
}
