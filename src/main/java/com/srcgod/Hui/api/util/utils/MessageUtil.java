package com.srcgod.Hui.api.util.utils;

import com.srcgod.Hui.api.util.Minecraftable;
import com.mojang.realmsclient.gui.ChatFormatting;
import com.srcgod.Hui.impl.Client;

public class MessageUtil implements Minecraftable {
    public static MessageUtil INSTANCE;

    public static void sendMessage(String msg) {
        sendClientMessage("[" + ChatFormatting.LIGHT_PURPLE + Client.name + ChatFormatting.WHITE + "] " + msg);
    }

    public static void sendClientMessage(String message) {
        if (mc.player != null) {
//            mc.player.sendChatMessage(message);
        }
    }
}
