package me.swat.stt;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class STTMain extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Listener() {
            @EventHandler
            public void onPlayerPickup(EntityPickupItemEvent e) {
                if (e.getEntity() instanceof Player) {
                    Player p = ((Player) e.getEntity()).getPlayer();
                    if (!p.isSneaking()) {
                        e.setCancelled(true);
                    }
                }
            }
        },this);
    }
}
