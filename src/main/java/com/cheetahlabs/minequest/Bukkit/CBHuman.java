package com.cheetahlabs.minequest.Bukkit;

import org.bukkit.entity.Entity;

import com.cheetahlabs.minequest.APIs.QuestHuman;

public class CBHuman extends CBEntity implements QuestHuman {

	public CBHuman(Entity e) {
		super(e);
	}

	@Override
	public int getHealth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setHealth(int h) {
		// TODO Auto-generated method stub

	}

	@Override
	public void damage(int d) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
