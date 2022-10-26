package net.lunarluned.dynanddys.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lunarluned.dynanddys.DynAndDys;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModBlocks {

    private static Block registerBlock(String name, Block block, CreativeModeTab group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new ResourceLocation(DynAndDys.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, CreativeModeTab group) {
        return Registry.register(Registry.ITEM, new ResourceLocation(DynAndDys.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().tab(group)));
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new ResourceLocation(DynAndDys.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        DynAndDys.LOGGER.info("Registering mod blocks for " + DynAndDys.MOD_ID);
    }
}
