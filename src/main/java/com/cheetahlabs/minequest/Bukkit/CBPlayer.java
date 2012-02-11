package com.cheetahlabs.minequest.Bukkit;

import com.cheetahlabs.minequest.APIs.QuestPlayer;
import org.bukkit.entity.Player;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.player.SpoutPlayer;

public class CBPlayer implements QuestPlayer {
	
	public Player player;
	public SpoutPlayer spout;
	
	public CBPlayer(Player p){
		player = p;
		spout = SpoutManager.getPlayer(p);
	}

	@Override
	public String getName() {
		return player.getName();
	}

	@Override
	public String getDisplayName() {
		return player.getDisplayName();
	}
	
}
