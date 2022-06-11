package com.srcgod.shittthax.impl.modules.movement;

import com.srcgod.shittthax.api.module.Module;
import org.lwjgl.input.Keyboard;

public class Flyy extends Module {
    public Flyy() {

        super("Flyy", Keyboard.KEY_NONE, Module.Category.MOVEMENT);
    }

    @Override
    public void onEnable() {
        mc.player.capabilities.isFlying = true;

    }

    @Override
    public void onDisable() {
        mc.player.capabilities.isFlying = false;
    }
}

