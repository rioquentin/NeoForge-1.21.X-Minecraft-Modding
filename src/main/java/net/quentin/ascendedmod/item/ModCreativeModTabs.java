package net.quentin.ascendedmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.quentin.ascendedmod.AscendedMod;
import net.quentin.ascendedmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AscendedMod.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ASCENDED_TAB = CREATIVE_MOD_TABS.register("ascended_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BRASS_INGOT.get()))
                .title(Component.translatable("creativetab.ascended_tab"))
                .displayItems((pParameters, pOutPut) -> {

                    //Items
                    pOutPut.accept(ModItems.RAW_TIN.get());
                    pOutPut.accept(ModItems.TIN_INGOT.get());
                    pOutPut.accept(ModItems.RAW_ZINC.get());

                    pOutPut.accept(ModItems.ZINC_INGOT.get());
                    pOutPut.accept(ModItems.BRASS_INGOT.get());
                    pOutPut.accept(ModItems.RAW_LEAD.get());
                    pOutPut.accept(ModItems.LEAD_INGOT.get());
                    pOutPut.accept(ModItems.RAW_SILVER.get());
                    pOutPut.accept(ModItems.SILVER_INGOT.get());
                    pOutPut.accept(ModItems.RAW_NICKEL.get());
                    pOutPut.accept(ModItems.NICKEL_INGOT.get());

                    pOutPut.accept(ModItems.BRONZE_INGOT.get());

                    pOutPut.accept(ModItems.EMBERSTONE.get());
                    pOutPut.accept(ModItems.CARMOT_GEM.get());
                    pOutPut.accept(ModItems.ELECTRUM_INGOT.get());

                    pOutPut.accept(ModItems.RAW_PLATINUM.get());
                    pOutPut.accept(ModItems.PLATINUM_INGOT.get());
                    pOutPut.accept(ModItems.RAW_TUNGSTEN.get());
                    pOutPut.accept(ModItems.TUNGSTEN_INGOT.get());
                    pOutPut.accept(ModItems.CRYSTAL.get());
                    pOutPut.accept(ModItems.SOULSTONE_GEM.get());
                    pOutPut.accept(ModItems.RAW_COBALT.get());
                    pOutPut.accept(ModItems.COBALT_INGOT.get());

                    pOutPut.accept(ModItems.METAL_DETECTOR);

                    //Blocks
                    pOutPut.accept(ModBlocks.TIN_ORE.get());
                    pOutPut.accept(ModBlocks.DEEPSLATE_TIN_ORE.get());
                    pOutPut.accept(ModBlocks.ZINC_ORE.get());
                    pOutPut.accept(ModBlocks.DEEPSLATE_ZINC_ORE.get());
                    pOutPut.accept(ModBlocks.LEAD_ORE.get());
                    pOutPut.accept(ModBlocks.DEEPSLATE_LEAD_ORE.get());
                    pOutPut.accept(ModBlocks.SILVER_ORE.get());
                    pOutPut.accept(ModBlocks.DEEPSLATE_SILVER_ORE.get());
                    pOutPut.accept(ModBlocks.NICKEL_ORE.get());
                    pOutPut.accept(ModBlocks.DEEPSLATE_NICKEL_ORE.get());

                    pOutPut.accept(ModBlocks.NETHER_EMBERSTONE_ORE.get());
                    pOutPut.accept(ModBlocks.NETHER_CARMOT_ORE.get());
                    pOutPut.accept(ModBlocks.DEEPSLATE_PLATINUM_ORE.get());
                    pOutPut.accept(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get());
                    pOutPut.accept(ModBlocks.END_STONE_CRYSTAL_ORE.get());
                    pOutPut.accept(ModBlocks.NETHER_SOULSTONE_ORE.get());
                    pOutPut.accept(ModBlocks.NETHER_COBALT_ORE.get());

                })
                .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
