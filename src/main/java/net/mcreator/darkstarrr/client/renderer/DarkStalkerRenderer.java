
package net.mcreator.darkstarrr.client.renderer;

public class DarkStalkerRenderer extends HumanoidMobRenderer<DarkStalkerEntity, HumanoidModel<DarkStalkerEntity>> {
	public DarkStalkerRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<DarkStalkerEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(DarkStalkerEntity entity) {
		return ResourceLocation.parse("darkstarrr:textures/entities/6753c1987b95292a.png");
	}
}