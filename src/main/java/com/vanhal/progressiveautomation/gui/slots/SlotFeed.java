package com.vanhal.progressiveautomation.gui.slots;


import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotFeed extends Slot {

	public SlotFeed(IInventory par1iInventory, int par2, int par3, int par4) {
		super(par1iInventory, par2, par3, par4);
	}
	
	public boolean isItemValid(ItemStack itemStack) {
		if (itemStack.getItem() == Items.wheat) return true;
		if (itemStack.getItem() == Items.wheat_seeds) return true;
		if (itemStack.getItem() == Items.carrot) return true;
		return false;
	}

}
