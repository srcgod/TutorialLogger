package com.srcgod.shittthax.impl.modules.movement;

import com.srcgod.shittthax.api.module.Module;
import org.lwjgl.input.Keyboard;

public class HighJuump extends Module {
    public HighJuump() {
        super("juump", Keyboard.KEY_NONE, Module.Category.MOVEMENT);
    }

    @Override
    public void onEnable() {
        mc.player.motionY = 10;
    }

    @Override
    public void onDisable() {
        mc.player.motionY = 0.6f;
    }
}
