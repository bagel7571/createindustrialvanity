package net.oxiditsu.createindustrialvanity.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.oxiditsu.createindustrialvanity.CreateIndustrialVanity;
import net.oxiditsu.createindustrialvanity.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(CreateIndustrialVanity.MODID);

    public static final DeferredBlock<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK).mapColor(MapColor.STONE)));
    public static final DeferredBlock<Block> INDUSTRIAL_BRONZE_BLOCK = registerBlock("industrial_bronze_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK).mapColor(MapColor.STONE)));
    public static final DeferredBlock<Block> VERDANT_INDUSTRIAL_BRONZE_BLOCK = registerBlock("verdant_industrial_bronze_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK).mapColor(MapColor.STONE)));
    public static final DeferredBlock<Block> SOLAR_STEEL_BLOCK = registerBlock("solar_steel_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK).mapColor(MapColor.STONE)));
    public static final DeferredBlock<Block> QUARTZ_IRON_BLOCK = registerBlock("quartz_iron_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK).mapColor(MapColor.STONE)));
    public static final DeferredBlock<Block> INDUSTRIAL_IRON_TILES = registerBlock("industrial_iron_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK).mapColor(MapColor.STONE)));
    public static final DeferredBlock<Block> WEATHERED_IRON_TILES = registerBlock("weathered_iron_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK).mapColor(MapColor.STONE)));
    public static final DeferredBlock<Block> IRON_TILES = registerBlock("iron_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL).mapColor(MapColor.STONE)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}