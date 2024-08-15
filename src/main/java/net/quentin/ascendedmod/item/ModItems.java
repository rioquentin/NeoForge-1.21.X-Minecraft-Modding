package net.quentin.ascendedmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.quentin.ascendedmod.AscendedMod;
import net.quentin.ascendedmod.item.custom.MetalDetectorItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AscendedMod.MOD_ID);

    //Custom Items
    public static final DeferredItem<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties()));

    public static final DeferredItem<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new MetalDetectorItem(new Item.Properties()));
    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new MetalDetectorItem(new Item.Properties()));

    public static final DeferredItem<Item> RAW_ZINC = ITEMS.register("raw_zinc",
            () -> new MetalDetectorItem(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
            () -> new MetalDetectorItem(new Item.Properties()));

    public static final DeferredItem<Item> BRASS_INGOT = ITEMS.register("brass_ingot",
            () -> new MetalDetectorItem(new Item.Properties()));

    public static final DeferredItem<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new MetalDetectorItem(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new MetalDetectorItem(new Item.Properties()));

    public static final DeferredItem<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new MetalDetectorItem(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new MetalDetectorItem(new Item.Properties()));

    public static final DeferredItem<Item> RAW_NICKEL = ITEMS.register("raw_nickel",
            () -> new MetalDetectorItem(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
            () -> new MetalDetectorItem(new Item.Properties()));

    //Base Function
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
