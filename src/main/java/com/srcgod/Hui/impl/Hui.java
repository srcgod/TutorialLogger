package com.srcgod.Hui.impl;


import com.srcgod.Hui.api.menu.OnGuiOpenEvent;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import com.srcgod.Hui.api.Srcgod;
import org.lwjgl.opengl.Display;

@Mod(modid = Hui.MODID, name = Hui.NAME, version = Hui.VERSION)
public class Hui
{
    public static final String MODID = "hui";
    public static final String NAME = "HuiESP";
    public static final String VERSION = "0.1";

    public static Hui instance;


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

        MinecraftForge.EVENT_BUS.register(new Srcgod());
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

        Client.startup();
        MinecraftForge.EVENT_BUS.register(new OnGuiOpenEvent());

    }




}
//;3
