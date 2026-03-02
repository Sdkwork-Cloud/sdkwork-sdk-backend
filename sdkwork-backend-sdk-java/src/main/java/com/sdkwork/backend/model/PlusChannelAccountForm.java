package com.sdkwork.backend.model;

public class PlusChannelAccountForm {
    private String name;
    private String channel;
    private ChannelConfigInfo configs;
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

    public ChannelConfigInfo getConfigs() {
        return this.configs;
    }
    
    public void setConfigs(ChannelConfigInfo configs) {
        this.configs = configs;
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
