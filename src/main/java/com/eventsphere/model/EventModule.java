package com.eventsphere.model;

public class EventModule {
    private int id;
    private String moduleName;
    private String metadata;

    public EventModule() {
    }

    public EventModule(int id, String moduleName, String metadata) {
        this.id = id;
        this.moduleName = moduleName;
        this.metadata = metadata;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }
}
