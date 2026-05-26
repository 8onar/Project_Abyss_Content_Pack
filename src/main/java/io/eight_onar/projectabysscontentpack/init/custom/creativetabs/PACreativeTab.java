package io.eight_onar.projectabysscontentpack.init.custom.creativetabs;

import io.eight_onar.projectabysscontentpack.ProjectAbyssContentPack;
import io.eight_onar.projectabysscontentpack.init.custom.block.PABlocks;
import io.eight_onar.projectabysscontentpack.init.custom.item.PAItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class PACreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ProjectAbyssContentPack.MOD_ID);
// BLOCKS
    public static final RegistryObject<CreativeModeTab> TAB_BUILDING_ABYSS_BLOCKS = CREATIVE_MODE_TABS.register("tab_building_abyss_blocks",
            () -> CreativeModeTab
                    .builder()
                    .icon(() -> PABlocks.BLOCKY.get().asItem().getDefaultInstance())
                    .title(Component.translatable("ctab.building_abyss_blocks"))
                    .displayItems((pParameters, output) -> {
                        output.accept(PABlocks.GEYSERITE_BLOCK.get());
                        output.accept(PABlocks.CALCAREOUS_TUFF_BLOCK.get());
                        output.accept(PABlocks.VOLCANIC_TUFF_BLOCK.get());
                        output.accept(PABlocks.DARK_GRAVEL.get());
                        output.accept(PABlocks.DARK_SAND.get());
                        output.accept(PABlocks.BLUE_CRYSTAL_BLOCK.get());
                        output.accept(PABlocks.WHITE_CRYSTAL_BLOCK.get());
                        output.accept(PABlocks.LIGHT_GREEN_CRYSTAL_BLOCK.get());
                        output.accept(PABlocks.NYTHERITE_BLOCK.get());
                        output.accept(PABlocks.UMBRYTE_BLOCK.get());
                        output.accept(PABlocks.GRAVIUM_BLOCK.get());
                        output.accept(PABlocks.DRAGON_BLOOD_LOG.get());
                        output.accept(PABlocks.DRAGON_BLOOD_WOOD.get());
                        output.accept(PABlocks.DRAGON_BLOOD_PLANKS.get());
                        output.accept(PABlocks.DRAGON_BLOOD_STAIRS.get());
                        output.accept(PABlocks.DRAGON_BLOOD_SLAB.get());
                    }).build());
    public static final RegistryObject<CreativeModeTab> TAB_COLORED_ABYSS_BLOCKS = CREATIVE_MODE_TABS.register("tab_colored_abyss_blocks",
            () -> CreativeModeTab
                    .builder()
                    .icon(() -> PABlocks.BLOCKY.get().asItem().getDefaultInstance())
                    .title(Component.translatable("ctab.colored_abyss_blocks"))
                    .displayItems((pParameters, output) -> {
                       output.accept(PABlocks.BLOCKY.get());
                    }).build());
    public static final RegistryObject<CreativeModeTab> TAB_NATURAL_ABYSS_BLOCKS = CREATIVE_MODE_TABS.register("tab_natural_abyss_blocks",
            () -> CreativeModeTab
                    .builder()
                    .icon(() -> PABlocks.BLOCKY.get().asItem().getDefaultInstance())
                    .title(Component.translatable("ctab.natural_abyss_blocks"))
                    .displayItems((pParameters, output) -> {
                        output.accept(PABlocks.GEYSERITE_BLOCK.get());
                        output.accept(PABlocks.CALCAREOUS_TUFF_BLOCK.get());
                        output.accept(PABlocks.VOLCANIC_TUFF_BLOCK.get());
                        output.accept(PABlocks.DARK_GRAVEL.get());
                        output.accept(PABlocks.DARK_SAND.get());
                        output.accept(PABlocks.BLUE_CRYSTAL_BLOCK.get());
                        output.accept(PABlocks.WHITE_CRYSTAL_BLOCK.get());
                        output.accept(PABlocks.LIGHT_GREEN_CRYSTAL_BLOCK.get());
                        output.accept(PABlocks.SWEET_ALYSSUM.get());
                        output.accept(PABlocks.NYTHERITE_ORE.get());
                        output.accept(PABlocks.UMBRYTE_ORE.get());
                        output.accept(PABlocks.GRAVIUM_ORE.get());
                        output.accept(PABlocks.DRAGON_BLOOD_LEAVES.get());
                        output.accept(PABlocks.DRAGON_BLOOD_LOG.get());

                    }).build());
    public static final RegistryObject<CreativeModeTab> TAB_FUNC_ABYSS_BLOCKS = CREATIVE_MODE_TABS.register("tab_func_abyss_blocks",
            () -> CreativeModeTab
                    .builder()
                    .icon(() -> PABlocks.BLOCKY.get().asItem().getDefaultInstance())
                    .title(Component.translatable("ctab.func_abyss_blocks"))
                    .displayItems((pParameters, output) -> {
                        output.accept(PABlocks.BLOCKY.get());
                    }).build());
// ITEMS
    public static final RegistryObject<CreativeModeTab> TAB_ABYSS_TOOLS_UTILITIES_ITEMS = CREATIVE_MODE_TABS.register("tab_tools_utilities_abyss_items",
            ()-> CreativeModeTab
                    .builder()
                    .icon(() -> PAItems.PUPPY.get().getDefaultInstance())
                    .title(Component.translatable("ctab.tools_utilities_abyss_items"))
                    .displayItems((pParameters, output) -> {
                        output.accept(PAItems.PUPPY.get());
                    }).build());
    public static final RegistryObject<CreativeModeTab> TAB_INGREDIENTS_ABYSS_ITEMS = CREATIVE_MODE_TABS.register("tab_ingredients_abyss_items",
            ()-> CreativeModeTab
                    .builder()
                    .icon(() -> PAItems.PUPPY.get().getDefaultInstance())
                    .title(Component.translatable("ctab.ingridients_abyss_items"))
                    .displayItems((pParameters, output) -> {
                        output.accept(PAItems.NYTHERITE_INGOT.get());
                        output.accept(PAItems.UMBRYTE_INGOT.get());
                        output.accept(PAItems.GRAVIUM_INGOT.get());
                        output.accept(PAItems.RAW_NYTHERITE.get());
                        output.accept(PAItems.RAW_UMBRYTE.get());
                        output.accept(PAItems.RAW_GRAVIUM.get());
                        output.accept(PAItems.NYTHERITE_NUGGET.get());
                        output.accept(PAItems.UMBRYTE_NUGGET.get());
                        output.accept(PAItems.GRAVIUM_NUGGET.get());
                    }).build());
    public static final RegistryObject<CreativeModeTab> TAB_FOOD_DRINKS_ABYSS_ITEMS = CREATIVE_MODE_TABS.register("tab_food_drinks_abyss_items",
            ()-> CreativeModeTab
                    .builder()
                    .icon(() -> PAItems.PUPPY.get().getDefaultInstance())
                    .title(Component.translatable("ctab.food_drinks_abyss_items"))
                    .displayItems((pParameters, output) -> {
                        output.accept(PAItems.PUPPY.get());
                    }).build());
    public static final RegistryObject<CreativeModeTab> TAB_COMBAT_ABYSS_ITEMS = CREATIVE_MODE_TABS.register("tab_combat_abyss_items",
            ()-> CreativeModeTab
                    .builder()
                    .icon(() -> PAItems.PUPPY.get().getDefaultInstance())
                    .title(Component.translatable("ctab.combat_abyss_items"))
                    .displayItems((pParameters, output) -> {
                        output.accept(PAItems.PUPPY.get());
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
