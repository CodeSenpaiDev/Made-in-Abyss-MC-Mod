package codesenpai.madeinabyss.madeinabyssmod.init;

import codesenpai.madeinabyss.madeinabyssmod.MadeInAbyssConstants;

import codesenpai.madeinabyss.madeinabyssmod.block.ArtifactBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.Random;

public class Blocks
{
    public static final ArtifactBlock artifactblock = new ArtifactBlock();

    public static void init()
    {
        setName(artifactblock, "artifactblock");
    }

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Block> event)
    {
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(artifactblock);
    }

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event)
    {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(new ItemBlock(artifactblock).setRegistryName(artifactblock.getRegistryName()));
    }

    public static void setName(Block block, String name)
    {
        block.setRegistryName(new ResourceLocation(MadeInAbyssConstants.MODID, name));
        block.setUnlocalizedName(name);
    }

    public static Item getDrop(int layer, Random rand, int fortune)
    {
        Item dropItem =  Items.lowclassartifact1;
        int drop = rand.nextInt(2);

        if (layer == 1)
        {
            drop = rand.nextInt(2);
        }
        else if (layer == 2)
        {
            drop = rand.nextInt(3);
        }
        else if (layer == 3)
        {
            drop = rand.nextInt(4);
        }
        else if (layer == 4)
        {
            drop = rand.nextInt(5);
        }
        else if (layer == 6)
        {
            drop = rand.nextInt(6);
        }

        if (drop == 0)
        {
            dropItem = Items.lowclassartifact1;
        }
        else if (drop == 1)
        {
            dropItem = Items.lowclassartifact2;
        }


        return dropItem;
    }
}
