package com.mrcrayfish.teleportmod.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.mrcrayfish.teleportmod.Reference;
import com.mrcrayfish.teleportmod.TeleportMod;
import com.mrcrayfish.teleportmod.blocks.BlockCoordTransporter;

public class TeleportBlocks {
	
	public static Block coord_transporter;
	
	public static void init()
	{
		coord_transporter = new BlockCoordTransporter(Material.cloth).setUnlocalizedName("coord_transporter").setCreativeTab(TeleportMod.tabTeleport);
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(coord_transporter, coord_transporter.getUnlocalizedName().substring(5));
	}	
	
	public static void registerRenders()
	{
		registerRender(coord_transporter);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
