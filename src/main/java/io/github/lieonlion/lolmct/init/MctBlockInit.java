package io.github.lieonlion.lolmct.init;

import io.github.lieonlion.lolmct.MoreCraftingTables;
import io.github.lieonlion.lolmct.block.MoreCraftingTableBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class MctBlockInit {
    public static final MoreCraftingTableBlock SPRUCE_TABLE = new MoreCraftingTableBlock(MapColor.PODZOL);
    public static final MoreCraftingTableBlock BIRCH_TABLE = new MoreCraftingTableBlock(MapColor.SAND);
    public static final MoreCraftingTableBlock JUNGLE_TABLE = new MoreCraftingTableBlock(MapColor.DIRT);
    public static final MoreCraftingTableBlock ACACIA_TABLE = new MoreCraftingTableBlock(MapColor.COLOR_ORANGE);
    public static final MoreCraftingTableBlock DARK_OAK_TABLE = new MoreCraftingTableBlock(MapColor.COLOR_BROWN);
    public static final MoreCraftingTableBlock MANGROVE_TABLE = new MoreCraftingTableBlock(MapColor.COLOR_RED);
    public static final MoreCraftingTableBlock CHERRY_TABLE = new MoreCraftingTableBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD);
    public static final MoreCraftingTableBlock BAMBOO_TABLE = new MoreCraftingTableBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD);
    public static final MoreCraftingTableBlock CRIMSON_TABLE = new MoreCraftingTableBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD);
    public static final MoreCraftingTableBlock WARPED_TABLE = new MoreCraftingTableBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD);

    public static void registerBlocks() {
        registerBlock("spruce_crafting_table", SPRUCE_TABLE);
        registerBlock("birch_crafting_table", BIRCH_TABLE);
        registerBlock("jungle_crafting_table", JUNGLE_TABLE);
        registerBlock("acacia_crafting_table", ACACIA_TABLE);
        registerBlock("dark_oak_crafting_table", DARK_OAK_TABLE);
        registerBlock("mangrove_crafting_table", MANGROVE_TABLE);
        registerBlock("cherry_crafting_table", CHERRY_TABLE);
        registerBlock("bamboo_crafting_table", BAMBOO_TABLE);
        registerBlock("crimson_crafting_table", CRIMSON_TABLE);
        registerBlock("warped_crafting_table", WARPED_TABLE);
    }

    private static void registerBlock(String name, Block block) {
        Registry.register(BuiltInRegistries.BLOCK, MoreCraftingTables.asId(name), block);
    }
}