package net.takatalvi.takamc;

import net.fabricmc.api.ModInitializer;

import net.takatalvi.takamc.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TakatalviMod implements ModInitializer {
	public static final String MOD_ID = "takamc";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initilizing " + MOD_ID);
		ModItems.registerModItems(MOD_ID);
	}
}