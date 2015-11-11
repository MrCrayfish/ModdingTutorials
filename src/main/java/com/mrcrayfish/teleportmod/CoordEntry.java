package com.mrcrayfish.teleportmod;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;

public class CoordEntry
{
	private String name;
	private int dimension;
	private int x, y, z;
	
	public CoordEntry(String name, int dimension, int x, int y, int z)
	{
		this.name = name;
		this.dimension = dimension;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public String getName()
	{
		return name;
	}

	public int getDimension()
	{
		return dimension;
	}
	
	public BlockPos getPos()
	{
		return new BlockPos(x, y, z);
	}
	
	public void writeEntryToNBT(NBTTagCompound nbt)
	{
		nbt.setString("name", name);
		nbt.setInteger("dimension", dimension);
		nbt.setInteger("posX", x);
		nbt.setInteger("posY", y);
		nbt.setInteger("posZ", z);
	}
	
	public static CoordEntry readEntryFromNBT(NBTTagCompound nbt)
	{
		return new CoordEntry(nbt.getString("name"), nbt.getInteger("dimension"), nbt.getInteger("posX"), nbt.getInteger("posY"), nbt.getInteger("posZ"));
	}
}



















