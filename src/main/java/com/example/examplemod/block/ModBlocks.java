package com.example.examplemod.block;

import com.example.examplemod.ExampleMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static  final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ExampleMod.MODID);


    public static  void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
