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

    static public boolean cancelBlockBreak;
    static public boolean cancelBlockBurn;
    static public boolean cancelChat;
    static public boolean cancelBlockSpread;
    static public boolean cancelBlockPlace;
    static public boolean cancelBlockIgnite;
    static public boolean cancelBlockGrow;
    static public boolean cancelBlockDamage;
    static public boolean cancelBlockFade;
    static public boolean cancelPlayerDropItem;
    static public boolean cancelPlayerInteract;
    static public boolean cancelPlayerInteractEntity;
    static public boolean cancelEntityDamageByEntity;
    static public boolean cancelEntityDamageByBlock;

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        event.setCancelled(cancelBlockBreak);
    }

    @EventHandler
    public void onBlockBurn(BlockBurnEvent event) {
        event.setCancelled(cancelBlockBurn);
    }

    @EventHandler
    public void onAsyncPlayerChat(AsyncPlayerChatEvent event) {
        event.setCancelled(cancelChat);
    }

    @EventHandler
    public void onBlockSpread(BlockSpreadEvent event) {
        event.setCancelled(cancelBlockSpread);
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        event.setCancelled(cancelBlockPlace);
    }

    @EventHandler
    public void onBlockIgnite(BlockIgniteEvent event) {
        event.setCancelled(cancelBlockIgnite);
    }

    @EventHandler
    public void onBlockGrow(BlockGrowEvent event) {
        event.setCancelled(cancelBlockGrow);
    }

    @EventHandler
    public void onBlockDamage(BlockDamageEvent event) {
        event.setCancelled(cancelBlockDamage);
    }

    @EventHandler
    public void onBlockFade(BlockFadeEvent event) {
        event.setCancelled(cancelBlockFade);
    }

    @EventHandler
    public void onPlayerDropItem(PlayerDropItemEvent event) {
        event.setCancelled(cancelPlayerDropItem);
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        event.setCancelled(cancelPlayerInteract);
    }

    @EventHandler
    public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {
        event.setCancelled(cancelPlayerInteractEntity);
    }

    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        event.setCancelled(cancelEntityDamageByEntity);
    }

    @EventHandler
    public void onEntityDamageByBlock(EntityDamageByBlockEvent event) {
        event.setCancelled(cancelEntityDamageByBlock);
    }

}
