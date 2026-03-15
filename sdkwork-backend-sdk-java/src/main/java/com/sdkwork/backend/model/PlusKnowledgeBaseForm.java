package com.sdkwork.backend.model;

public class PlusKnowledgeBaseForm {
    private String name;
    private Integer diskId;
    private String channel;
    private String channelId;
    private Integer projectId;
    private String description;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Integer getDiskId() {
        return this.diskId;
    }
    
    public void setDiskId(Integer diskId) {
        this.diskId = diskId;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannelId() {
        return this.channelId;
    }
    
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Integer getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
