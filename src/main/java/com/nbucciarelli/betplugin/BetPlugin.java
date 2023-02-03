package com.nbucciarelli.betplugin;

import com.nbucciarelli.betplugin.commands.BetCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class BetPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("BetPlugin initialized! Enjoy it...");
        getCommand("bet").setExecutor(new BetCommand());
    }

    @Override
    public void onDisable() {
        System.out.println("Shutting down BetPlugin... Bye!");    }
}
