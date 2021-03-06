package dev.sebastianb.dracotrem.client.render.entity;

import dev.sebastianb.dracotrem.client.model.entity.BabyDragonEntityModel;
import dev.sebastianb.dracotrem.entity.BabyDragonEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

import static dev.sebastianb.dracotrem.DracoTrem.MOD_ID;


@Environment(EnvType.CLIENT)
public class BabyDragonEntityRenderer extends MobEntityRenderer<BabyDragonEntity, BabyDragonEntityModel> {

    private static final Identifier TEXTURE = new Identifier(MOD_ID, "textures/models/entity/baby_dragon.png");


    public BabyDragonEntityRenderer(EntityRenderDispatcher dispatcher) {
        super(dispatcher, new BabyDragonEntityModel(), 0.5F);
    }

    @Override
    protected int getBlockLight(BabyDragonEntity entity, BlockPos blockPos) {
        return 12;
    }

    @Override
    public Identifier getTexture(BabyDragonEntity entity) {
        return TEXTURE;
    }
}
