package com.srcgod.shittthax.impl.modules.movement;

import com.srcgod.shittthax.api.module.Module;
import com.srcgod.shittthax.api.util.utils.MessageUtil;
import org.lwjgl.input.Keyboard;

public class HighJump extends Module {
    public HighJump() {
        super("HightJump", Keyboard.KEY_NONE, Category.MOVEMENT);
    }

    @Override
    public void onEnable() {
        mc.player.motionY = 5;
        MessageUtil.sendMessage("ALAX AK BAR!");
        toggle();
    }
}
