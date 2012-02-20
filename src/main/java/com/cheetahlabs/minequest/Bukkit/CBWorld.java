package com.cheetahlabs.minequest.Bukkit;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.World;
import org.bukkit.entity.Player;

import com.cheetahlabs.minequest.BukkitStart;
import com.cheetahlabs.minequest.APIs.QuestEntity;
import com.cheetahlabs.minequest.APIs.QuestLocation;
import com.cheetahlabs.minequest.APIs.QuestPlayer;
import com.cheetahlabs.minequest.APIs.QuestWorld;

public class CBWorld implements QuestWorld {
	
	private World world;
	
	public CBWorld(World w){
		world = w;
	}

	@SuppressWarnings({ "unchecked", "hiding" })
	@Override
	public <World> World getNativeWorld() {
		return (World) world;
	}

	@Override
	public String getName() {
		return world.getName();
	}

	@Override
	public QuestPlayer[] getPlayers() {
		List<Player> plist = world.getPlayers();
		List<QuestPlayer> players = new ArrayList<QuestPlayer>();
		for (Player p : plist){
			players.add(BukkitStart.manager.getPlayer(p.getName()));
		}
		return (QuestPlayer[])players.toArray(new CBPlayer[players.size()]);
	}

	@Override
	public long getSeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public QuestLocation getSpawn() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UUID getUID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends QuestEntity> T spawn(QuestLocation l, Class<T> c) {
		// TODO Auto-generated method stub
		return null;
	}

}
