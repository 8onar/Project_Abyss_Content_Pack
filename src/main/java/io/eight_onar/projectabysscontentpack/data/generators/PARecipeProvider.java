package io.eight_onar.projectabysscontentpack.data.generators;

import io.eight_onar.projectabysscontentpack.ProjectAbyssContentPack;
import io.eight_onar.projectabysscontentpack.init.custom.block.PABlocks;
import io.eight_onar.projectabysscontentpack.init.custom.item.PAItems;
import io.eight_onar.projectabysscontentpack.init.custom.tags.PATags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Consumer;

public class PARecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> NYTHERITE_SMELTABLES = List.of(PAItems.RAW_NYTHERITE.get(),
            PABlocks.NYTHERITE_ORE.get()
    );
    private static final List<ItemLike> UMBRYTE_SMELTABLES = List.of(PAItems.RAW_UMBRYTE.get(),
            PABlocks.UMBRYTE_ORE.get()
    );
    private static final List<ItemLike> GRAVIUM_SMELTABLES = List.of(PAItems.RAW_GRAVIUM.get(),
            PABlocks.GRAVIUM_ORE.get()
    );

    public PARecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreBlasting(pWriter, NYTHERITE_SMELTABLES, RecipeCategory.MISC, PAItems.NYTHERITE_INGOT.get(), 0.25f, 250, "nytherite");
        oreBlasting(pWriter, UMBRYTE_SMELTABLES, RecipeCategory.MISC, PAItems.UMBRYTE_INGOT.get(), 0.25f, 250, "umbryte");
        oreBlasting(pWriter, GRAVIUM_SMELTABLES, RecipeCategory.MISC, PAItems.GRAVIUM_INGOT.get(), 0.25f, 250, "gravium");
        oreSmelting(pWriter, NYTHERITE_SMELTABLES, RecipeCategory.MISC, PAItems.NYTHERITE_INGOT.get(), 0.25f, 150, "nytherite");
        oreSmelting(pWriter, UMBRYTE_SMELTABLES, RecipeCategory.MISC, PAItems.UMBRYTE_INGOT.get(), 0.25f, 150, "umbryte");
        oreSmelting(pWriter, GRAVIUM_SMELTABLES, RecipeCategory.MISC, PAItems.GRAVIUM_INGOT.get(), 0.25f, 150, "gravium");
//ingots <-> blocks
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, PAItems.NYTHERITE_INGOT.get(), RecipeCategory.BUILDING_BLOCKS, PABlocks.NYTHERITE_BLOCK.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, PAItems.UMBRYTE_INGOT.get(), RecipeCategory.BUILDING_BLOCKS, PABlocks.UMBRYTE_BLOCK.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, PAItems.GRAVIUM_INGOT.get(), RecipeCategory.BUILDING_BLOCKS, PABlocks.GRAVIUM_BLOCK.get());
//ingots <-> nuggets
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, PAItems.NYTHERITE_NUGGET.get(), RecipeCategory.MISC, PAItems.NYTHERITE_INGOT.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, PAItems.UMBRYTE_NUGGET.get(), RecipeCategory.MISC, PAItems.UMBRYTE_INGOT.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, PAItems.GRAVIUM_NUGGET.get(), RecipeCategory.MISC, PAItems.GRAVIUM_INGOT.get());

        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, PABlocks.DRAGON_BLOOD_SLAB.get().asItem(), PABlocks.DRAGON_BLOOD_PLANKS.get().asItem());

        stairBuilder(PABlocks.DRAGON_BLOOD_STAIRS.get().asItem(), Ingredient.of(PABlocks.DRAGON_BLOOD_PLANKS.get())).unlockedBy(getHasName(PABlocks.DRAGON_BLOOD_PLANKS.get()), has(PABlocks.DRAGON_BLOOD_PLANKS.get())).save(pWriter);

        planksFromLog(pWriter, PABlocks.DRAGON_BLOOD_PLANKS.get().asItem(), PATags.Item.DRAGON_BLOOD_LOGS, 4);

        woodFromLogs(pWriter, PABlocks.DRAGON_BLOOD_WOOD.get().asItem(), PABlocks.DRAGON_BLOOD_LOG.get().asItem());

    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pUnpackedCategory, ItemLike pUnpacked, RecipeCategory pPackedCategory, ItemLike pPacked) {
        nineBlockStorageRecipes(pFinishedRecipeConsumer, pUnpackedCategory, pUnpacked, pPackedCategory, pPacked,ProjectAbyssContentPack.MOD_ID+":"+ getSimpleRecipeName(pPacked), (String)null, getSimpleRecipeName(pUnpacked), (String)null);
    }
    protected static void slab(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pPressurePlate, ItemLike pMaterial) {
        slabBuilder(pCategory, pPressurePlate, Ingredient.of(pMaterial)).unlockedBy(getHasName(pMaterial), has(pMaterial)).save(pFinishedRecipeConsumer);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike)).save(pFinishedRecipeConsumer, ProjectAbyssContentPack.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
