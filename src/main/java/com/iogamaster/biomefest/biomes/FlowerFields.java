package com.iogamaster.biomefest.biomes;

import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class FlowerFields {

	  public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> FLOWERFIELDS_SURFACE_BUILDER = SurfaceBuilder.DEFAULT
			    .withConfig(new TernarySurfaceConfig(
			      Blocks.GRASS_BLOCK.getDefaultState(),
			      Blocks.DIRT.getDefaultState(),
			      Blocks.STONE.getDefaultState()));
			 
			  public static final Biome FLOWERFIELDS = createFlowerFields();
			 
			  public static Biome createFlowerFields() {
			    
			    SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
			    DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
			    DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100);
			 
			    GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
			    generationSettings.surfaceBuilder(FLOWERFIELDS_SURFACE_BUILDER);
			    DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);
			    DefaultBiomeFeatures.addLandCarvers(generationSettings);
			    DefaultBiomeFeatures.addDefaultLakes(generationSettings);
			    DefaultBiomeFeatures.addDungeons(generationSettings);
			    DefaultBiomeFeatures.addMineables(generationSettings);
			    DefaultBiomeFeatures.addDefaultOres(generationSettings);
			    DefaultBiomeFeatures.addDefaultDisks(generationSettings);
			    DefaultBiomeFeatures.addSprings(generationSettings);
			    DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);
			    
			    DefaultBiomeFeatures.addPlainsFeatures(generationSettings);
			    DefaultBiomeFeatures.addDefaultFlowers(generationSettings);
			    DefaultBiomeFeatures.addDefaultGrass(generationSettings);
			    DefaultBiomeFeatures.addExtraDefaultFlowers(generationSettings);
			    
			 
			    return (new Biome.Builder())
			      .precipitation(Biome.Precipitation.RAIN)
			      .category(Biome.Category.NONE)
			      .depth(0.125F)
			      .scale(0.05F)
			      .temperature(0.8F)
			      .downfall(0.4F)
			      .effects((new BiomeEffects.Builder())
			        .waterColor(0x3f76e4)
			        .waterFogColor(0x050533)
			        .fogColor(0xc0d8ff)
			        .skyColor(0x77adff)
			        .build())
			      .spawnSettings(spawnSettings.build())
			      .generationSettings(generationSettings.build())
			      .build();
			  }
	
}
