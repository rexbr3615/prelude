package net.rexbrx.prelude.server.util;

import net.minecraft.ResourceLocationException;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.rexbrx.prelude.prelude;

public class ModTags {
    public static class Blocks {


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(prelude.MODID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> CARNIVORE_FOODS = tag("carnivore_food");
        public static final TagKey<Item> HERBIVORE_FOODS = tag("herbivore_food");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(prelude.MODID, name));
        }
    }
}
