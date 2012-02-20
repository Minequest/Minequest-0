package com.cheetahlabs.minequest.APIs;

public interface QuestPlayer extends QuestHuman {
	

	String getDisplayName();
	String getTitle();
	void kick();
	void kick(String msg);
	boolean hasPermission(String p);
	boolean isOnline();
	void sendMessage(String msg);
	void chat(String msg);
	void performCommand(String c);
	float getExperience();
	int getFood();
	int getLevel();
	boolean getGameMode();
	void setFood(int f);
	void setLevel(int l);
	void setExperience(float exp);
	void setTitle(String t);
	void setGameMode(boolean g);
	<E> E getPlayer();
	boolean isSleeping();
}
