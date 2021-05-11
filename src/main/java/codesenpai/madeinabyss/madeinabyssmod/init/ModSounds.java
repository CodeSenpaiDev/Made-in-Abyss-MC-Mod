package codesenpai.madeinabyss.madeinabyssmod.init;

import codesenpai.madeinabyss.madeinabyssmod.MadeInAbyssConstants;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModSounds
{
    public static SoundEvent
            AMBIENT_MADEINABYSS_THEFIRSTLAYER,
            AMBIENT_MADEINABYSS_MADEINABYSS,
            AMBIENT_MADEINABYSS_TOTHEABYSS,
            AMBIENT_MADEINABYSS_GALLANTRY,
            AMBIENT_MADEINABYSS_PATHWAY,
            AMBIENT_MADEINABYSS_TOMORROW,
            AMBIENT_MADEINABYSS_THEMEOFREG,
            AMBIENT_MADEINABYSS_RIKUSTHEME;


    public static void registerSounds()
    {
        AMBIENT_MADEINABYSS_THEFIRSTLAYER = registerSound("ambient.madeinabyss.thefirstlayer");
        AMBIENT_MADEINABYSS_MADEINABYSS = registerSound("ambient.madeinabyss.madeinabyss");
        AMBIENT_MADEINABYSS_TOTHEABYSS = registerSound("ambient.madeinabyss.totheabyss");
        AMBIENT_MADEINABYSS_GALLANTRY = registerSound("ambient.madeinabyss.gallantry");
        AMBIENT_MADEINABYSS_PATHWAY = registerSound("ambient.madeinabyss.pathway");
        AMBIENT_MADEINABYSS_TOMORROW = registerSound("ambient.madeinabyss.tomorrow");
        AMBIENT_MADEINABYSS_THEMEOFREG = registerSound("ambient.madeinabyss.themeofreg");
        AMBIENT_MADEINABYSS_RIKUSTHEME = registerSound("ambient.madeinabyss.rikustheme");
    }

        private static SoundEvent registerSound(String name)
    {
        ResourceLocation location = new ResourceLocation(MadeInAbyssConstants.MODID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}
