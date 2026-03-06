package com.sdkwork.backend.model;

public class PlusChannelProxyVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private Integer userId;
    private String name;
    private String channel;
    private String proxy;
    private String defaultModel;
    private String status;
    private String description;

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

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
