package com.cheetahlabs.minequest.APIs;

import java.util.UUID;

public interface QuestEntity {

	QuestLocation getLocation();
	UUID getUniqueID();
	void teleport(QuestLocation l);
	void teleport(QuestEntity e);
	
}