package me.arns;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CanIhaveOp extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getLogger().info("OnEnable Enabled");
	}
    
	@Override
	public void onDisable() {
		getLogger().info("OnEnable Enabled");		
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("canihaveop") && sender instanceof Player){
			Player player = (Player) sender;
			
			player.sendMessage("Pending operator application for user: " + player.getName() +"!");
			
			player.sendMessage("Application denied for user: " + player.getName() + ChatColour.Red +"!");
			return true;
			
		}	
			
		return false;
		
	}
	
}

	