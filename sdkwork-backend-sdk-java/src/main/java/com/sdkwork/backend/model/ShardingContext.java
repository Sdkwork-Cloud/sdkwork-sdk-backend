package com.sdkwork.backend.model;

public class ShardingContext {
    private String platform;
    private String owner;
    private String shardingKey;
    private Integer tenantId;
    private Integer organizationId;
    private Integer userId;

    public String getPlatform() {
        return this.platform;
    }
    
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOwner() {
        return this.owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }

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

    public Integer getOrganizationId() {
        return this.organizationId;
    }
    
    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
