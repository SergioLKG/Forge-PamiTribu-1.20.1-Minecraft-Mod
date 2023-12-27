package net.pamimod.pamitribu.item.custom;

import com.mojang.realmsclient.gui.screens.RealmsSelectFileToUploadScreen;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pamimod.pamitribu.PamiTribu;

public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PamiTribu.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PAMITRIBU_TAB = CREATIVE_MODE_TABS.register("pamitribu_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NAVAJA.get()))
                    .title(Component.translatable("creativetab.pamitribu_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.NAVAJA.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
