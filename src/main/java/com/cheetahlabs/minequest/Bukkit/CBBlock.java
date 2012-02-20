package com.cheetahlabs.minequest.Bukkit;

import java.util.ArrayList;
import java.util.Collection;

import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import com.cheetahlabs.minequest.APIs.QuestBlock;
import com.cheetahlabs.minequest.APIs.QuestItemStacks;
import com.cheetahlabs.minequest.APIs.QuestLocation;
import com.cheetahlabs.minequest.APIs.QuestMaterial;

public class CBBlock implements QuestBlock {

	private Block block;
	
	public CBBlock(Block b){
		block = b;
	}
	
	@Override
	public void breakBlock() {
		block.breakNaturally();
	}

	@Override
	public QuestLocation getLocation() {
		return new CBLocation(block.getLocation());
	}

	@Override
	public void breakBlock(QuestMaterial q) {
		CBMaterial c = (CBMaterial)q;
		block.breakNaturally(c.toItemStack());
	}

	@Override
	public Collection<QuestItemStacks> getDrops() {
		Collection<QuestItemStacks> a = new ArrayList<QuestItemStacks>();
		Collection<ItemStack> s = block.getDrops();
		for (ItemStack i : s){
			a.add((QuestItemStacks)new CBItemStacks(i));
		}
		return a;		
	}

	@Override
	public QuestMaterial getType() {
		return new CBMaterial(block.getType());
	}

	@Override
	public void setType(QuestMaterial q) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<QuestItemStacks> getDrops(QuestItemStacks i) {
		// TODO Auto-generated method stub
		return null;
	}

}
