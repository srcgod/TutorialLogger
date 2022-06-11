package com.srcgod.shittthax.api.handler.handlers;

import com.srcgod.shittthax.impl.Client;
import com.srcgod.shittthax.impl.Shit;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;



public class KeyHandler {

    @SubscribeEvent
    public void onKey(InputEvent.KeyInputEvent event) {
        if(Keyboard.isKeyDown(Keyboard.getEventKey()) && Keyboard.getEventKey() != Keyboard.KEY_NONE)
            Client.keyPress(Keyboard.getEventKey());
        if (Keyboard.getEventKey() == Keyboard.KEY_RSHIFT) {
            Minecraft.getMinecraft().displayGuiScreen(Shit.instance.clickGui);
        }
    }
}

