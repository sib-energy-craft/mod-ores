package com.github.sib_energy_craft.ores.load;

import com.github.sib_energy_craft.energy_api.utils.Identifiers;
import com.github.sib_energy_craft.sec_utils.common.Identified;
import com.github.sib_energy_craft.sec_utils.load.DefaultModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static com.github.sib_energy_craft.sec_utils.utils.BlockUtils.register;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public final class Blocks implements DefaultModInitializer {
    public static final Identified<Block> TIN_ORE;
    public static final Identified<Block> RAW_TIN;
    public static final Identified<Block> DEEPSLATE_TIN_ORE;
    public static final Identified<Block> TIN_BLOCK;

    public static final Identified<Block> SILVER_ORE;
    public static final Identified<Block> RAW_SILVER;
    public static final Identified<Block> DEEPSLATE_SILVER_ORE;
    public static final Identified<Block> SILVER_BLOCK;

    public static final Identified<Block> SULFUR_ORE;
    public static final Identified<Block> DEEPSLATE_SULFUR_ORE;
    public static final Identified<Block> SULFUR_BLOCK;

    static {
        final var tinOreSettings = FabricBlockSettings.of(Material.STONE)
                .sounds(BlockSoundGroup.STONE)
                .strength(3, 3)
                .requiresTool();

        TIN_ORE = register(Identifiers.of("tin_ore"),
                new ExperienceDroppingBlock(tinOreSettings));

        final var rawTinSettings = FabricBlockSettings.of(Material.STONE)
                .sounds(BlockSoundGroup.STONE)
                .strength(5, 6)
                .requiresTool();

        RAW_TIN = register(Identifiers.of("raw_tin_block"), new Block(rawTinSettings));

        final var deepslateTinSettings = FabricBlockSettings.of(Material.STONE)
                .sounds(BlockSoundGroup.DEEPSLATE)
                .mapColor(MapColor.DEEPSLATE_GRAY)
                .strength(4.5f, 3)
                .requiresTool();

        DEEPSLATE_TIN_ORE = register(Identifiers.of("deepslate_tin_ore"),
                new ExperienceDroppingBlock(deepslateTinSettings));

        final var metalTinSettings = FabricBlockSettings.of(Material.METAL)
                .sounds(BlockSoundGroup.METAL)
                .strength(5, 6)
                .requiresTool();

        TIN_BLOCK = register(Identifiers.of("tin_block"), new Block(metalTinSettings));

        final var silverOreSettings = FabricBlockSettings.of(Material.STONE)
                .sounds(BlockSoundGroup.STONE)
                .strength(3, 3)
                .requiresTool();

        SILVER_ORE = register(Identifiers.of("silver_ore"),
                new ExperienceDroppingBlock(silverOreSettings));

        final var rawSilverSettings = FabricBlockSettings.of(Material.STONE)
                .sounds(BlockSoundGroup.STONE)
                .strength(5, 6)
                .requiresTool();

        RAW_SILVER = register(Identifiers.of("raw_silver_block"), new Block(rawSilverSettings));

        final var deepslateSilverSettings = FabricBlockSettings.of(Material.STONE)
                .sounds(BlockSoundGroup.DEEPSLATE)
                .mapColor(MapColor.DEEPSLATE_GRAY)
                .strength(4.5f, 3)
                .requiresTool();

        DEEPSLATE_SILVER_ORE = register(Identifiers.of("deepslate_silver_ore"),
                new ExperienceDroppingBlock(deepslateSilverSettings));

        final var metalSilverSettings = FabricBlockSettings.of(Material.METAL)
                .sounds(BlockSoundGroup.METAL)
                .strength(5, 6)
                .requiresTool();

        SILVER_BLOCK = register(Identifiers.of("silver_block"), new Block(metalSilverSettings));

        {
            final var sulfurOreSettings = FabricBlockSettings.of(Material.STONE)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(3, 3)
                    .requiresTool();

            SULFUR_ORE = register(Identifiers.of("sulfur_ore"),
                    new ExperienceDroppingBlock(sulfurOreSettings));

            final var deepslateSulfurSettings = FabricBlockSettings.of(Material.STONE)
                    .sounds(BlockSoundGroup.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(4.5f, 3)
                    .requiresTool();

            DEEPSLATE_SULFUR_ORE = register(Identifiers.of("deepslate_sulfur_ore"),
                    new ExperienceDroppingBlock(deepslateSulfurSettings));

            final var sulfurBlockSettings = FabricBlockSettings.of(Material.METAL)
                    .mapColor(MapColor.YELLOW)
                    .sounds(BlockSoundGroup.METAL)
                    .strength(5, 6)
                    .requiresTool();

            SULFUR_BLOCK = register(Identifiers.of("sulfur_block"), new Block(sulfurBlockSettings));
        }
    }
}
