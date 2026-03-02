package com.sdkwork.backend.model;

public class InstagramInfo {
    private String userId;
    private String username;
    private String fullName;
    private String profilePictureUrl;
    private String bio;
    private String website;
    private Boolean isBusinessAccount;

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return this.fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }
    
    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }

    public String getBio() {
        return this.bio;
    }
    
    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getWebsite() {
        return this.website;
    }
    
    public void setWebsite(String website) {
        this.website = website;
    }

    public Boolean getIsBusinessAccount() {
        return this.isBusinessAccount;
    }
    
    public void setIsBusinessAccount(Boolean isBusinessAccount) {
        this.isBusinessAccount = isBusinessAccount;
    }
}
