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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ONYX.get()))
                .title(Component.translatable("creativetab.ascended_tab"))
                .displayItems((pParameters, pOutPut) -> {

                    //Items
                    pOutPut.accept(ModItems.ONYX.get());
                    pOutPut.accept(ModItems.EMBER.get());

                    //Blocks
                    pOutPut.accept(ModBlocks.ONYX_ORE.get());
                    pOutPut.accept(ModBlocks.ONYX_BLOCK.get());
                    pOutPut.accept(ModBlocks.EMBER_ORE.get());

                })
                .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
