package com.cheetahlabs.minequest.APIs;

public interface QuestLocation {
	
	QuestWorld getWorld();
	QuestBlock getBlock();
	double getX();
	double getY();
	double getZ();
	float getYaw();
	float getPitch();
	void setX(double x);
	void setY(double y);
	void setZ(double z);
	void setYaw(float y);
	void setPitch(float p);
	
	<T> T getNativeLocation();
	
}
