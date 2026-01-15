package com.cactt4ck.mod;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

import java.util.logging.Level;

public final class HytalEssential extends JavaPlugin {

    public HytalEssential(@NonNullDecl JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        getLogger().at(Level.INFO).log("Starting HytalEssential setup");
        this.registerCommands();
        this.registerEvents();
    }

    private void registerCommands() {

    }

    private void registerEvents() {

    }
}
