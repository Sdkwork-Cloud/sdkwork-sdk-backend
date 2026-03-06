package com.sdkwork.backend.model;

public class PlusChannelProxyForm {
    private String name;
    private String channel;
    private String proxy;
    private String defaultModel;
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

    public String getProxy() {
        return this.proxy;
    }
    
    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public String getDefaultModel() {
        return this.defaultModel;
    }
    
    public void setDefaultModel(String defaultModel) {
        this.defaultModel = defaultModel;
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
