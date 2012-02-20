package com.cheetahlabs.minequest.Bukkit;

import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Entity;

import com.cheetahlabs.minequest.APIs.QuestEntity;
import com.cheetahlabs.minequest.APIs.QuestLocation;

public class CBEntity implements QuestEntity {

	public Entity entity;
	
	public CBEntity(Entity e){
		e = entity;
	}

	@Override
	public QuestLocation getLocation() {
		return new CBLocation(entity.getLocation());
	}

	@Override
	public UUID getUniqueID() {
		return entity.getUniqueId();
	}

	@Override
	public void teleport(QuestLocation l) {
		entity.teleport((Location)l.getNativeLocation());
	}

	@Override
	public void teleport(QuestEntity e) {
		teleport(e.getLocation());
	}

	@Override
	public int getEntityID() {
		return entity.getEntityId();
	}

}
