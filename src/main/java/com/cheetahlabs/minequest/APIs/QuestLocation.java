package com.cheetahlabs.minequest.APIs;

public abstract class QuestLocation {

	public QuestWorld w;
	public int x;
	public int y;
	public int z;
	public float yaw;
	public float pitch;
	
	public QuestLocation(QuestWorld w, int x,
			int y, int z, float yaw, float pitch){
		this.w = w;
		this.x = x;
		this.y = y;
		this.z = z;
		this.yaw = yaw;
		this.pitch = pitch;
	}
	
}
