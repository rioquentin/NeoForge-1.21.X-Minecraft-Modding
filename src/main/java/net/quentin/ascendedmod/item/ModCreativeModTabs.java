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
                    pOutPut.accept(ModItems.RAW_LEAD.get());
                    pOutPut.accept(ModItems.LEAD_INGOT.get());
                    pOutPut.accept(ModItems.RAW_SILVER.get());
                    pOutPut.accept(ModItems.SILVER_INGOT.get());
                    pOutPut.accept(ModItems.RAW_NICKEL.get());
                    pOutPut.accept(ModItems.NICKEL_INGOT.get());

                    pOutPut.accept(ModItems.BRASS_INGOT.get());


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

                })
                .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
