package com.sdkwork.backend.model;

public class TikTokInfo {
    private String userId;
    private String username;
    private String displayName;
    private String avatarUrl;
    private String bio;
    private Boolean isVerified;
    private Integer followerCount;
    private Integer followingCount;
    private Integer likeCount;

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

    public String getDisplayName() {
        return this.displayName;
    }
    
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }
    
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getBio() {
        return this.bio;
    }
    
    public void setBio(String bio) {
        this.bio = bio;
    }

    public Boolean getIsVerified() {
        return this.isVerified;
    }
    
    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public Integer getFollowerCount() {
        return this.followerCount;
    }
    
    public void setFollowerCount(Integer followerCount) {
        this.followerCount = followerCount;
    }

    public Integer getFollowingCount() {
        return this.followingCount;
    }
    
    public void setFollowingCount(Integer followingCount) {
        this.followingCount = followingCount;
    }

    public Integer getLikeCount() {
        return this.likeCount;
    }
    
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }
}
