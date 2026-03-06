package com.sdkwork.backend.model;

public class QrCodeVO {
    private String createdAt;
    private String updatedAt;
    private String qrKey;
    private String qrUrl;
    private String qrContent;
    private Integer expireTime;

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

    public String getQrKey() {
        return this.qrKey;
    }
    
    public void setQrKey(String qrKey) {
        this.qrKey = qrKey;
    }

    public String getQrUrl() {
        return this.qrUrl;
    }
    
    public void setQrUrl(String qrUrl) {
        this.qrUrl = qrUrl;
    }

    public String getQrContent() {
        return this.qrContent;
    }
    
    public void setQrContent(String qrContent) {
        this.qrContent = qrContent;
    }

    public Integer getExpireTime() {
        return this.expireTime;
    }
    
    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }
}
