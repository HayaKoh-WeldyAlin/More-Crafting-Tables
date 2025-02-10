package io.github.lieonlion.lolmct.block;

import io.github.lieonlion.lolmct.MoreCraftingTables;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class MoreCraftingTableBlock extends CraftingTableBlock {
    public final String woodType;

    public MoreCraftingTableBlock(MapColor colour, String woodType) {
        super(Properties.ofFullCopy(Blocks.CRAFTING_TABLE).mapColor(colour)
                .setId(ResourceKey.create(Registries.BLOCK, MoreCraftingTables.asId(woodType + "_crafting_table"))));
        this.woodType = woodType;
    }

    public MoreCraftingTableBlock(MapColor colour, SoundType sound, String woodType) {
        super(Properties.ofFullCopy(Blocks.CRAFTING_TABLE).mapColor(colour).sound(sound)
                .setId(ResourceKey.create(Registries.BLOCK, MoreCraftingTables.asId(woodType + "_crafting_table"))));
        this.woodType = woodType;
    }
}