package dev.sebastianb.dracotrem;

import dev.sebastianb.dracotrem.blocks.multiblock.dragonbossalter.BlahEndAlterCheck;
import dev.sebastianb.dracotrem.entity.DracoTremEntities;
import dev.sebastianb.dracotrem.items.DracoTremItems;
import dev.sebastianb.dracotrem.sounds.DracoTremSounds;
import dev.sebastianb.dracotrem.structure.DracoTremStructures;
import dev.sebastianb.dracotrem.utils.Scheduler;
import net.fabricmc.api.ModInitializer;



public class DracoTrem implements ModInitializer {

    public static final String MOD_ID = "dracotrem";
    public static Scheduler scheduler = new Scheduler();

    @Override
    public void onInitialize() {
        DracoTremSounds.register();
        DracoTremItems.register();
        DracoTremEntities.register();
        DracoTremStructures.register(); //I think they work. I need to hook everything up now

        //register features
        BlahEndAlterCheck.register();
    }
}
