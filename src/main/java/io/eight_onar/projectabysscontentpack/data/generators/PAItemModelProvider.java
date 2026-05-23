package io.eight_onar.projectabysscontentpack.data.generators;

import io.eight_onar.projectabysscontentpack.ProjectAbyssContentPack;
import io.eight_onar.projectabysscontentpack.init.custom.item.PAItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class PAItemModelProvider extends ItemModelProvider {
    public PAItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ProjectAbyssContentPack.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(PAItems.PUPPY);
        simpleItem(PAItems.RAW_GRAVIUM);
        simpleItem(PAItems.RAW_NYTHERITE);
        simpleItem(PAItems.RAW_UMBRYTE);
        simpleItem(PAItems.NYTHERITE_INGOT);
        simpleItem(PAItems.UMBRYTE_INGOT);
        simpleItem(PAItems.GRAVIUM_INGOT);
        simpleItem(PAItems.NYTHERITE_NUGGET);
        simpleItem(PAItems.UMBRYTE_NUGGET);
        simpleItem(PAItems.GRAVIUM_NUGGET);

    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
            new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ProjectAbyssContentPack.MOD_ID, "item/" + item.getId().getPath()));
    }
}
