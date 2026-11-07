package com.elitebosses.registry;

import com.elitebosses.EliteBosses;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EliteBosses.MODID);

    public static final RegistryObject<Item> CHOCOLATE_SPAWN_EGG = ITEMS.register("chocolate_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.CHOCOLATE, 0x3B1F0E, 0xC98A4B, new Item.Properties()));

    public static final RegistryObject<Item> HOUNDMASTER_SPAWN_EGG = ITEMS.register("houndmaster_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.HOUNDMASTER, 0x1A1414, 0xB01010, new Item.Properties()));

    private ModItems() {
    }
}
