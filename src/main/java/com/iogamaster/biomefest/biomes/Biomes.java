package com.iogamaster.biomefest.biomes;

import net.fabricmc.fabric.api.biome.v1.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.*;
import net.minecraft.world.biome.Biome;

public class Biomes {
// Template
	
	//public static final RegistryKey<Biome> BIOME_NAME_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("biomefest", "biome_name"));
	
	
	
	
// Version 0.1 Biomes
	
	//Flower Fields
	public static final RegistryKey<Biome> FLOWERFIELDS_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("biomefest", "flower_fields"));

	
	@SuppressWarnings("deprecation")
	public static void register() {
		
	    //Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier("biomefest", "biome_name"), BIOME_NAME_SURFACE_BUILDER);
	    //Registry.register(BuiltinRegistries.BIOME, BIOME_NAME_KEY.getValue(), BIOME_NAME);
	    
	    //OverworldBiomes.addContinentalBiome(BIOME_NAME_KEY, OverworldClimate.TEMPERATE, 2D);
	    //OverworldBiomes.addContinentalBiome(BIOME_NAME_KEY, OverworldClimate.COOL, 2D);
		
		
// Version 0.1 Biomes
		
		//Flower Fields
		Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier("biomefest", "flower_fields"), FlowerFields.FLOWERFIELDS_SURFACE_BUILDER);
	    Registry.register(BuiltinRegistries.BIOME, FLOWERFIELDS_KEY.getValue(), FlowerFields.FLOWERFIELDS);
	    
	    OverworldBiomes.addContinentalBiome(FLOWERFIELDS_KEY, OverworldClimate.TEMPERATE, 2D);
	    OverworldBiomes.addContinentalBiome(FLOWERFIELDS_KEY, OverworldClimate.COOL, 2D);
		
	}
}
