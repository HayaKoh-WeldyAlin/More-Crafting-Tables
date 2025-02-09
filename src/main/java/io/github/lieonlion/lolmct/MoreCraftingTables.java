package io.github.lieonlion.lolmct;

import io.github.lieonlion.lolmct.init.MctBlockInit;
import io.github.lieonlion.lolmct.init.MctItemInit;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;

public class MoreCraftingTables implements ModInitializer {
    public static final String MODID = "lolmct";

    @Override
    public void onInitialize() {
        MctBlockInit.registerBlocks();
        MctItemInit.registerItems();
    }

    public static ResourceLocation asId(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}