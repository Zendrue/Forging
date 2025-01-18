package com.example.examplemod.block;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.ItemInit;
import com.example.examplemod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;

public class ModBlocks {
    public static  final DeferredRegister.Blocks BLOCKS =DeferredRegister.createBlocks(ExampleMod.MODID);

    public static  final DeferredBlock<net.minecraft.world.level.block.Block> BISMUTH_BLOCK = registerBlock("bismuth_block",
            ()-> new Block(BlockBehaviour.Properties.of()));

    public static DeferredBlock<Block> registerBlock(String name, Supplier<Block> block) {
        DeferredBlock<Block> blockReg = BLOCKS.register(name, block);
        ItemInit.ITEMS.register(name, () -> new BlockItem(blockReg.get(), new Item.Properties()));
        return blockReg;
    }
}
