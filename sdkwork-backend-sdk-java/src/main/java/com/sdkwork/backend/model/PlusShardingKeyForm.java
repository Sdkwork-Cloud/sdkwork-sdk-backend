package com.sdkwork.backend.model;

public class PlusShardingKeyForm {
    private String shardingKey;
    private Integer tenantId;
    private String owner;
    private Integer ownerId;
    private String status;
    private String description;

    public String getShardingKey() {
        return this.shardingKey;
    }
    
    public void setShardingKey(String shardingKey) {
        this.shardingKey = shardingKey;
    }

    public Integer getTenantId() {
        return this.tenantId;
    }
    
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public String getOwner() {
        return this.owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getOwnerId() {
        return this.ownerId;
    }
    
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
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
