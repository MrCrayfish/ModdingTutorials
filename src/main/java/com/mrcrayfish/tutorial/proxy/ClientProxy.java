package com.mrcrayfish.tutorial.proxy;

import com.mrcrayfish.tutorial.init.TutorialBlocks;
import com.mrcrayfish.tutorial.init.TutorialItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
		TutorialBlocks.registerRenders();
		TutorialItems.registerRenders();
	}
}
