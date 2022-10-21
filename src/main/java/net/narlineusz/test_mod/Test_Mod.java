package net.narlineusz.test_mod;

import net.fabricmc.api.ModInitializer;
import net.narlineusz.test_mod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Test_Mod implements ModInitializer {
	public static final String MOD_ID =	 "test_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger("test_mod");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
