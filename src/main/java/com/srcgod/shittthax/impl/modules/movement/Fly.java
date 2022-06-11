package com.srcgod.shittthax.impl.modules.movement;

import com.srcgod.shittthax.api.clickgui.Setting;
import com.srcgod.shittthax.impl.Shit;
import com.srcgod.shittthax.api.module.Module;
import org.lwjgl.input.Keyboard;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.ArrayList;
import java.util.Objects;

public class Fly extends Module {
    public Fly() {
        super("Fly", Keyboard.KEY_NONE, Category.MOVEMENT);

        ArrayList<String> options = new ArrayList<>();

        options.add("Creative");
        options.add("WellMore");

        Shit.instance.settingsManager.rSetting(new Setting("Mode", this, options, "Mode"));
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent e) {
        String Mode = Shit.instance.settingsManager.getSettingByName(this.name, "Mode").getValString();

        if (Objects.equals(Mode, "WellMore")) {
            float speed = (float) 2.11;

            mc.player.noClip = true;
            mc.player.fallDistance = 0;
            mc.player.onGround = false;

            mc.player.capabilities.isFlying = false;

            mc.player.motionX = 0;
            mc.player.motionY = 0;
            mc.player.motionZ = 0;

            mc.player.jumpMovementFactor = speed;

            if (mc.gameSettings.keyBindJump.isKeyDown()) {
                mc.player.motionY += speed;
            }
            if (mc.gameSettings.keyBindSneak.isKeyDown()) {
                mc.player.motionY -= speed;
            }
        } else {
            mc.player.capabilities.isFlying = true;
        }
    }

    @Override
    public void onDisable() {
        super.onDisable();

        String Mode = Shit.instance.settingsManager.getSettingByName(this.name, "Mode").getValString();

        if (Objects.equals(Mode, "Creative")) {
            mc.player.capabilities.isFlying = false;
        }
    }
}
