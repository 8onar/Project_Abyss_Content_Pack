package io.eight_onar.projectabysscontentpack.init.custom.tags;

import io.eight_onar.projectabysscontentpack.ProjectAbyssContentPack;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class PATags {
    public static class Item {
        public static final TagKey<net.minecraft.world.item.Item> DRAGON_BLOOD_LOGS = create("dragon_blood_logs");



        private static TagKey<net.minecraft.world.item.Item> create(String pName) {
            return TagKey.create(Registries.ITEM, new ResourceLocation(ProjectAbyssContentPack.MOD_ID, pName));
        }
        public static TagKey<net.minecraft.world.item.Item> create(ResourceLocation name) {
            return TagKey.create(Registries.ITEM, name);
        }
    }
    public static class Block {
        public static final TagKey<net.minecraft.world.level.block.Block> DRAGON_BLOOD_LOG = create("dragon_blood_log");



        private static TagKey<net.minecraft.world.level.block.Block> create(String pName) {
            return TagKey.create(Registries.BLOCK, new ResourceLocation(ProjectAbyssContentPack.MOD_ID, pName));
        }
        public static TagKey<net.minecraft.world.level.block.Block> create(ResourceLocation name) {
            return TagKey.create(Registries.BLOCK, name);
        }
    }
}
