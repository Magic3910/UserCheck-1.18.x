package usercheck.usercheck;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class UserCheck extends JavaPlugin {
    public static Logger log= Bukkit.getLogger();
    @Override
    public void onEnable() {
        getCommand("uc").setExecutor(new CheckCommand());
        log.info("[유저정보] Enable");
    }

    @Override
    public void onDisable() {
        log.info("[유저정보] Disable");
    }
}
