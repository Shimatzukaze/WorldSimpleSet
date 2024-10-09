package com.worldsimpleset;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WssCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player i = (Player) commandSender;

        try {
            WorldSimpleSet.main.reloadConfig();
        }catch (Exception ex){
            i.sendMessage("Error");
        }
        i.sendMessage("Reload Complete");

        return false;
    }
}
