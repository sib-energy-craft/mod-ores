package com.github.sib_energy_craft.ores.load;

import com.github.sib_energy_craft.energy_api.utils.Identifiers;
import com.github.sib_energy_craft.sec_utils.load.DefaultModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public final class PlacedFeatures implements DefaultModInitializer {
    public static final RegistryKey<PlacedFeature> TIN_ORE_UPPER;
    public static final RegistryKey<PlacedFeature> TIN_ORE_MIDDLE;
    public static final RegistryKey<PlacedFeature> TIN_ORE_SMALL;

    public static final RegistryKey<PlacedFeature> ORE_SILVER;
    public static final RegistryKey<PlacedFeature> ORE_SILVER_EXTRA;
    public static final RegistryKey<PlacedFeature> ORE_SILVER_LOWER;

    static {
        var foundInOverworld = BiomeSelectors.foundInOverworld();

        TIN_ORE_UPPER = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifiers.of("tin_ore_upper"));
        BiomeModifications.addFeature(foundInOverworld, GenerationStep.Feature.UNDERGROUND_ORES, TIN_ORE_UPPER);
        TIN_ORE_MIDDLE = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifiers.of("tin_ore_middle"));
        BiomeModifications.addFeature(foundInOverworld, GenerationStep.Feature.UNDERGROUND_ORES, TIN_ORE_MIDDLE);
        TIN_ORE_SMALL = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifiers.of("tin_ore_small"));
        BiomeModifications.addFeature(foundInOverworld, GenerationStep.Feature.UNDERGROUND_ORES, TIN_ORE_SMALL);

        ORE_SILVER = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifiers.of("ore_silver"));
        BiomeModifications.addFeature(foundInOverworld, GenerationStep.Feature.UNDERGROUND_ORES, ORE_SILVER);
        ORE_SILVER_EXTRA = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifiers.of("ore_silver_extra"));
        BiomeModifications.addFeature(foundInOverworld, GenerationStep.Feature.UNDERGROUND_ORES, ORE_SILVER_EXTRA);
        ORE_SILVER_LOWER = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifiers.of("ore_silver_lower"));
        BiomeModifications.addFeature(foundInOverworld, GenerationStep.Feature.UNDERGROUND_ORES, ORE_SILVER_LOWER);
    }

}
