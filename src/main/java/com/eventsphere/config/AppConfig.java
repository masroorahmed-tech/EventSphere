package com.eventsphere.config;

public class AppConfig {
    private boolean debugMode;

    public AppConfig() {
        this.debugMode = true;
    }

    public boolean isDebugMode() {
        return debugMode;
    }

    public void setDebugMode(boolean debugMode) {
        this.debugMode = debugMode;
    }
}
