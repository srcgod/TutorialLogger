package com.srcgod.Hui.impl.modules.player;

import com.srcgod.Hui.api.module.Module;
import net.minecraft.world.GameType;
import org.lwjgl.input.Keyboard;

public class FakeCreative extends Module {
    public FakeCreative() {
        super("FakeCreative", Keyboard.KEY_NONE, Category.PLAYER);
    }

    @Override
    public void onEnable() {
        mc.playerController.setGameType(GameType.CREATIVE);
    }

    @Override
    public void onDisable() {
        mc.playerController.setGameType(GameType.SURVIVAL);
    }
}