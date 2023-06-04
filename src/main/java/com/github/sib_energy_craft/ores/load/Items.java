package com.github.sib_energy_craft.ores.load;

import com.github.sib_energy_craft.energy_api.utils.Identifiers;
import com.github.sib_energy_craft.sec_utils.load.DefaultModInitializer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.Rarity;

import static com.github.sib_energy_craft.sec_utils.utils.ItemUtils.register;
import static com.github.sib_energy_craft.sec_utils.utils.ItemUtils.registerBlockItem;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public final class Items implements DefaultModInitializer {
    public static final BlockItem TIN_ORE_BLOCK;
    public static final BlockItem TIN_BLOCK;
    public static final BlockItem RAW_TIN_BLOCK;
    public static final BlockItem DEEPSLATE_TIN_ORE_BLOCK;

    public static final Item TIN_INGOT;
    public static final Item TIN_RAW_ORE;
    public static final Item TIN_NUGGET;
    
    public static final BlockItem SILVER_ORE_BLOCK;
    public static final BlockItem SILVER_BLOCK;
    public static final BlockItem RAW_SILVER_BLOCK;
    public static final BlockItem DEEPSLATE_SILVER_ORE_BLOCK;

    public static final Item SILVER_INGOT;
    public static final Item SILVER_RAW_ORE;
    public static final Item SILVER_NUGGET;


    public static final BlockItem SULFUR_ORE_BLOCK;
    public static final BlockItem DEEPSLATE_SULFUR_ORE_BLOCK;
    public static final Item SULFUR;
    public static final Item SULFUR_BLOCK;

    static {
        TIN_ORE_BLOCK = registerBlockItem(ItemGroups.BUILDING_BLOCKS, Blocks.TIN_ORE);
        TIN_BLOCK = registerBlockItem(ItemGroups.BUILDING_BLOCKS, Blocks.TIN_BLOCK);
        RAW_TIN_BLOCK = registerBlockItem(ItemGroups.BUILDING_BLOCKS, Blocks.RAW_TIN);
        DEEPSLATE_TIN_ORE_BLOCK = registerBlockItem(ItemGroups.BUILDING_BLOCKS, Blocks.DEEPSLATE_TIN_ORE);

        Item.Settings simpleMaterial = new Item.Settings()
                .rarity(Rarity.COMMON);

        TIN_INGOT = register(ItemGroups.INGREDIENTS, Identifiers.of("tin_ingot"), simpleMaterial);
        TIN_RAW_ORE = register(ItemGroups.INGREDIENTS, Identifiers.of("raw_tin"), simpleMaterial);
        TIN_NUGGET = register(ItemGroups.INGREDIENTS, Identifiers.of("tin_nugget"), simpleMaterial);
        
        SILVER_ORE_BLOCK = registerBlockItem(ItemGroups.BUILDING_BLOCKS, Blocks.SILVER_ORE);
        SILVER_BLOCK = registerBlockItem(ItemGroups.BUILDING_BLOCKS, Blocks.SILVER_BLOCK);
        RAW_SILVER_BLOCK = registerBlockItem(ItemGroups.BUILDING_BLOCKS, Blocks.RAW_SILVER);
        DEEPSLATE_SILVER_ORE_BLOCK = registerBlockItem(ItemGroups.BUILDING_BLOCKS, Blocks.DEEPSLATE_SILVER_ORE);
        SILVER_INGOT = register(ItemGroups.INGREDIENTS, Identifiers.of("silver_ingot"), simpleMaterial);
        SILVER_RAW_ORE = register(ItemGroups.INGREDIENTS, Identifiers.of("raw_silver"), simpleMaterial);
        SILVER_NUGGET = register(ItemGroups.INGREDIENTS, Identifiers.of("silver_nugget"), simpleMaterial);

        SULFUR_ORE_BLOCK = registerBlockItem(ItemGroups.BUILDING_BLOCKS, Blocks.SULFUR_ORE);
        DEEPSLATE_SULFUR_ORE_BLOCK = registerBlockItem(ItemGroups.BUILDING_BLOCKS, Blocks.DEEPSLATE_SULFUR_ORE);
        SULFUR = register(ItemGroups.INGREDIENTS, Identifiers.of("sulfur"), simpleMaterial);
        SULFUR_BLOCK = registerBlockItem(ItemGroups.BUILDING_BLOCKS, Blocks.SULFUR_BLOCK);
    }
}
