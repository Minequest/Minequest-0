package com.cheetahlabs.minequest.APIs;

import java.util.UUID;

public interface QuestWorld {

	<W> W getNativeWorld();
	String getName();
	QuestPlayer[] getPlayers();
	long getSeed();
	QuestLocation getSpawn();
	UUID getUID();
	
	<T extends QuestEntity> T spawn(QuestLocation l, Class<T> c);
}
