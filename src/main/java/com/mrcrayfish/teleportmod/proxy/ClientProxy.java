package com.mrcrayfish.teleportmod.proxy;

import com.mrcrayfish.teleportmod.init.TeleportBlocks;
import com.mrcrayfish.teleportmod.init.TeleportItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
		TeleportBlocks.registerRenders();
		TeleportItems.registerRenders();
	}
}
