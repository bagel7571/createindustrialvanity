package net.oxiditsu.createindustrialvanity.datagen.recipe;

import java.util.concurrent.CompletableFuture;

import com.simibubi.create.AllFluids;
import com.simibubi.create.AllItems;
import com.simibubi.create.AllTags.AllItemTags;
import com.simibubi.create.Create;
import com.simibubi.create.api.data.recipe.MixingRecipeGen;
import com.simibubi.create.content.processing.recipe.HeatCondition;

import com.simibubi.create.foundation.data.recipe.CreateRecipeProvider;
import com.simibubi.create.foundation.data.recipe.Mods;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluids;

import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.crafting.BlockTagIngredient;
import net.oxiditsu.createindustrialvanity.item.ModItems;

public final class MixingRecipeProvider extends MixingRecipeGen {

    GeneratedRecipe

            STEEL_INGOT = create("steel_ingot", b -> b
            .require(Items.IRON_INGOT)
            .require(ModItems.COAL_DUST.get())
            .output(ModItems.STEEL_INGOT.get(), 1)
            .requiresHeat(HeatCondition.HEATED));


    public MixingRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, String defaultNamespace) {
        super(output, registries, defaultNamespace);
    }
}
