package com.cheetahlabs.minequest.Spout;

import org.spout.api.player.Player;

import com.cheetahlabs.minequest.APIs.QuestPlayer;

public class SpPlayer implements QuestPlayer {

	public Player player;
	
	public SpPlayer(Player p){
		player = p;
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
