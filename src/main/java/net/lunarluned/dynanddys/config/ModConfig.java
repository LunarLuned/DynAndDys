package net.lunarluned.dynanddys.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import net.lunarluned.dynanddys.config.options.items.ItemsConfig;

// Mod Config


// @Config.Gui.Background("dynanddys:textures/block/mythril_crystal.png")
@Config(name = "dynanddys")
public class ModConfig implements ConfigData {

    // Mobs

    @ConfigEntry.Gui.CollapsibleObject(startExpanded = false)

    public Items items = new Items();

    public static class Items {

        @ConfigEntry.Gui.CollapsibleObject(startExpanded = false)
        @ConfigEntry.Gui.Tooltip
        public ItemsConfig itemConfigs = new ItemsConfig();

    }

}
