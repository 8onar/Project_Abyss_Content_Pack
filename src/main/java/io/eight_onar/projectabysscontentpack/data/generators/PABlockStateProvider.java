package io.eight_onar.projectabysscontentpack.data.generators;

import io.eight_onar.projectabysscontentpack.ProjectAbyssContentPack;
import io.eight_onar.projectabysscontentpack.init.custom.block.PABlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

public class PABlockStateProvider extends BlockStateProvider {
    public PABlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ProjectAbyssContentPack.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        regBlockWithItem(PABlocks.BLUE_CRYSTAL_BLOCK);
        regBlockWithItem(PABlocks.LIGHT_GREEN_CRYSTAL_BLOCK);
        regBlockWithItem(PABlocks.WHITE_CRYSTAL_BLOCK);
        regBlockWithItem(PABlocks.GEYSERITE_BLOCK);
        regBlockWithItem(PABlocks.VOLCANIC_TUFF_BLOCK);
        regBlockWithItem(PABlocks.CALCAREOUS_TUFF_BLOCK);
        regBlockWithItem(PABlocks.DARK_GRAVEL);
        regBlockWithItem(PABlocks.DARK_SAND);
        regBlockWithItem(PABlocks.BLOCKY);
        regBlockWithItem(PABlocks.NYTHERITE_BLOCK);
        regBlockWithItem(PABlocks.UMBRYTE_BLOCK);
        regBlockWithItem(PABlocks.GRAVIUM_BLOCK);
        regBlockWithItem(PABlocks.DRAGON_BLOOD_LEAVES);
        regBlockWithItem(PABlocks.DRAGON_BLOOD_LOG);
        regBlockWithItem(PABlocks.DRAGON_BLOOD_PLANKS);
//        regBlockWithItem(PABlocks.DRAGON_BLOOD_SAPLING);
        regBlockWithItem(PABlocks.DRAGON_BLOOD_WOOD);
        regBlockWithItem(PABlocks.NYTHERITE_ORE);
        regBlockWithItem(PABlocks.UMBRYTE_ORE);
        regBlockWithItem(PABlocks.GRAVIUM_ORE);

        regStairBlocksWithItem(PABlocks.DRAGON_BLOOD_STAIRS, PABlocks.DRAGON_BLOOD_PLANKS);
        regSlabBlockWithItem(PABlocks.DRAGON_BLOOD_SLAB, PABlocks.DRAGON_BLOOD_PLANKS);
    }

    private void regBlockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    private void regSlabBlockWithItem(RegistryObject<SlabBlock> slabBlockRegistryObject, RegistryObject<Block> textureBlockRegistryObject){
        slabBlock((SlabBlock) slabBlockRegistryObject.get(),blockTexture(textureBlockRegistryObject.get()),blockTexture(textureBlockRegistryObject.get()));
        simpleBlockItem(slabBlockRegistryObject.get(),models().getExistingFile(
                modLoc("block/" + slabBlockRegistryObject.getId().getPath())));
    }
    private void regStairBlocksWithItem(RegistryObject<StairBlock> stairBlockRegistryObject, RegistryObject<Block> textureBlockRegistryObject){
       stairsBlock(stairBlockRegistryObject.get(), blockTexture(textureBlockRegistryObject.get()),blockTexture(textureBlockRegistryObject.get()), blockTexture(textureBlockRegistryObject.get()));
       simpleBlockItem(stairBlockRegistryObject.get(), models().getExistingFile(
               modLoc("block/" + stairBlockRegistryObject.getId().getPath())));
    }
}
