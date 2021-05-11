package codesenpai.madeinabyss.madeinabyssmod.init;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class Commands extends CommandBase
{
    @Override
    public String getName()
    {
        return "echo";
    }

    @Override
    public String getUsage(ICommandSender sender)
    {
        return "echo command";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] params) throws CommandException
    {
        if (params != null && params.length > 0)
        {
            for (String param : params)
            {
                String message = "Echo : " + param;
                TextComponentString text = new TextComponentString(message);
                text.getStyle().setColor(TextFormatting.AQUA);
                sender.sendMessage(text);
            }
        }
    }

    public static class MusicCommand implements ICommand
    {
        @Override
        public String getName()
        {
            return "musiccommand";
        }

        @Override
        public String getUsage(ICommandSender sender)
        {
            return "Let you listen to good music.";
        }

        @Override
        public List<String> getAliases()
        {
            List<String> commandAliases = new ArrayList();
            commandAliases.add("music");
            commandAliases.add("music play");
            return commandAliases;
        }

        @Override
        public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
        {
            if (sender instanceof EntityPlayer)
            {
                EntityPlayer player = (EntityPlayer) sender;
                player.playSound(SoundEvents.AMBIENT_CAVE, 100, 0);
                player.playSound(ModSounds.AMBIENT_MADEINABYSS_RIKUSTHEME, 100, 1);
                player.sendMessage(new TextComponentString("MUSIC"));
                player.addTag("music_tag");
            }

        }

        @Override
        public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
            return true;
        }

        @Override
        public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, @Nullable BlockPos targetPos) {
            return null;
        }

        @Override
        public boolean isUsernameIndex(String[] args, int index) {
            return false;
        }

        @Override
        public int compareTo(ICommand o) {
            return 0;
        }
    }
}
