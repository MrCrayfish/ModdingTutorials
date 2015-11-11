package com.mrcrayfish.teleportmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;

import com.mrcrayfish.teleportmod.TeleportMod;
import com.mrcrayfish.teleportmod.gui.GuiNameCoord;
import com.mrcrayfish.teleportmod.items.ItemCoordinateCache;
import com.mrcrayfish.teleportmod.tileentity.TileEntityCoordTransporter;

public class BlockCoordTransporter extends Block implements ITileEntityProvider {

	public BlockCoordTransporter(Material materialIn) {
		super(materialIn);
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	@Override
	public boolean isFullCube()
	{
		return false;
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		ItemStack stack = playerIn.getCurrentEquippedItem();
		if(stack != null)
		{
			if(stack.getItem() instanceof ItemCoordinateCache)
			{
				if(stack.getItem().hasEffect(stack))
				{
					TileEntityCoordTransporter tect = (TileEntityCoordTransporter) worldIn.getTileEntity(pos);
					stack.stackSize--;
					playerIn.addChatMessage(new ChatComponentText("Added cordinate cache to tile entity"));
				}
			}
		}
		return true;
	}
	
	@Override
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.CUTOUT;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TileEntityCoordTransporter();
	}
}
