package com.cheetahlabs.minequest.APIs;

public interface QuestHuman extends QuestEntity {

	int getHealth();
	void setHealth(int h);
	void damage(int health);
	String getName();
	
}
