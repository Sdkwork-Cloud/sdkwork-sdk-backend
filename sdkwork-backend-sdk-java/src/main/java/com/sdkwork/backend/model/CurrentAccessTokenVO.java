package com.sdkwork.backend.model;

public class CurrentAccessTokenVO {
    private String createdAt;
    private String updatedAt;
    private Integer appId;
    private String appName;
    private String platform;
    private Integer tenantId;
    private Integer organizationId;
    private TokenResult tenantAccessToken;
    private TokenResult organizationAccessToken;

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

    public Integer getAppId() {
        return this.appId;
    }
    
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return this.appName;
    }
    
    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getPlatform() {
        return this.platform;
    }
    
    public void setPlatform(String platform) {
        this.platform = platform;
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

    public TokenResult getTenantAccessToken() {
        return this.tenantAccessToken;
    }
    
    public void setTenantAccessToken(TokenResult tenantAccessToken) {
        this.tenantAccessToken = tenantAccessToken;
    }

    public TokenResult getOrganizationAccessToken() {
        return this.organizationAccessToken;
    }
    
    public void setOrganizationAccessToken(TokenResult organizationAccessToken) {
        this.organizationAccessToken = organizationAccessToken;
    }
}
