package net.pamimod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.pamimod.pamitribu.PamiTribu;

public class ModTags {



    public static class Blocks {
        private  static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(PamiTribu.MOD_ID, name));
        }
        public static final TagKey<Block> NEEDS_IRON_TOOL = tag("needs_iron_tools");
    }

    public static class Items {
        private  static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(PamiTribu.MOD_ID, name));
        }
    }

}
