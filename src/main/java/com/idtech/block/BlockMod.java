package com.idtech.block;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Material;
//import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class BlockMod {

    //Basic Block
    public static final Block CASTLE_WALL = BlockUtils.createBasicBlock("castlewall", Material.STONE);
    public static final Item CASTLE_WALL_ITEM = BlockUtils.createBlockItem(CASTLE_WALL, CreativeModeTab.TAB_MISC);
    public static final Block HIGH_RADIATION_URANIUM_ORE = BlockUtils.createBasicBlock("highradiationuraniumore", Material.STONE, 0.5f);
    public static final Item HIGH_RADIATION_URANIUM_ORE_ITEM = BlockUtils.createBlockItem(HIGH_RADIATION_URANIUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final Block PURE_URANIUM_BLOCK = BlockUtils.createBasicBlock("pureuraniumblock", Material.METAL, 1.5f);
    public static final Item PURE_URANIUM_BLOCK_ITEM = BlockUtils.createBlockItem(PURE_URANIUM_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);

    @SubscribeEvent
    public static void registerBlockItems(RegistryEvent.Register<Item> event) {

        event.getRegistry().register(CASTLE_WALL_ITEM);
        event.getRegistry().register(HIGH_RADIATION_URANIUM_ORE_ITEM);
        event.getRegistry().register(PURE_URANIUM_BLOCK_ITEM);

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        event.getRegistry().register(CASTLE_WALL);
        event.getRegistry().register(HIGH_RADIATION_URANIUM_ORE);
        event.getRegistry().register(PURE_URANIUM_BLOCK);

    }
}





