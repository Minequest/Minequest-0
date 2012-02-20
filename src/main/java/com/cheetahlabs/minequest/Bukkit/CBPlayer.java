package com.cheetahlabs.minequest.Bukkit;

import com.cheetahlabs.minequest.APIs.QuestPlayer;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.getspout.spoutapi.SpoutManager;

public class CBPlayer extends CBHuman implements QuestPlayer {
	
	public CBPlayer(Player p){
		super(p);
	}

	@Override
	public String getDisplayName() {
		return ((Player)entity).getDisplayName();
	}

	@Override
	public String getTitle() {
		return SpoutManager.getPlayer((Player)entity).getTitle();
	}

	@Override
	public void kick() {
		this.kick("You've been kicked from the server.");
	}

	@Override
	public void kick(String msg) {
		((Player)entity).kickPlayer(msg);
	}

	@Override
	public boolean hasPermission(String p) {
		return ((Player)entity).hasPermission(p);
	}

	@Override
	public boolean isOnline() {
		return ((Player)entity).isOnline();
	}

	@Override
	public void sendMessage(String msg) {
		((Player)entity).sendMessage(msg);
	}

	@Override
	public void chat(String msg) {
		((Player)entity).chat(msg);
	}

	@Override
	public void performCommand(String c) {
		((Player)entity).performCommand(c);
	}

	@Override
	public float getExperience() {
		return ((Player)entity).getExp();
	}

	@Override
	public int getFood() {
		return ((Player)entity).getFoodLevel();
	}

	@Override
	public int getLevel() {
		return ((Player)entity).getLevel();
	}

	@Override
	public boolean getGameMode() {
		if (((Player)entity).getGameMode()==GameMode.CREATIVE)
			return true;
		return false;
			
	}

	@Override
	public void setFood(int f) {
		((Player)entity).setFoodLevel(f);
	}

	@Override
	public void setLevel(int l) {
		((Player)entity).setLevel(l);
	}

	@Override
	public void setExperience(float exp) {
		((Player)entity).setExp(exp);
	}

	@Override
	public void setTitle(String t) {
		SpoutManager.getPlayer((Player)entity).setTitle(t);
	}

	@Override
	public void setGameMode(boolean g) {
		if (g)
			((Player)entity).setGameMode(GameMode.CREATIVE);
		else
			((Player)entity).setGameMode(GameMode.SURVIVAL);
	}

	@SuppressWarnings({ "hiding", "unchecked" })
	@Override
	public <Player> Player getPlayer() {
		return ((Player)entity);
	}

	@Override
	public boolean isSleeping() {
		return ((Player)entity).isSleeping();
	}
	
}
