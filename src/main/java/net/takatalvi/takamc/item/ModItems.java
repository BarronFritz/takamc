package net.takatalvi.takamc.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.takatalvi.takamc.TakatalviMod;

public class ModItems {
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));

    // Helper Methods
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TakatalviMod.MOD_ID, name), item);
    }
    private static void addItemToGroup(Item item, RegistryKey<ItemGroup> group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> {
            entries.add(item);
        });

    }
    public static void registerModItems(String mod_id) {
        TakatalviMod.LOGGER.info("Registering mod items for " + mod_id);

        addItemToGroup(PINK_GARNET, ItemGroups.INGREDIENTS);
        addItemToGroup(RAW_PINK_GARNET, ItemGroups.INGREDIENTS);

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
//            entries.add(PINK_GARNET);
//        });
    }
}
