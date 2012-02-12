package com.cheetahlabs.minequest.Bukkit;

import java.util.UUID;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UUID getUniqueID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void teleport(QuestLocation l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teleport(QuestEntity e) {
		// TODO Auto-generated method stub
		
	}

}
