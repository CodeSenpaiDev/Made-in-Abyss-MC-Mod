package me.madeinabyss.madeinabyssmod.init;

import me.madeinabyss.madeinabyssmod.MadeInAbyssConstants;
import me.madeinabyss.madeinabyssmod.item.*;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class Items
{
    public static final ItemArmor.ArmorMaterial airproducerMaterial = EnumHelper.addArmorMaterial("airproducerMaterial", MadeInAbyssConstants.MODID + ":airproducer", 10000, new int[]{3, 0, 0, 0}, 30, SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 0);
    public static final ItemArmor airproducer = new AirProducer(airproducerMaterial, 0,EntityEquipmentSlot.HEAD);
    public static final ItemArmor.ArmorMaterial ghostsightMaterial = EnumHelper.addArmorMaterial("ghostsightMaterial", MadeInAbyssConstants.MODID + ":ghostsight", 10000, new int[]{3, 0, 0, 0}, 30, SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 0);
    public static final ItemArmor ghostsight = new GhostSight(ghostsightMaterial, 0,EntityEquipmentSlot.HEAD);

    public static final Item lowclassartifact1 = new LowClassArtifact1();
    public static final Item lowclassartifact2 = new LowClassArtifact2();
    public static final Item grimripper = new GrimRipper();
    public static final Item nihlfont = new NihlFont();
    public static final Item thousandhumanpin = new ThousandHumanPin();

    public static void init()
    {
        setName(airproducer, "airproducer");
        setName(ghostsight, "ghostsight");
        setName(lowclassartifact1, "lowclassartifact1");
        setName(lowclassartifact2, "lowclassartifact2");
        setName(grimripper, "grimripper");
        setName(nihlfont, "nihlfont");
        setName(thousandhumanpin, "thousandhumanpin");
    }

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event)
    {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(airproducer);
        registry.register(ghostsight);
        registry.registerAll(lowclassartifact1, lowclassartifact2);
        registry.register(grimripper);
        registry.register(nihlfont);
        registry.register(thousandhumanpin);
    }

    public static void setName(Item item, String name)
    {
        item.setRegistryName(new ResourceLocation(MadeInAbyssConstants.MODID, name));
        item.setUnlocalizedName(name);
    }
}
