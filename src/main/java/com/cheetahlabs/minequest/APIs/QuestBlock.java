package com.cheetahlabs.minequest.APIs;

import java.util.Collection;

public interface QuestBlock {

	void breakBlock();
	void breakBlock(QuestMaterial q);
	Collection<QuestItemStacks> getDrops();
	Collection<QuestItemStacks> getDrops(QuestItemStacks i);
	QuestLocation getLocation();
	QuestMaterial getType();
	void setType(QuestMaterial q);
	
}
