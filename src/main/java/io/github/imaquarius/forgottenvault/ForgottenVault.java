package io.github.imaquarius.forgottenvault;

import com.edwardbelt.edprison.EdPrison;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ForgottenVault extends JavaPlugin {

    private EdPrison edPrisonPlugin;

    @Override
    public void onEnable() {

        if (getServer().getPluginManager().isPluginEnabled("EdPrison")) {
            edPrisonPlugin = (EdPrison) Bukkit.getPluginManager().getPlugin("EdPrison");
            getLogger().info("EdPrison found and loaded!");
        } else {
            getLogger().warning("EdPrison is not available! Disabling ForgottenVault");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public EdPrison getEdPrisonPlugin(){
        return edPrisonPlugin;
    }
}