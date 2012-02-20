package com.cheetahlabs.minequest.Bukkit;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;

import com.cheetahlabs.minequest.APIs.QuestItemStacks;
import com.cheetahlabs.minequest.APIs.QuestMaterial;

public class CBItemStacks extends ItemStack implements QuestItemStacks {

	public CBItemStacks(int one) {
		super(one);
	}
	
	public CBItemStacks(int one, int two){
		super(one,two);
	}
	
	public CBItemStacks(int one, int two, short three){
		super(one,two,three);
	}
	
	public CBItemStacks(int one, int two, short three, Byte four){
		super(one,two,three,four);
	}
	
	public CBItemStacks(QuestMaterial m){
		super(m.getItemId(),1,m.getItemDamage());
	}
	
	public CBItemStacks(Material one) {
		super(one);
	}
	
	public CBItemStacks(Material one, int two){
		super(one,two);
	}
	
	public CBItemStacks(Material one, int two, short three){
		super(one,two,three);
	}
	
	public CBItemStacks(Material one, int two, short three, Byte four){
		super(one,two,three,four);
	}

	public CBItemStacks(ItemStack i) {
		super(i.getType(),i.getAmount(),i.getDurability());
	}

	@Override
	public QuestMaterial getInfo() {
		return new CBMaterial(this.getData());
	}

	@Override
	public void setInfo(QuestMaterial m) {
		this.setData((MaterialData) m);
	}

}
