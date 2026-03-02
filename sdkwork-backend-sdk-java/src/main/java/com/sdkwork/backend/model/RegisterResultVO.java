package com.sdkwork.backend.model;

public class RegisterResultVO {
    private String createdAt;
    private String updatedAt;
    private UserVO user;

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

    public UserVO getUser() {
        return this.user;
    }
    
    public void setUser(UserVO user) {
        this.user = user;
    }
}
