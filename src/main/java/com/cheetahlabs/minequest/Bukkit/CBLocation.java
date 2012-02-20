package com.cheetahlabs.minequest.Bukkit;

import org.bukkit.World;
import org.bukkit.Location;

import com.cheetahlabs.minequest.APIs.QuestBlock;
import com.cheetahlabs.minequest.APIs.QuestLocation;
import com.cheetahlabs.minequest.APIs.QuestWorld;

public class CBLocation implements QuestLocation {

	private Location location;
	
	public CBLocation(QuestWorld w, double x, double y, double z){
		this (w,x,y,z,0,0);
	}
	
	public CBLocation(QuestWorld w,
			double x, double y, double z, float yaw, float pitch){
		location = new Location((World)w.getNativeWorld(),x,y,z,yaw,pitch);
	}
	
	public CBLocation(Location l){
		location = l;
	}
	
	@Override
	public QuestWorld getWorld() {
		return new CBWorld(location.getWorld());
	}

	@Override
	public double getX() {
		return location.getX();
	}

	@Override
	public double getY() {
		return location.getY();
	}

	@Override
	public double getZ() {
		return location.getZ();
	}

	@Override
	public float getYaw() {
		return location.getYaw();
	}

	@Override
	public float getPitch() {
		return location.getPitch();
	}
	

	@Override
	public void setX(double x) {
		location.setX(x);
	}

	@Override
	public void setY(double y) {
		location.setY(y);
	}

	@Override
	public void setZ(double z) {
		location.setZ(z);
	}

	@Override
	public void setYaw(float y) {
		location.setYaw(y);
	}

	@Override
	public void setPitch(float p) {
		location.setPitch(p);
	}

	@SuppressWarnings({ "hiding", "unchecked" })
	@Override
	public <Location> Location getNativeLocation() {
		return (Location) location;
	}

	@Override
	public QuestBlock getBlock() {
		return new CBBlock(location.getBlock());
	}


}
