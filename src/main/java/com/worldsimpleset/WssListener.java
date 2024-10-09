package com.worldsimpleset;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class WssListener implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        setEventCancelled(event, "BlockBreak");
    }

    @EventHandler
    public void onBlockBurn(BlockBurnEvent event) {
        setEventCancelled(event, "BlockBurn");
    }

    @EventHandler
    public void onAsyncPlayerChat(AsyncPlayerChatEvent event) {
        setEventCancelled(event, "Chat");
    }

    @EventHandler
    public void onBlockSpread(BlockSpreadEvent event) {
        setEventCancelled(event, "BlockSpread");
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        setEventCancelled(event, "BlockPlace");
    }

    @EventHandler
    public void onBlockIgnite(BlockIgniteEvent event) {
        setEventCancelled(event, "BlockIgnite");
    }

    @EventHandler
    public void onBlockGrow(BlockGrowEvent event) {
        setEventCancelled(event, "BlockGrow");
    }

    @EventHandler
    public void onBlockDamage(BlockDamageEvent event) {
        setEventCancelled(event, "BlockDamage");
    }

    @EventHandler
    public void onBlockFade(BlockFadeEvent event) {
        setEventCancelled(event, "BlockFade");
    }

    @EventHandler
    public void onPlayerDropItem(PlayerDropItemEvent event) {
        setEventCancelled(event, "PlayerDropItem");
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        setEventCancelled(event, "PlayerInteract");
    }

    @EventHandler
    public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {
        setEventCancelled(event, "PlayerInteractEntity");
    }

    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        setEventCancelled(event, "EntityDamageByEntity");
    }

    @EventHandler
    public void onEntityDamageByBlock(EntityDamageByBlockEvent event) {
        setEventCancelled(event, "EntityDamageByBlock");
    }

    private <T extends Event & Cancellable> void setEventCancelled(T event, String configKey) {
        event.setCancelled(WorldSimpleSet.main.getConfig().getBoolean(configKey));
    }

}
