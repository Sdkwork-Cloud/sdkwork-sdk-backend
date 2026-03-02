package com.sdkwork.backend.model;

public class PlusOssBucketVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private Integer v;
    private Integer userId;
    private String name;
    private String region;
    private String channel;
    private Integer channelConfigId;
    private String description;
    private String status;
    private String creationDate;
    private String arn;
    private String endpoint;
    private String storageClass;
    private Boolean versioningEnabled;
    private Boolean encryptionEnabled;
    private String encryptionType;
    private String acl;

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

    public Integer getV() {
        return this.v;
    }
    
    public void setV(Integer v) {
        this.v = v;
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

    public String getRegion() {
        return this.region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Integer getChannelConfigId() {
        return this.channelConfigId;
    }
    
    public void setChannelConfigId(Integer channelConfigId) {
        this.channelConfigId = channelConfigId;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreationDate() {
        return this.creationDate;
    }
    
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getArn() {
        return this.arn;
    }
    
    public void setArn(String arn) {
        this.arn = arn;
    }

    public String getEndpoint() {
        return this.endpoint;
    }
    
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getStorageClass() {
        return this.storageClass;
    }
    
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    public Boolean getVersioningEnabled() {
        return this.versioningEnabled;
    }
    
    public void setVersioningEnabled(Boolean versioningEnabled) {
        this.versioningEnabled = versioningEnabled;
    }

    public Boolean getEncryptionEnabled() {
        return this.encryptionEnabled;
    }
    
    public void setEncryptionEnabled(Boolean encryptionEnabled) {
        this.encryptionEnabled = encryptionEnabled;
    }

    public String getEncryptionType() {
        return this.encryptionType;
    }
    
    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    public String getAcl() {
        return this.acl;
    }
    
    public void setAcl(String acl) {
        this.acl = acl;
    }
}
