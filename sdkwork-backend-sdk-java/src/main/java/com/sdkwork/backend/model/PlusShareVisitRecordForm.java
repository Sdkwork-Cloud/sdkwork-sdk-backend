package com.sdkwork.backend.model;

public class PlusShareVisitRecordForm {
    private Integer shareId;
    private String ipAddress;
    private String userAgent;
    private String accessedAt;
    private Boolean success;

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
