package com.sdkwork.backend.model;

public class PlusUserOAuthAccountForm {
    private Integer userId;
    private String oauthProvider;
    private String openId;
    private String unionId;
    private String appId;
    private Integer channelAccountId;
    private String accessTokenExpiresAt;

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOauthProvider() {
        return this.oauthProvider;
    }
    
    public void setOauthProvider(String oauthProvider) {
        this.oauthProvider = oauthProvider;
    }

    public String getOpenId() {
        return this.openId;
    }
    
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUnionId() {
        return this.unionId;
    }
    
    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getAppId() {
        return this.appId;
    }
    
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Integer getChannelAccountId() {
        return this.channelAccountId;
    }
    
    public void setChannelAccountId(Integer channelAccountId) {
        this.channelAccountId = channelAccountId;
    }

    public String getAccessTokenExpiresAt() {
        return this.accessTokenExpiresAt;
    }
    
    public void setAccessTokenExpiresAt(String accessTokenExpiresAt) {
        this.accessTokenExpiresAt = accessTokenExpiresAt;
    }
}
