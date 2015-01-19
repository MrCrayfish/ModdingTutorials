package com.mrcrayfish.teleportmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.mrcrayfish.teleportmod.init.TeleportBlocks;
import com.mrcrayfish.teleportmod.init.TeleportItems;
import com.mrcrayfish.teleportmod.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class TeleportMod {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final TeleportTab tabTeleport = new TeleportTab("tabTeleport");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		TeleportBlocks.init();
		TeleportBlocks.register();
		TeleportItems.init();
		TeleportItems.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
