package com.sdkwork.backend.model;

public class ShortUrlForm {
    private String originalUrl;
    private String shortCode;
    private String expiresAt;
    private String status;
    private Integer createdBy;
    private String description;

    public String getOriginalUrl() {
        return this.originalUrl;
    }
    
    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getShortCode() {
        return this.shortCode;
    }
    
    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getExpiresAt() {
        return this.expiresAt;
    }
    
    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
