package com.cheetahlabs.minequest.APIs;

public interface QuestManager {

	QuestPlayer getPlayer(String name);
	QuestBlock getBlock(QuestLocation l);
	QuestWorld getWorld(String name);
	QuestMaterial getMaterial(int id, short dmg);
	QuestLocation getLocation(QuestWorld w, double x, double y, double z, float yaw, float pitch);
	QuestNPC getNPC(int id);
	
}
