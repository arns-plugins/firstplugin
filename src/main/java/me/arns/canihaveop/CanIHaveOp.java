package me.arns.canihaveop;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author arns
 */
public class CanIHaveOp extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("OnEnable Enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("OnEnable Enabled");

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("canihaveop") && sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage("Pending operator application for user: " + player.getName() + "!");
            if (player.hasPermission("bukkit.op")) {
                if (!player.isOp()) {
                    player.sendMessage(ChatColor.GREEN + "Application accepted for ADMIN: " + player.getName() + "!");
                    player.setOp(true);
                } else {
                    player.sendMessage(ChatColor.RED + "You are already op");
                }

            } else {
                player.sendMessage(ChatColor.RED + "Application denied for user: " + player.getName() + "!");
            }
            return true;
        }
        return false;
    }
}
