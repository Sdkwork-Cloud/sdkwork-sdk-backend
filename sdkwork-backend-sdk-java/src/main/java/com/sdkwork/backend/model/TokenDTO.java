package com.sdkwork.backend.model;

public class TokenDTO {
    private String token;
    private String refreshToken;
    private Integer expiresIn;
    private Integer refreshExpiresIn;
    private Integer userId;
    private Map<String, Object> im;

    public String getToken() {
        return this.token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }
    
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public Integer getExpiresIn() {
        return this.expiresIn;
    }
    
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public Integer getRefreshExpiresIn() {
        return this.refreshExpiresIn;
    }
    
    public void setRefreshExpiresIn(Integer refreshExpiresIn) {
        this.refreshExpiresIn = refreshExpiresIn;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Map<String, Object> getIm() {
        return this.im;
    }
    
    public void setIm(Map<String, Object> im) {
        this.im = im;
    }
}
