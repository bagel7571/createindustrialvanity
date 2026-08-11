package net.oxiditsu.createindustrialvanity.datagen;

import com.simibubi.create.AllTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.oxiditsu.createindustrialvanity.CreateIndustrialVanity;
import net.oxiditsu.createindustrialvanity.block.ModBlocks;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CreateIndustrialVanity.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.STEEL_BLOCK.get())
                .add(ModBlocks.INDUSTRIAL_BRONZE_BLOCK.get())
                .add(ModBlocks.VERDANT_INDUSTRIAL_BRONZE_BLOCK.get())
                .add(ModBlocks.SOLAR_STEEL_BLOCK.get())
                .add(ModBlocks.QUARTZ_IRON_BLOCK.get())
                .add(ModBlocks.INDUSTRIAL_IRON_TILES.get())
                .add(ModBlocks.WEATHERED_IRON_TILES.get())
                .add(ModBlocks.IRON_TILES.get());

        tag(AllTags.AllBlockTags.WRENCH_PICKUP.tag)
                .add(ModBlocks.STEEL_BLOCK.get())
                .add(ModBlocks.INDUSTRIAL_BRONZE_BLOCK.get())
                .add(ModBlocks.VERDANT_INDUSTRIAL_BRONZE_BLOCK.get())
                .add(ModBlocks.SOLAR_STEEL_BLOCK.get())
                .add(ModBlocks.QUARTZ_IRON_BLOCK.get())
                .add(ModBlocks.INDUSTRIAL_IRON_TILES.get())
                .add(ModBlocks.WEATHERED_IRON_TILES.get())
                .add(ModBlocks.IRON_TILES.get());

    }
}