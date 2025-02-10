package io.github.lieonlion.lolmct.init;

import io.github.lieonlion.lolmct.MoreCraftingTables;
import io.github.lieonlion.lolmct.block.MoreCraftingTableBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class MctBlockInit {
    public static final MoreCraftingTableBlock SPRUCE_TABLE = new MoreCraftingTableBlock(MapColor.PODZOL, "spruce");
    public static final MoreCraftingTableBlock BIRCH_TABLE = new MoreCraftingTableBlock(MapColor.SAND, "birch");
    public static final MoreCraftingTableBlock JUNGLE_TABLE = new MoreCraftingTableBlock(MapColor.DIRT, "jungle");
    public static final MoreCraftingTableBlock ACACIA_TABLE = new MoreCraftingTableBlock(MapColor.COLOR_ORANGE, "acacia");
    public static final MoreCraftingTableBlock DARK_OAK_TABLE = new MoreCraftingTableBlock(MapColor.COLOR_BROWN, "dark_oak");
    public static final MoreCraftingTableBlock MANGROVE_TABLE = new MoreCraftingTableBlock(MapColor.COLOR_RED, "mangrove");
    public static final MoreCraftingTableBlock CHERRY_TABLE = new MoreCraftingTableBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD, "cherry");
    public static final MoreCraftingTableBlock PALE_OAK_TABLE = new MoreCraftingTableBlock(MapColor.QUARTZ, "pale_oak");
    public static final MoreCraftingTableBlock BAMBOO_TABLE = new MoreCraftingTableBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo");
    public static final MoreCraftingTableBlock CRIMSON_TABLE = new MoreCraftingTableBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson");
    public static final MoreCraftingTableBlock WARPED_TABLE = new MoreCraftingTableBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped");

    public static void registerBlocks() {
        registerBlock(SPRUCE_TABLE);
        registerBlock(BIRCH_TABLE);
        registerBlock(JUNGLE_TABLE);
        registerBlock(ACACIA_TABLE);
        registerBlock(DARK_OAK_TABLE);
        registerBlock(MANGROVE_TABLE);
        registerBlock(CHERRY_TABLE);
        registerBlock(PALE_OAK_TABLE);
        registerBlock(BAMBOO_TABLE);
        registerBlock(CRIMSON_TABLE);
        registerBlock(WARPED_TABLE);
    }

    private static void registerBlock(MoreCraftingTableBlock block) {
        String name = block.woodType + "_crafting_table";
        Registry.register(BuiltInRegistries.BLOCK, MoreCraftingTables.asId(name), block);
    }
}