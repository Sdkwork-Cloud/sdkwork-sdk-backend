package com.sdkwork.backend.model;

public class PlusDatasourceForm {
    private Integer projectId;
    private String name;
    private String channel;
    private String channelId;
    private Integer type;
    private Integer status;
    private String description;
    private DatasourceConfig connectionConfig;
    private String url;
    private String owner;
    private String lastConnectedAt;
    private Integer connectionTimeout;
    private TagsContent tags;
    private String dbVersion;
    private Integer securityLevel;
    private Integer accessCount;
    private String icon;
    private String color;

    public Integer getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
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

    public String getChannelId() {
        return this.channelId;
    }
    
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Integer getType() {
        return this.type;
    }
    
    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public DatasourceConfig getConnectionConfig() {
        return this.connectionConfig;
    }
    
    public void setConnectionConfig(DatasourceConfig connectionConfig) {
        this.connectionConfig = connectionConfig;
    }

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public String getOwner() {
        return this.owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLastConnectedAt() {
        return this.lastConnectedAt;
    }
    
    public void setLastConnectedAt(String lastConnectedAt) {
        this.lastConnectedAt = lastConnectedAt;
    }

    public Integer getConnectionTimeout() {
        return this.connectionTimeout;
    }
    
    public void setConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public TagsContent getTags() {
        return this.tags;
    }
    
    public void setTags(TagsContent tags) {
        this.tags = tags;
    }

    public String getDbVersion() {
        return this.dbVersion;
    }
    
    public void setDbVersion(String dbVersion) {
        this.dbVersion = dbVersion;
    }

    public Integer getSecurityLevel() {
        return this.securityLevel;
    }
    
    public void setSecurityLevel(Integer securityLevel) {
        this.securityLevel = securityLevel;
    }

    public Integer getAccessCount() {
        return this.accessCount;
    }
    
    public void setAccessCount(Integer accessCount) {
        this.accessCount = accessCount;
    }

    public String getIcon() {
        return this.icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
}
