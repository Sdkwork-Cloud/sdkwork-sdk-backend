package com.sdkwork.backend.model;

public class PlusChannelResourceForm {
    private String resource;
    private String channel;
    private Integer channelAccountId;

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
