package com.cheetahlabs.minequest.APIs;

public interface QuestItemStacks {

	int getAmount();
	void setAmount(int amt);
	QuestMaterial getInfo();
	void setInfo(QuestMaterial m);
	short getDurability();
	
}
