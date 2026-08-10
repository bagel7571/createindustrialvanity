package net.oxiditsu.createindustrialvanity.item;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.oxiditsu.createindustrialvanity.CreateIndustrialVanity;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateIndustrialVanity.MODID);

    // public static final DeferredItem<Item> BISMUTH = ITEMS.register("bismuth",
    //         () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}