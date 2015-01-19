package com.mrcrayfish.teleportmod;

import com.mrcrayfish.teleportmod.init.TeleportItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TeleportTab extends CreativeTabs {

	public TeleportTab(String label) {
		super(label);
		this.setBackgroundImageName("teleport.png");
	}

	@Override
	public Item getTabIconItem() {
		return TeleportItems.coord_cache;
	}

}
