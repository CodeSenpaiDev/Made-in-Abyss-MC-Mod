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
}
