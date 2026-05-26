package io.eight_onar.projectabysscontentpack.data.generators.loot;

import io.eight_onar.projectabysscontentpack.init.custom.block.PABlocks;
import io.eight_onar.projectabysscontentpack.init.custom.item.PAItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class PABlockLootTables extends BlockLootSubProvider {
    public PABlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(PABlocks.WHITE_CRYSTAL_BLOCK.get());
        this.dropSelf(PABlocks.LIGHT_GREEN_CRYSTAL_BLOCK.get());
        this.dropSelf(PABlocks.BLUE_CRYSTAL_BLOCK.get());
        this.dropSelf(PABlocks.VOLCANIC_TUFF_BLOCK.get());
        this.dropSelf(PABlocks.CALCAREOUS_TUFF_BLOCK.get());
        this.dropSelf(PABlocks.GEYSERITE_BLOCK.get());
        this.dropSelf(PABlocks.NYTHERITE_BLOCK.get());
        this.dropSelf(PABlocks.UMBRYTE_BLOCK.get());
        this.dropSelf(PABlocks.GRAVIUM_BLOCK.get());
        this.dropSelf(PABlocks.DARK_GRAVEL.get());
        this.dropSelf(PABlocks.DARK_SAND.get());
        this.dropSelf(PABlocks.DRAGON_BLOOD_LEAVES.get());
        this.dropSelf(PABlocks.DRAGON_BLOOD_LOG.get());
        this.dropSelf(PABlocks.DRAGON_BLOOD_PLANKS.get());
//        this.dropSelf(PABlocks.DRAGON_BLOOD_SAPLING.get());
        this.dropSelf(PABlocks.DRAGON_BLOOD_SLAB.get());
        this.dropSelf(PABlocks.DRAGON_BLOOD_STAIRS.get());
        this.dropSelf(PABlocks.DRAGON_BLOOD_WOOD.get());

        this.add(PABlocks.NYTHERITE_ORE.get(), block -> createOreDrop(PABlocks.NYTHERITE_ORE.get(), PAItems.RAW_NYTHERITE.get()));
        this.add(PABlocks.UMBRYTE_ORE.get(), block -> createOreDrop(PABlocks.UMBRYTE_ORE.get(), PAItems.RAW_UMBRYTE.get()));
        this.add(PABlocks.GRAVIUM_ORE.get(), block -> createOreDrop(PABlocks.GRAVIUM_ORE.get(), PAItems.RAW_GRAVIUM.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return PABlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
