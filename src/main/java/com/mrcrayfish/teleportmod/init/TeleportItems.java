package com.mrcrayfish.teleportmod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.mrcrayfish.teleportmod.Reference;
import com.mrcrayfish.teleportmod.TeleportMod;
import com.mrcrayfish.teleportmod.items.ItemCoordinateCache;

public class TeleportItems {
	
	public static Item coord_cache;
	
	public static void init() {
		coord_cache = new ItemCoordinateCache().setUnlocalizedName("coord_cache").setCreativeTab(TeleportMod.tabTeleport);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(coord_cache, coord_cache.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(coord_cache);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
