package com.worldsimpleset;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class WorldSimpleSet extends JavaPlugin {
    static WorldSimpleSet main;

    @Override
    public void onEnable() {
        Bukkit.getPluginCommand("worldsimpleset").setExecutor(new WssCommand());
        Bukkit.getPluginManager().registerEvents(new WssListener(),this);

        saveDefaultConfig();
        main = this;

    }

    @Override
    public void onDisable() {
    }
}
