package com.cheetahlabs.minequest.APIs;

public interface QuestLocation {
	
	QuestWorld getWorld();
	int getX();
	int getY();
	int getZ();
	float getYaw();
	float getPitch();
	
	<T> T getNativeLocation();
	
}
