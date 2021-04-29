package me.madeinabyss.madeinabyssmod.init;

import me.madeinabyss.madeinabyssmod.MadeInAbyssConstants;
import me.madeinabyss.madeinabyssmod.MadeInAbyssMod;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class Entitys
{
    public static void registerEntity()
    {
        //registerEntity("artifactpos", ArtifactPos.class, MadeInAbyssConstants.ARTIFACTPOS, 50, 3882255, 6338699);
    }
    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(MadeInAbyssConstants.MODID + ":" + name), entity, name, id, MadeInAbyssMod.getInstance(), range, 1, true, color1, color2);
    }
}
