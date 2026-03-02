package com.sdkwork.backend.model;

public class PlusChannelResourceVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private String resource;
    private String channel;
    private Integer channelAccountId;

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

    public String getResource() {
        return this.resource;
    }
    
    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Integer getChannelAccountId() {
        return this.channelAccountId;
    }
    
    public void setChannelAccountId(Integer channelAccountId) {
        this.channelAccountId = channelAccountId;
    }
}
