package net.pamimod.pamitribu.item.custom;

import com.mojang.realmsclient.gui.screens.RealmsSelectFileToUploadScreen;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pamimod.pamitribu.PamiTribu;

public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PamiTribu.MOD_ID);

    /*public static final RegistryObject<CreativeModeTab> PAMITRIBU_TAB = CREATIVE_MODE_TABS.register(("pamitribu_tab",
            () -> CreativeModeTab.builder().icon() -> new ItemStack());*/
}
