package com.sdkwork.backend.model;

public class PlusShareVisitRecordVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private Integer shareId;
    private String ipAddress;
    private String userAgent;
    private String accessedAt;
    private Boolean success;

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

    public Integer getShareId() {
        return this.shareId;
    }
    
    public void setShareId(Integer shareId) {
        this.shareId = shareId;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }
    
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getUserAgent() {
        return this.userAgent;
    }
    
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getAccessedAt() {
        return this.accessedAt;
    }
    
    public void setAccessedAt(String accessedAt) {
        this.accessedAt = accessedAt;
    }

    public Boolean getSuccess() {
        return this.success;
    }
    
    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
