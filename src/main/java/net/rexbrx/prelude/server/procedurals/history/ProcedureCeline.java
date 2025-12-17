package net.rexbrx.prelude.server.procedurals.history;

import net.minecraft.network.chat.Component;
import net.minecraft.world.level.LevelAccessor;
import net.rexbrx.prelude.prelude;

import java.util.Calendar;

public class ProcedureCeline
{
    public static void execute(LevelAccessor world) {
        if (!world.isClientSide() && world.getServer() != null)
            world.getServer().getPlayerList().broadcastSystemMessage(Component.literal((
                    Component.translatable("history.prelude.datalog1").getString() +
                            "\n" +
                            "Celine: " +
                            "Geneticist" +
                            "\n" +
                            "Type: " +
                            "Major Doctor" +
                            "\n" +
                            "Woman, 34 Years Old" +
                            "\n" +
                            "Worker ID:" +
                            "p345" +
                            "\n" +
                            "Nationality:" +
                            "Russian"
            )), true);


        prelude.LOGGER.info(Calendar.getInstance().getTime().toString());
        prelude.LOGGER.warn("Player Called Lore ;D");
    }

}
