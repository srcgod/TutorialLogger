package com.srcgod.Hui.api.module;

import com.srcgod.Hui.impl.Client;


public class ModuleManager {

    public static void init() {


    }



    private static void register(Module module) {
        Client.modules.add(module);
    }
}