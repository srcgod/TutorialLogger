
package com.srcgod.shittthax.api.handler.handlers;

import com.srcgod.shittthax.impl.Client;
import com.srcgod.shittthax.api.module.Module;
import com.srcgod.shittthax.impl.Shit;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.util.text.TextFormatting;


public class UIHandler {
    @SubscribeEvent
    public void onRender(RenderGameOverlayEvent.Post e) {
        if (e.getType() == RenderGameOverlayEvent.ElementType.TEXT) {
            Minecraft mc = Minecraft.getMinecraft();
            FontRenderer fr = mc.fontRenderer;
            ScaledResolution sr = new ScaledResolution(mc);
            int y = 10;

            fr.drawString(TextFormatting.LIGHT_PURPLE + "Shit" + TextFormatting.WHITE + " hack " + Shit.VERSION, 5, 5, -1);

            for (Module m : Client.modules) if (m.isEnabled()) {
                fr.drawStringWithShadow(m.getName(), sr.getScaledWidth() - 4 - fr.getStringWidth(m.getName()), y, -1);
                y += 10;
            }
        }
    }
}











