package net.lunarluned.dynanddys.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lunarluned.dynanddys.DynAndDys;
import net.lunarluned.dynanddys.item.custom.StructureEyeItem;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ModItems {

    public static final Item BLAZING_EYE = registerItem("blazing_eye",
            new StructureEyeItem(new FabricItemSettings().group(ModItemGroup.DYNANDDYS)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new ResourceLocation(DynAndDys.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DynAndDys.LOGGER.info("Registering mod items for " + DynAndDys.MOD_ID);
    }

}
