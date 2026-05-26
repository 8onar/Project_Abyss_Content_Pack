package io.eight_onar.projectabysscontentpack.data.generators;

import io.eight_onar.projectabysscontentpack.ProjectAbyssContentPack;
import io.eight_onar.projectabysscontentpack.init.custom.block.PABlocks;
import io.eight_onar.projectabysscontentpack.init.custom.tags.PATags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class PAItemTagGenerator extends ItemTagsProvider {
    public PAItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider,
                              CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, ProjectAbyssContentPack.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.LOGS_THAT_BURN).add(
                PABlocks.DRAGON_BLOOD_LOG.get().asItem(),
                PABlocks.DRAGON_BLOOD_WOOD.get().asItem()
        );
        this.tag(ItemTags.PLANKS).add(
          PABlocks.DRAGON_BLOOD_PLANKS.get().asItem()
        );
        this.tag(ItemTags.LOGS).add(
                PABlocks.DRAGON_BLOOD_LOG.get().asItem()
        );
        this.tag(PATags.Item.DRAGON_BLOOD_LOGS).add(
                PABlocks.DRAGON_BLOOD_LOG.get().asItem()
        );
    }

    @Override
    protected void copy(TagKey<Block> pBlockTag, TagKey<Item> pItemTag) {
        super.copy(pBlockTag, pItemTag);
    }

}

