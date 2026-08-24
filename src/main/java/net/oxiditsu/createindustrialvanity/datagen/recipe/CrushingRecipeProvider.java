package net.oxiditsu.createindustrialvanity.datagen.recipe;

import static com.simibubi.create.foundation.data.recipe.CommonMetal.ALUMINUM;
import static com.simibubi.create.foundation.data.recipe.CommonMetal.LEAD;
import static com.simibubi.create.foundation.data.recipe.CommonMetal.NICKEL;
import static com.simibubi.create.foundation.data.recipe.CommonMetal.OSMIUM;
import static com.simibubi.create.foundation.data.recipe.CommonMetal.PLATINUM;
import static com.simibubi.create.foundation.data.recipe.CommonMetal.QUICKSILVER;
import static com.simibubi.create.foundation.data.recipe.CommonMetal.SILVER;
import static com.simibubi.create.foundation.data.recipe.CommonMetal.TIN;
import static com.simibubi.create.foundation.data.recipe.CommonMetal.URANIUM;

import java.util.concurrent.CompletableFuture;
import java.util.function.UnaryOperator;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllItems;
import com.simibubi.create.AllTags;
import com.simibubi.create.AllTags.AllItemTags;
import com.simibubi.create.Create;
import com.simibubi.create.api.data.recipe.CrushingRecipeGen;
import com.simibubi.create.content.decoration.palettes.AllPaletteStoneTypes;
import com.simibubi.create.content.kinetics.crusher.CrushingRecipe;
import com.simibubi.create.content.processing.recipe.StandardProcessingRecipe;

import com.simibubi.create.foundation.data.recipe.CommonMetal;
import com.simibubi.create.foundation.data.recipe.Mods;
import net.createmod.catnip.lang.Lang;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import net.neoforged.neoforge.common.Tags;
import net.oxiditsu.createindustrialvanity.CreateIndustrialVanity;
import net.oxiditsu.createindustrialvanity.item.ModItems;

public final class CrushingRecipeProvider extends CrushingRecipeGen {

    GeneratedRecipe

            COAL_DUST = create(() -> Items.COAL_BLOCK, b -> b.duration(100)
            .output(ModItems.COAL_DUST, 9)
            .output(.25f, ModItems.COAL_DUST, 3));

    public CrushingRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, String defaultNamespace) {
        super(output, registries, defaultNamespace);
    }
}
