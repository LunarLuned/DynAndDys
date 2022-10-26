package net.lunarluned.dynanddys.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.lunarluned.dynanddys.DynAndDys;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModItemGroup {
    public static final CreativeModeTab DYNANDDYS = FabricItemGroupBuilder.build(new ResourceLocation(DynAndDys.MOD_ID, "dynanddys"),
            () -> new ItemStack(Items.ENDER_EYE));
}
