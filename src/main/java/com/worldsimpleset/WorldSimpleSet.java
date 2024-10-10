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
        loadConfig();

        main = this;
    }

    @Override
    public void onDisable() {
    }

    public void loadConfig() {
        WssListener.cancelBlockBreak = WorldSimpleSet.main.getConfig().getBoolean("BlockBreak");
        WssListener.cancelBlockBurn = WorldSimpleSet.main.getConfig().getBoolean("BlockBurn");
        WssListener.cancelChat = WorldSimpleSet.main.getConfig().getBoolean("Chat");
        WssListener.cancelBlockSpread = WorldSimpleSet.main.getConfig().getBoolean("BlockSpread");
        WssListener.cancelBlockPlace = WorldSimpleSet.main.getConfig().getBoolean("BlockPlace");
        WssListener.cancelBlockIgnite = WorldSimpleSet.main.getConfig().getBoolean("BlockIgnite");
        WssListener.cancelBlockGrow = WorldSimpleSet.main.getConfig().getBoolean("BlockGrow");
        WssListener.cancelBlockDamage = WorldSimpleSet.main.getConfig().getBoolean("BlockDamage");
        WssListener.cancelBlockFade = WorldSimpleSet.main.getConfig().getBoolean("BlockFade");
        WssListener.cancelPlayerDropItem = WorldSimpleSet.main.getConfig().getBoolean("PlayerDropItem");
        WssListener.cancelPlayerInteract = WorldSimpleSet.main.getConfig().getBoolean("PlayerInteract");
        WssListener.cancelPlayerInteractEntity = WorldSimpleSet.main.getConfig().getBoolean("PlayerInteractEntity");
        WssListener.cancelEntityDamageByEntity = WorldSimpleSet.main.getConfig().getBoolean("EntityDamageByEntity");
        WssListener.cancelEntityDamageByBlock = WorldSimpleSet.main.getConfig().getBoolean("EntityDamageByBlock");
    }
}
