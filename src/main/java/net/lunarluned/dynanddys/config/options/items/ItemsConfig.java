package net.lunarluned.dynanddys.config.options.items;


import me.shedaniel.autoconfig.annotation.ConfigEntry;

public class ItemsConfig {
    @ConfigEntry.Gui.CollapsibleObject()
    @ConfigEntry.Gui.Tooltip
    public ItemChanges itemChanges = new ItemChanges();
}
