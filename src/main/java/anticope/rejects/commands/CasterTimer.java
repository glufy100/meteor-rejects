package anticope.rejects.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import meteordevelopment.meteorclient.commands.Command;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import net.minecraft.command.CommandSource;
import net.minecraft.text.Text;
import anticope.rejects.modules.AutoLavaCaster;

import static com.mojang.brigadier.Command.SINGLE_SUCCESS;

public class CasterTimer extends Command {
    public CasterTimer() {
        super("castertimer", "Calculates how long this cycle has been going for in AutoLavaCaster.");
    }

    @Override
        public void build(LiteralArgumentBuilder<CommandSource> builder) {
        builder.executes(context -> {
            AutoLavaCaster a=new AutoLavaCaster();
           int time = a.lavamountainticks/20;
           if (!(time==0)){
            ChatUtils.sendMsg(Text.of("This Cycle has been going for "+time+" Seconds."));}
           else if (time==0){
               error("AutoLavaCaster not started. Make more Mountains.");
           }
            return SINGLE_SUCCESS;
        });
        }
}
