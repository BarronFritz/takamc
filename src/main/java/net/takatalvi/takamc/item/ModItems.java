package net.takatalvi.takamc.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.takatalvi.takamc.TakatalviMod;

public class ModItems {
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));

    // Helper Methods
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TakatalviMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TakatalviMod.LOGGER.info("Registering mod items for " + TakatalviMod.MOD_ID);

        // This is done in ModItemGroups now
//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
//            entries.add(PINK_GARNET);
//            entries.add(RAW_PINK_GARNET);
//        });
    }
}
