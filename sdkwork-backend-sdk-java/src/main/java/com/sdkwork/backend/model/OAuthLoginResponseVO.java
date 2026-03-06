package com.sdkwork.backend.model;

public class OAuthLoginResponseVO {
    private String createdAt;
    private String updatedAt;
    private String provider;
    private String authUrl;
    private String qrCodeUrl;
    private String qrCodeContent;
    private Integer expiresIn;

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

    public String getProvider() {
        return this.provider;
    }
    
    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getAuthUrl() {
        return this.authUrl;
    }
    
    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }

    public String getQrCodeUrl() {
        return this.qrCodeUrl;
    }
    
    public void setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl;
    }

    public String getQrCodeContent() {
        return this.qrCodeContent;
    }
    
    public void setQrCodeContent(String qrCodeContent) {
        this.qrCodeContent = qrCodeContent;
    }

    public Integer getExpiresIn() {
        return this.expiresIn;
    }
    
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }
}
