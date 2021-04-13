package me.madeinabyss.madeinabyssmod.item;

import me.madeinabyss.madeinabyssmod.init.CreativeTab;
import me.madeinabyss.madeinabyssmod.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class AirProducer extends ItemArmor
{
    public AirProducer(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setCreativeTab(CreativeTab.tab);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
        if (Items.airproducer.equals(itemStack.getItem()))
        {
            player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 20, 255));
        }
    }
}
