package com.cheetahlabs.minequest.APIs;

public interface QuestNPC extends QuestHuman {

	int getNPCID();
	void setItemInHand(QuestMaterial l);
	QuestMaterial getItemInHand();
	void moveTo(QuestLocation l);
	void setName(String n);
	void respawn();
	void remove();
	// override damage to check invulnerability
	void damage(int d);
	boolean isInvulnerable();
	void setInvulnerable(boolean invulnerable);
	
}
