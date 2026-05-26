package io.eight_onar.projectabysscontentpack.data.generators;

import io.eight_onar.projectabysscontentpack.ProjectAbyssContentPack;
import io.eight_onar.projectabysscontentpack.init.custom.block.PABlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class PABlockTagGenerator extends BlockTagsProvider {
    public PABlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ProjectAbyssContentPack.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                PABlocks.WHITE_CRYSTAL_BLOCK.get(),
                PABlocks.LIGHT_GREEN_CRYSTAL_BLOCK.get(),
                PABlocks.BLUE_CRYSTAL_BLOCK.get(),
                PABlocks.VOLCANIC_TUFF_BLOCK.get(),
                PABlocks.CALCAREOUS_TUFF_BLOCK.get(),
                PABlocks.GEYSERITE_BLOCK.get(),
                PABlocks.NYTHERITE_ORE.get(),
                PABlocks.UMBRYTE_ORE.get(),
                PABlocks.GRAVIUM_ORE.get(),
                PABlocks.NYTHERITE_BLOCK.get(),
                PABlocks.UMBRYTE_BLOCK.get(),
                PABlocks.GRAVIUM_BLOCK.get()
                );
        this.tag(BlockTags.LOGS).add(
                    PABlocks.DRAGON_BLOOD_LOG.get()
                );

        this.tag(BlockTags.MINEABLE_WITH_AXE).add(
                PABlocks.DRAGON_BLOOD_LEAVES.get(),
                PABlocks.DRAGON_BLOOD_LOG.get(),
                PABlocks.DRAGON_BLOOD_PLANKS.get(),
//                PABlocks.DRAGON_BLOOD_SAPLING.get(),
                PABlocks.DRAGON_BLOOD_SLAB.get(),
                PABlocks.DRAGON_BLOOD_STAIRS.get(),
                PABlocks.DRAGON_BLOOD_WOOD.get()
        );
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(
                PABlocks.DARK_SAND.get(),
                PABlocks.DARK_GRAVEL.get()
        );

        this.tag(BlockTags.MINEABLE_WITH_HOE).add(
                PABlocks.SWEET_ALYSSUM.get()
        );

        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
                PABlocks.WHITE_CRYSTAL_BLOCK.get(),
                PABlocks.BLUE_CRYSTAL_BLOCK.get(),
                PABlocks.LIGHT_GREEN_CRYSTAL_BLOCK.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                PABlocks.NYTHERITE_BLOCK.get(),
                PABlocks.UMBRYTE_BLOCK.get(),
                PABlocks.GRAVIUM_BLOCK.get()
        );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
                PABlocks.NYTHERITE_ORE.get(),
                PABlocks.UMBRYTE_ORE.get(),
                PABlocks.GRAVIUM_ORE.get()
        );
        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);

        this.tag(BlockTags.LOGS_THAT_BURN).add(
                PABlocks.DRAGON_BLOOD_LOG.get(),
                PABlocks.DRAGON_BLOOD_WOOD.get()
        );
        this.tag(BlockTags.PLANKS).add(
                PABlocks.DRAGON_BLOOD_PLANKS.get()
        );
        this.tag(BlockTags.LOGS).add(
                PABlocks.DRAGON_BLOOD_LOG.get()
        );
        this.tag(BlockTags.SLABS).add(
                PABlocks.DRAGON_BLOOD_SLAB.get()
        );
        this.tag(BlockTags.STAIRS).add(
                PABlocks.DRAGON_BLOOD_STAIRS.get()
        );

        this.tag(BlockTags.SAND).add(
                PABlocks.DARK_SAND.get(),
                PABlocks.DARK_GRAVEL.get()
        );

    }
}
