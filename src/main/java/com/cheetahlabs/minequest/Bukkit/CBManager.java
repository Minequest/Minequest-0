package com.cheetahlabs.minequest.Bukkit;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

import com.cheetahlabs.minequest.APIs.QuestBlock;
import com.cheetahlabs.minequest.APIs.QuestEntity;
import com.cheetahlabs.minequest.APIs.QuestLocation;
import com.cheetahlabs.minequest.APIs.QuestManager;
import com.cheetahlabs.minequest.APIs.QuestMaterial;
import com.cheetahlabs.minequest.APIs.QuestNPC;
import com.cheetahlabs.minequest.APIs.QuestPlayer;
import com.cheetahlabs.minequest.APIs.QuestWorld;

public class CBManager implements QuestManager {
	
	private HashMap<String,QuestPlayer> players;
	private HashMap<String,QuestWorld> worlds;
	private HashMap<Integer,QuestMaterial> materials;
	private HashMap<Location,QuestLocation> locations;
	private HashMap<Integer,QuestNPC> npcs;

	@Override
	public QuestPlayer getPlayer(String name) {
		if (!players.containsKey(name.toLowerCase()))
			players.put(name.toLowerCase(),new CBPlayer(Bukkit.getPlayer(name.toLowerCase())));
		return players.get(name.toLowerCase());
	}
	
	@Override
	public QuestBlock getBlock(QuestLocation l) {
		return l.getBlock();
	}

	@Override
	public QuestWorld getWorld(String name) {
		if (!worlds.containsKey(name))
			worlds.put(name, new CBWorld(Bukkit.getWorld(name)));
		return worlds.get(name);
	}

	@Override
	public QuestMaterial getMaterial(int id, short dmg) {
		return new CBMaterial(id,(byte)dmg);
	}

	@Override
	public QuestLocation getLocation(QuestWorld w, double x, double y, double z, float yaw,
			float pitch) {
		Location l = new Location((World)w.getNativeWorld(),x,y,z, yaw, pitch);
		return new CBLocation(l);
	}

	@Override
	public QuestNPC getNPC(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
