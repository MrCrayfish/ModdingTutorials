package com.mrcrayfish.tutorial.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.mrcrayfish.tutorial.Reference;

public class TutorialItems {
	
	public static Item test_item;
	
	public static void init() {
		test_item = new Item().setUnlocalizedName("test_item");
	}
	
	public static void register()
	{
		GameRegistry.registerItem(test_item, test_item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(test_item);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
