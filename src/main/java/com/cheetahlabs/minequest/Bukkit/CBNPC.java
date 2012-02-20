package com.cheetahlabs.minequest.Bukkit;

import org.bukkit.Material;
import org.bukkit.entity.Entity;

import com.cheetahlabs.minequest.APIs.QuestLocation;
import com.cheetahlabs.minequest.APIs.QuestMaterial;
import com.cheetahlabs.minequest.APIs.QuestNPC;
import com.topcat.npclib.entity.HumanNPC;

public class CBNPC extends CBHuman implements QuestNPC {
	
	private static int counterid = 0;
	private int id;
	private QuestMaterial iteminhand;
	private boolean invulnerable;
	
	public CBNPC(HumanNPC h, boolean i){
		super((Entity)h);
		id = counterid;
		counterid++;
		invulnerable = i;
	}

	@Override
	public int getNPCID() {
		return id;
	}

	@Override
	public void setItemInHand(QuestMaterial l) {
		((HumanNPC)entity).setItemInHand(((CBMaterial)l).getItemType());
		iteminhand = l;
	}

	@Override
	public QuestMaterial getItemInHand() {
		if (iteminhand == null)
			return new CBMaterial(Material.AIR);
		return iteminhand;
	}

	@Override
	public void moveTo(QuestLocation l) {
		((HumanNPC)entity).moveTo((org.bukkit.Location)l.getNativeLocation());
	}

	@Override
	public void setName(String n) {
		((HumanNPC)entity).setName(n);
	}

	@Override
	public void respawn() {
		entity.teleport(entity.getLocation());
	}
	
	@Override
	public void damage(int d){
		((HumanNPC)entity).actAsHurt();
		if (!invulnerable){
			super.damage(d);
		}
	}

	@Override
	public void remove() {
		((HumanNPC)entity).removeFromWorld();
	}

	@Override
	public boolean isInvulnerable() {
		return invulnerable;
	}

	@Override
	public void setInvulnerable(boolean invulnerable) {
		this.invulnerable = invulnerable;		
	}
	
}
