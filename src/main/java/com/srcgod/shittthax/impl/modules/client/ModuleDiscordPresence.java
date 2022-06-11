package com.srcgod.shittthax.impl.modules.client;

import com.srcgod.shittthax.api.module.Module;
import com.srcgod.shittthax.impl.RPC;
import org.lwjgl.input.Keyboard;

public class ModuleDiscordPresence
        extends Module {
    public ModuleDiscordPresence() {
        super("DiscordRPC", Keyboard.KEY_NONE, Category.CLIENT);
    }

    @Override
    public void onEnable() {
        RPC.startRPC();
    }

    @Override
    public void onDisable() {
        RPC.stopRPC();
    }
}
