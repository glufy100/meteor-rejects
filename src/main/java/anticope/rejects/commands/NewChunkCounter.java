package anticope.rejects.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import meteordevelopment.meteorclient.commands.Command;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import net.minecraft.command.CommandSource;
import net.minecraft.text.Text;
import anticope.rejects.modules.NewerNewChunks;

import static com.mojang.brigadier.Command.SINGLE_SUCCESS;

public class NewChunkCounter extends Command {
    public NewChunkCounter() {
        super("newchunkcount", "Counts how many chunks have been saved with NewerNewChunks.");
    }
    @Override
    public void build(LiteralArgumentBuilder<CommandSource> builder) {
        NewerNewChunks n=new NewerNewChunks();
        builder.then(literal("NewChunks").executes(ctx -> {
            n.chunkcounterticks=0;
            n.chunkcounter=true;
            int chunks = n.newchunksfound;
            ChatUtils.sendMsg(Text.of(chunks+"  NewChunk locations have been saved by NewerNewChunks in this dimension."));
            return SINGLE_SUCCESS;
        }));
        builder.then(literal("OldChunks").executes(ctx -> {
            n.chunkcounterticks=0;
            n.chunkcounter=true;
            int chunks = n.oldchunksfound;
            ChatUtils.sendMsg(Text.of(chunks+"  OldChunk locations have been saved by NewerNewChunks in this dimension."));
            return SINGLE_SUCCESS;
        }));
        builder.then(literal("BeingUpdatedChunks").executes(ctx -> {
            n.chunkcounterticks=0;
            n.chunkcounter=true;
            int chunks = n.beingUpdatedOldChunksfound;
            ChatUtils.sendMsg(Text.of(chunks+"  BeingUpdatedChunks locations have been saved by NewerNewChunks in this dimension."));
            return SINGLE_SUCCESS;
        }));
        builder.then(literal("OldGenerationChunks").executes(ctx -> {
            n.chunkcounterticks=0;
            n.chunkcounter=true;
            int chunks = n.OldGenerationOldChunksfound;
            ChatUtils.sendMsg(Text.of(chunks+"  OldGenerationChunks locations have been saved by NewerNewChunks in this dimension."));
            return SINGLE_SUCCESS;
        }));
        builder.then(literal("BlockExploitChunks").executes(ctx -> {
            n.chunkcounterticks=0;
            n.chunkcounter=true;
            int chunks = n.tickexploitchunksfound;
            ChatUtils.sendMsg(Text.of(chunks+"  BlockExploitChunk locations have been saved by NewerNewChunks in this dimension."));
            return SINGLE_SUCCESS;
        }));
        builder.executes(ctx -> {
            n.chunkcounterticks=0;
            n.chunkcounter=true;
            int chunks1 = n.newchunksfound;
            int chunks3 = n.tickexploitchunksfound;
            int chunks2 = n.oldchunksfound;
            int chunks4 = n.beingUpdatedOldChunksfound;
            int chunks5 = n.OldGenerationOldChunksfound;
            ChatUtils.sendMsg(Text.of("New: "+chunks1+" | BlockExploitChunk: "+chunks3+" | Old: "+chunks2+" | BeingUpdatedChunks: "+chunks4+" |  OldGenerationChunks: "+chunks5+" | Chunk locations have been saved by NewerNewChunks in this dimension."));
            return SINGLE_SUCCESS;
        });
    }
}