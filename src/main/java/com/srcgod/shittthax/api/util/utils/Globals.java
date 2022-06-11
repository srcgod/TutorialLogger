package com.srcgod.shittthax.api.util.utils;

import com.srcgod.shittthax.api.clickgui.SettingsManager;
import com.srcgod.shittthax.impl.Shit;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;

import java.util.Random;

public interface Globals {
    Minecraft mc = Minecraft.getMinecraft();
    Random random = new Random();
    ScaledResolution sr = new ScaledResolution(mc);
    SettingsManager setmgr = Shit.instance.settingsManager;

    default boolean nullCheck(){
        return mc.player == null || mc.world == null;
    }
}
