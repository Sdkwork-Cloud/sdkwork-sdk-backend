package com.sdkwork.backend.model;

public class PlusChannelForm {
    private String name;
    private String channel;
    private List<String> types;
    private List<String> supportResources;
    private String status;
    private String description;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public List<String> getTypes() {
        return this.types;
    }
    
    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<String> getSupportResources() {
        return this.supportResources;
    }
    
    public void setSupportResources(List<String> supportResources) {
        this.supportResources = supportResources;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
