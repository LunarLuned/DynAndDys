package net.lunarluned.dynanddys;

import net.fabricmc.api.ModInitializer;
import net.lunarluned.dynanddys.block.ModBlocks;
import net.lunarluned.dynanddys.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DynAndDys implements ModInitializer {
	public static final String MOD_ID = "dynanddys";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		LOGGER.info("Hello Fabric world!");
	}
}
