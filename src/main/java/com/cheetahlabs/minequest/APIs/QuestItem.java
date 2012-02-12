package com.cheetahlabs.minequest.APIs;

public interface QuestItem extends QuestEntity{

	int getItemId();
	int getItemDamage();
	String[] getAliases();
	
}
