package net.oxiditsu.createindustrialvanity.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.oxiditsu.createindustrialvanity.CreateIndustrialVanity;
import net.oxiditsu.createindustrialvanity.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CreateIndustrialVanity.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.STEEL_INGOT.get());
        basicItem(ModItems.COAL_DUST.get());
    }
}