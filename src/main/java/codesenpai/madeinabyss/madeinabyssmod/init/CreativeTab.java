package codesenpai.madeinabyss.madeinabyssmod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class CreativeTab
{
    public static final CreativeTabs tab = new MadeInAbyssTab();

    public static class MadeInAbyssTab extends CreativeTabs
    {
        public MadeInAbyssTab()
        {
            super("madeinabysstab");
        }

        @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(Blocks.ANVIL);
        }
    }
}
