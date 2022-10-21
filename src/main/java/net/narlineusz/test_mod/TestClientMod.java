package net.narlineusz.test_mod;

import net.fabricmc.api.ClientModInitializer;
import net.narlineusz.test_mod.util.ModModelPredicateProvider;

public class TestClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ModModelPredicateProvider.registerModModels();
    }
}
