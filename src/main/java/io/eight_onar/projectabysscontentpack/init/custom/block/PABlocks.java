package io.eight_onar.projectabysscontentpack.init.custom.block;

import io.eight_onar.projectabysscontentpack.ProjectAbyssContentPack;
import io.eight_onar.projectabysscontentpack.init.custom.item.PAItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class PABlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ProjectAbyssContentPack.MOD_ID);

    public static final RegistryObject<Block> BLOCKY = registerBlock("blocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).sound(SoundType.GLASS).requiresCorrectToolForDrops().noLootTable()));
    public static final RegistryObject<Block> WHITE_CRYSTAL_BLOCK = registerBlock("white_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GREEN_CRYSTAL_BLOCK = registerBlock("lightgreen_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).requiresCorrectToolForDrops()));
    public static  final RegistryObject<Block> BLUE_CRYSTAL_BLOCK = registerBlock("blue_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> VOLCANIC_TUFF_BLOCK = registerBlock("volcanic_tuff_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALCAREOUS_TUFF_BLOCK = registerBlock("calcareous_tuff_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GEYSERITE_BLOCK = registerBlock("geyserite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NYTHERITE_ORE = registerBlock("nytherite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> UMBRYTE_ORE = registerBlock("umbryte_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAVIUM_ORE = registerBlock("gravium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SWEET_ALYSSUM = registerBlock("sweet_alyssum",
            () -> new PinkPetalsBlock(BlockBehaviour.Properties.copy(Blocks.PINK_PETALS).noCollission().noLootTable()));

    public static final RegistryObject<Block> NYTHERITE_BLOCK = registerBlock("nytherite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> UMBRYTE_BLOCK = registerBlock("umbryte_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAVIUM_BLOCK = registerBlock("gravium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));

//DragonBloodTreeBlocks
    public static final  RegistryObject<Block> DRAGON_BLOOD_LEAVES = registerBlock("dragon_blood_leaves",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final  RegistryObject<Block> DRAGON_BLOOD_LOG = registerBlock("dragon_blood_log",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final  RegistryObject<Block> DRAGON_BLOOD_PLANKS = registerBlock("dragon_blood_planks",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
//    public static final  RegistryObject<SaplingBlock> DRAGON_BLOOD_SAPLING = registerBlock("dragon_blood_sapling",
//        () -> new SaplingBlock();
    public static final  RegistryObject<SlabBlock> DRAGON_BLOOD_SLAB = registerBlock("dragon_blood_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
        public static final  RegistryObject<StairBlock> DRAGON_BLOOD_STAIRS = registerBlock("dragon_blood_stairs",
        () -> new StairBlock(() -> PABlocks.DRAGON_BLOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final  RegistryObject<Block> DRAGON_BLOOD_WOOD = registerBlock("dragon_blood_wood",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    //change pDustColors
    public static final RegistryObject<Block> DARK_SAND = registerBlock("dark_sand",
            () -> new SandBlock(5525356, BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistryObject<Block> DARK_GRAVEL = registerBlock("dark_gravel",
            () -> new SandBlock(4012367, BlockBehaviour.Properties.copy(Blocks.GRAVEL)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toRet = BLOCKS.register(name, block);
        registerBlockItem(name, toRet);
        return toRet;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return PAItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus){
    BLOCKS.register(eventBus);
    }
}
