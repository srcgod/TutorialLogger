package com.srcgod.shittthax.impl.modules.movement;

import com.srcgod.shittthax.api.module.Module;
import org.lwjgl.input.Keyboard;

public class Sprint extends Module {
    public Sprint() {
        super("Sprint", Keyboard.KEY_NONE, Category.MOVEMENT);
    }

    @Override
    public void onEnable() {
        mc.player.setSprinting(true);
    }
}
