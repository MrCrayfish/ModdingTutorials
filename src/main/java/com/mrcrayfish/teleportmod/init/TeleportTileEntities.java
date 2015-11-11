package com.mrcrayfish.teleportmod.init;

import com.mrcrayfish.teleportmod.tileentity.TileEntityCoordTransporter;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TeleportTileEntities
{
	public static void register()
	{
		GameRegistry.registerTileEntity(TileEntityCoordTransporter.class, "tmCoordTransporter");
	}
}
