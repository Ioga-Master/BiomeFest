package com.iogamaster.biomefest;

import com.iogamaster.biomefest.biomes.Biomes;

import net.fabricmc.api.ModInitializer;

public class BiomeFest implements ModInitializer {

	@Override
	public void onInitialize() {
		Biomes.register();
		//Features.register();
	}
}
