package com.srcgod.shittthax.impl;

import com.srcgod.shittthax.api.clickgui.ClickGuiManager;
import com.srcgod.shittthax.api.clickgui.SettingsManager;
import com.srcgod.shittthax.api.menu.OnGuiOpenEvent;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import com.srcgod.shittthax.api.Srcgod;
import org.lwjgl.opengl.Display;

@Mod(modid = Shit.MODID, name = Shit.NAME, version = Shit.VERSION)
public class Shit extends SettingsManager
{
    public static final String MODID = "shitt";
    public static final String NAME = "Shithack";
    public static final String VERSION = "0.1";

    public static Shit instance;
    public SettingsManager settingsManager;
    public ClickGuiManager clickGui;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Display.setTitle("Loading " + Client.name);
        logger = event.getModLog();


        }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        clickGui= new ClickGuiManager();
        settingsManager = new SettingsManager();
        instance = this;
        settingsManager = new SettingsManager();
        MinecraftForge.EVENT_BUS.register(new Srcgod());
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

        Client.startup();
        MinecraftForge.EVENT_BUS.register(new OnGuiOpenEvent());

    }




}
//;3
