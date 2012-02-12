package com.cheetahlabs.minequest;

import java.util.List;

import com.cheetahlabs.minequest.APIs.QuestItem;
import com.cheetahlabs.minequest.APIs.QuestNPC;
import com.cheetahlabs.minequest.APIs.QuestPlayer;
import com.cheetahlabs.minequest.APIs.QuestWorld;

public final class QuestManager {

	public static List<QuestPlayer> players;
	
	public static List<QuestItem> items;
	
	public static List<QuestNPC> npcs;
	
	public static List<QuestWorld> worlds;
	
	public static QuestPlayer getPlayer(String name){
		for (QuestPlayer q : players){
			if (q.getName().equalsIgnoreCase(name))
				return q;
		}
		return null;
	}
	
	public static QuestItem getItem(String name){
		for (QuestItem i : items){
			for (String a : i.getAliases()){
				if (a.equalsIgnoreCase(name))
					return i;
			}
		}
		return null;
	}
	
	public static QuestItem getItem(int id){
		return getItem(id,0);
	}
	
	public static QuestItem getItem(int id, int damage){
		for (QuestItem i : items){
			if (i.getItemId()==id)
				return i;
		}
		return null;
	}
	
	public static QuestWorld getWorld(String name){
		for (QuestWorld w : worlds){
			if (w.getName().equalsIgnoreCase(name))
				return w;
		}
		return null;
	}
	
	public static QuestNPC getNPC(String name){
		for (QuestNPC n : npcs){
			if (n.getName().equals(name))
				return n;
		}
		return null;
	}
	
	public static QuestNPC getNPC(int id){
		for (QuestNPC n : npcs){
			if (n.getNPCID()==id)
				return n;
		}
		return null;
	}
	
}
