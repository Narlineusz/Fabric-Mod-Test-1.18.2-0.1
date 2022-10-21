package net.narlineusz.test_mod;

import net.fabricmc.api.ClientModInitializer;
import util.ModModelPredicateProvider;

public class TestClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ModModelPredicateProvider.registerModModels();
    }
}
