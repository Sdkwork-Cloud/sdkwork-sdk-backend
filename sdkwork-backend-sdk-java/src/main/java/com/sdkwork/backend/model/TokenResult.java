package com.sdkwork.backend.model;

public class TokenResult {
    private String token;
    private String expiresInMs;
    private String createdAt;
    private Boolean expired;

    public String getToken() {
        return this.token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }

    public String getExpiresInMs() {
        return this.expiresInMs;
    }
    
    public void setExpiresInMs(String expiresInMs) {
        this.expiresInMs = expiresInMs;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getExpired() {
        return this.expired;
    }
    
    public void setExpired(Boolean expired) {
        this.expired = expired;
    }
}
