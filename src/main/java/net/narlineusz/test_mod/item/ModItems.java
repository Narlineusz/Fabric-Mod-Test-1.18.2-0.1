package net.narlineusz.test_mod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.narlineusz.test_mod.Test_Mod;
import net.narlineusz.test_mod.item.custom.ModAxeItem;

public class ModItems {
    public static final Item Nature_Leaf = registerItem("nature_leaf",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item Nature_Axe = registerItem("nature_axe",
            new ModAxeItem(ModToolMaterials.NATURE, 3,-3.1f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item Nature_Sword = registerItem("nature_sword",
            new SwordItem(ModToolMaterials.NATURE, 1,-2.4f,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public  static final Item Nature_Bow = registerItem("nature_bow",
            new BowItem(new FabricItemSettings().group(ItemGroup.COMBAT).maxDamage(640)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Test_Mod.MOD_ID, name), item);
    }

    public static void registerModItems() {

        Test_Mod.LOGGER.info("Register Mod Items for " + Test_Mod.MOD_ID);
    }
}
