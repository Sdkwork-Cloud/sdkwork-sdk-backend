package com.sdkwork.backend.model;

public class PlusApiKeyVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private String name;
    private String keyValue;
    private String maskedKeyValue;
    private String type;
    private String status;
    private String expireTime;
    private String description;
    private String lastUsedTime;

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

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getKeyValue() {
        return this.keyValue;
    }
    
    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public String getMaskedKeyValue() {
        return this.maskedKeyValue;
    }
    
    public void setMaskedKeyValue(String maskedKeyValue) {
        this.maskedKeyValue = maskedKeyValue;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getExpireTime() {
        return this.expireTime;
    }
    
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getLastUsedTime() {
        return this.lastUsedTime;
    }
    
    public void setLastUsedTime(String lastUsedTime) {
        this.lastUsedTime = lastUsedTime;
    }
}
