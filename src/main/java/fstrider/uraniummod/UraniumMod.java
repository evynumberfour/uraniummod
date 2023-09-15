package fstrider.uraniummod;

import fstrider.uraniummod.block.UBlocks;
import fstrider.uraniummod.crafting.UCrafting;
import fstrider.uraniummod.item.UItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UraniumMod implements ModInitializer {
    public static final String MOD_ID = "uraniummod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static int itemIdOffset = 19400;
    public static int blockIdOffset = 940;
    public void onInitialize() {
        LOGGER.info("UraniumMod initializing, WIP");
        UItems.register(); //load items
        UBlocks.register(); //load blocks
        UCrafting.register(); //load recipes
    }
}
