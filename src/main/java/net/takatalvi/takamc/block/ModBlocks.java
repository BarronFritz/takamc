package net.takatalvi.takamc.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.takatalvi.takamc.TakatalviMod;

public class ModBlocks {
//    Create static Blocks here
    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
            ));
    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
            ));

//    Called From TakatalviMod
    public static void registerModBlocks() {
        TakatalviMod.LOGGER.info("Registering Mod Blocks for " + TakatalviMod.MOD_ID);

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
//            entries.add(ModBlocks.PINK_GARNET_BLOCK);
//            entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
//        });
    }
//    HELPER FUNCTIONS
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TakatalviMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TakatalviMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
}
