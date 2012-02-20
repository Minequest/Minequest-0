package com.cheetahlabs.minequest.Bukkit;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import com.cheetahlabs.minequest.APIs.QuestMaterial;

public class CBMaterial extends MaterialData implements QuestMaterial {

	public CBMaterial(int type) {
		super(type);
	}
	
	public CBMaterial(int t, byte b) {
		super(t,b);
	}
	
	public CBMaterial(Material m) {
		super(m);
	}
	
	public CBMaterial(Material m, byte b) {
		super(m,b);
	}
	
	public CBMaterial(MaterialData m){
		super(m.getItemType());
	}

	@Override
	public int getItemId() {
		return this.getItemTypeId();
	}

	@Override
	public short getItemDamage() {
		return this.getData();
	}

	@Override
	public String[] getAliases() {
		String[] tr = {this.getItemType().name()};
		return tr;
	}

}
