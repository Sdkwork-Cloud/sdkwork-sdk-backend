package com.sdkwork.backend.model;

public class QrCodeStatusVO {
    private String createdAt;
    private String updatedAt;
    private String status;
    private UserVO userInfo;
    private LoginResultVO token;

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

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public UserVO getUserInfo() {
        return this.userInfo;
    }
    
    public void setUserInfo(UserVO userInfo) {
        this.userInfo = userInfo;
    }

    public LoginResultVO getToken() {
        return this.token;
    }
    
    public void setToken(LoginResultVO token) {
        this.token = token;
    }
}
