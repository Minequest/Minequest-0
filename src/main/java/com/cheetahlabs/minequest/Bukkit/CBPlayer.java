package com.cheetahlabs.minequest.Bukkit;

import com.cheetahlabs.minequest.APIs.QuestPlayer;

import org.bukkit.entity.Player;

public class CBPlayer extends CBHuman implements QuestPlayer {
	
	public CBPlayer(Player p){
		super(p);
	}
	
}
