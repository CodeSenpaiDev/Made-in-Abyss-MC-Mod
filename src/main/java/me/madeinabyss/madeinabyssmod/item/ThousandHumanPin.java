package me.madeinabyss.madeinabyssmod.item;

import me.madeinabyss.madeinabyssmod.init.CreativeTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;


public class ThousandHumanPin extends Item
{
    public ThousandHumanPin()
    {
        setCreativeTab(CreativeTab.tab);
    }

        public ActionResult<ItemStack>  onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        if (!worldIn.isRemote)
        {
            playerIn.sendMessage(new TextComponentString("Used"));
            playerIn.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 999999999, playerIn.getScore()));
            playerIn.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 999999999, playerIn.getScore()));
            playerIn.addScore(1);
            ;
        }
        return new  ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}
