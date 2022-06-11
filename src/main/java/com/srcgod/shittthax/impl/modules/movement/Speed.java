package com.srcgod.shittthax.impl.modules.movement;

import com.srcgod.shittthax.api.clickgui.Setting;
import com.srcgod.shittthax.impl.Shit;
import com.srcgod.shittthax.api.module.Module;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;
import java.util.ArrayList;
import java.util.Objects;

public class Speed extends Module {
    public Speed() {
        super("Speed", Keyboard.KEY_NONE, Module.Category.MOVEMENT);
        ArrayList<String> options = new ArrayList<>();

        options.add("Speed");
        options.add("Legit");

        Shit.instance.settingsManager.rSetting(new Setting("Mode", this, options, "Mode"));
        Shit.instance.settingsManager.rSetting(new Setting("Speed", this, 0.1, 0.1, 5, false));

    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent e) {
        String Mode = Shit.instance.settingsManager.getSettingByName(this.name, "Mode").getValString();
        double speed2 = Shit.instance.settingsManager.getSettingByName(this.name, "Speed").getValDouble();

        if (Objects.equals(Mode, "Speed")) {
            if (mc.player.onGround && mc.player.moveForward > 0 && !mc.player.isInWater() && !mc.player.isInLava()) {
                double speed = speed2;

                mc.player.setSprinting(true);
                mc.player.motionY = 0.1;

                float yaw = mc.player.rotationYaw * 0.0174532920F;

                mc.player.motionX -= MathHelper.sin(yaw) * (speed2);
                mc.player.motionZ += MathHelper.cos(yaw) * (speed2);
            }
        } else {

            Legit:
            if (mc.player.onGround && mc.player.moveForward > 0 && !mc.player.isInWater() && !mc.player.isInLava()) {
                mc.player.jump();
            }
        }
        }
    }