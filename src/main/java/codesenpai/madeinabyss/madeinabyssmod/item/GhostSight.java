package codesenpai.madeinabyss.madeinabyssmod.item;

import codesenpai.madeinabyss.madeinabyssmod.init.CreativeTab;
import codesenpai.madeinabyss.madeinabyssmod.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class GhostSight extends ItemArmor
{
    public GhostSight(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setCreativeTab(CreativeTab.tab);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
        if (Items.ghostsight.equals(itemStack.getItem()))
        {
            player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 20, 1));
        }
    }
}
