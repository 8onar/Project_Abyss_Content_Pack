package io.eight_onar.projectabysscontentpack.init.custom.item;

import io.eight_onar.projectabysscontentpack.ProjectAbyssContentPack;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.PumpkinBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PAItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ProjectAbyssContentPack.MOD_ID);

    public static final RegistryObject<Item> PUPPY = ITEMS.register("puppy",
            () -> new Item(new Item.Properties().stacksTo(42)));
    public static final RegistryObject<Item> RAW_NYTHERITE = ITEMS.register("raw_nytherite",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> RAW_UMBRYTE = ITEMS.register("raw_umbryte",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> RAW_GRAVIUM = ITEMS.register("raw_gravium",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> NYTHERITE_INGOT = ITEMS.register("nytherite_ingot",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> UMBRYTE_INGOT = ITEMS.register("umbryte_ingot",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> GRAVIUM_INGOT = ITEMS.register("gravium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> NYTHERITE_NUGGET = ITEMS.register("nytherite_nugget",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> UMBRYTE_NUGGET = ITEMS.register("umbryte_nugget",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> GRAVIUM_NUGGET = ITEMS.register("gravium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
