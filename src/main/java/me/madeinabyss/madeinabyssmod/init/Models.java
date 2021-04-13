package me.madeinabyss.madeinabyssmod.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Models
{
    @SubscribeEvent
    public static void register(ModelRegistryEvent event)
    {
        register(Items.airproducer);
        register(Items.ghostsight);
        register(Items.lowclassartifact1);
        register(Items.lowclassartifact2);
        register(Items.grimripper);
        register(Items.nihlfont);
        register(Items.thousandhumanpin);
    }

    private static void register(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
