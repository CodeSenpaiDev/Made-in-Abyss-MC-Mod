package codesenpai.madeinabyss.madeinabyssmod.proxy;

import codesenpai.madeinabyss.madeinabyssmod.init.Blocks;
import codesenpai.madeinabyss.madeinabyssmod.init.Items;
import codesenpai.madeinabyss.madeinabyssmod.init.ModSounds;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void preinit(FMLPreInitializationEvent event)
    {
        Items.init();
        Blocks.init();

        MinecraftForge.EVENT_BUS.register(Items.class);
        MinecraftForge.EVENT_BUS.register(Blocks.class);

    }
    public void init(FMLInitializationEvent event)
    {
        ModSounds.registerSounds();

    }
    public void postinit(FMLPostInitializationEvent event)
    {

    }
}
