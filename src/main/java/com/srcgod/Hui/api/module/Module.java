package com.srcgod.Hui.api.module;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

public class Module {
    protected String name;
    boolean toggled;
    public int keyCode;
    public Category category;
    public Minecraft mc = Minecraft.getMinecraft();
    String description;

    public Module(String name, String description, int key, Category c) {
        this.name = name;
        this.description = description;
        keyCode = key;
        category = c;
    }

    public Module(String name, int key, Category c) {
        this.name = name;
        keyCode = key;
        category = c;
    }

    public String getDescription() {return description;}




    public int getKey(){
        return keyCode;
    }



    public void onEnable() {
        MinecraftForge.EVENT_BUS.register(this);
        toggled = true;
    }

    public void onDisable() {
        toggled = false;
    }

    public void setKey(int key) {
        keyCode = key;
    }

    public Category getCategory(){
        return category;
    }

    public String getName(){
        return name;
    }

    public boolean isEnabled() {
        return toggled;
    }


    public enum Category {
        COMBAT,
        MOVEMENT,
        PLAYER,
        RENDER,
        MISC,
        CLIENT,
        EXPLOIT

    }

    public void setToggled(boolean toggled) {
        this.toggled = toggled;

        if(toggled) onEnable();
        else onDisable();
    }
    
    public void toggle() {
        setToggled(!toggled);
    }
}