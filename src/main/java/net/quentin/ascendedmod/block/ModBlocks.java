package net.quentin.ascendedmod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.quentin.ascendedmod.AscendedMod;
import net.quentin.ascendedmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AscendedMod.MOD_ID);

    //Custom Blocks

    public static final DeferredBlock<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_ORE)));
    public static final DeferredBlock<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_COPPER_ORE)));

    public static final DeferredBlock<Block> ZINC_ORE = registerBlock("zinc_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_ORE)));
    public static final DeferredBlock<Block> DEEPSLATE_ZINC_ORE = registerBlock("deepslate_zinc_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_COPPER_ORE)));

    public static final DeferredBlock<Block> LEAD_ORE = registerBlock("lead_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));
    public static final DeferredBlock<Block> DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)));

    public static final DeferredBlock<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));
    public static final DeferredBlock<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)));

    public static final DeferredBlock<Block> NICKEL_ORE = registerBlock("nickel_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));
    public static final DeferredBlock<Block> DEEPSLATE_NICKEL_ORE = registerBlock("deepslate_nickel_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)));

    public static final DeferredBlock<Block> NETHER_EMBERSTONE_ORE = registerBlock("nether_emberstone_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE)));

    public static final DeferredBlock<Block> NETHER_CARMOT_ORE = registerBlock("nether_carmot_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE)));

    public static final DeferredBlock<Block> DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_DIAMOND_ORE)));

    public static final DeferredBlock<Block> DEEPSLATE_TUNGSTEN_ORE = registerBlock("deepslate_tungsten_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_DIAMOND_ORE)));

    public static final DeferredBlock<Block> END_STONE_CRYSTAL_ORE = registerBlock("end_stone_crystal_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));

    public static final DeferredBlock<Block> NETHER_SOULSTONE_ORE = registerBlock("nether_soulstone_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_GOLD_ORE)));

    public static final DeferredBlock<Block> NETHER_COBALT_ORE = registerBlock("nether_cobalt_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_GOLD_ORE)));


    //Base Functions
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return  toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
