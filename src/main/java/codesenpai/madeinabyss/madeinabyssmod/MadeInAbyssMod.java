package codesenpai.madeinabyss.madeinabyssmod;

import codesenpai.madeinabyss.madeinabyssmod.init.Commands;
import codesenpai.madeinabyss.madeinabyssmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

import static codesenpai.madeinabyss.madeinabyssmod.MadeInAbyssConstants.*;


@Mod(modid = MODID, name = NAME, version = VERSION)
public class MadeInAbyssMod
{
    @Mod.Instance
    private static MadeInAbyssMod instance;
    public static MadeInAbyssMod getInstance()
    {
        return instance;
    }

    @SidedProxy(serverSide = "codesenpai.madeinabyss.madeinabyssmod.proxy.CommonProxy", clientSide = "codesenpai.madeinabyss.madeinabyssmod.proxy.ClientProxy")
    private static CommonProxy proxy;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
        proxy.preinit(event);
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
        proxy.postinit(event);
    }

    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event)
    {
        event.registerServerCommand(new Commands());
        event.registerServerCommand(new Commands.MusicCommand());
    }
}
