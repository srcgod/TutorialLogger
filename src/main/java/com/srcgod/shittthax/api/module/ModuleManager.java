package com.srcgod.shittthax.api.module;

import com.srcgod.shittthax.impl.Client;
import com.srcgod.shittthax.impl.modules.client.ModuleDiscordPresence;
import com.srcgod.shittthax.impl.modules.combat.KillAura;
import com.srcgod.shittthax.impl.modules.combat.TriggerBot;
import com.srcgod.shittthax.impl.modules.movement.*;
import com.srcgod.shittthax.impl.modules.player.Blockreach;
import com.srcgod.shittthax.impl.modules.player.FakeCreative;
import com.srcgod.shittthax.impl.modules.render.GlowESP;
import com.srcgod.shittthax.impl.modules.render.Tracers;

public class ModuleManager {

    public static void init() {
        register(new Fly());
        register(new Sprint());
        register(new Blockreach());
        register(new TriggerBot());
        register(new GlowESP());
        register(new Tracers());
        register(new FakeCreative());
        register(new KillAura());
        register(new Jesus());
        register(new Speed());
        register(new HighJump());
        register(new ModuleDiscordPresence());

    }



    private static void register(Module module) {
        Client.modules.add(module);
    }
}