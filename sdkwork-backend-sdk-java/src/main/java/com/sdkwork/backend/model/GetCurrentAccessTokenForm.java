package com.sdkwork.backend.model;

public class GetCurrentAccessTokenForm {
    private Integer appId;
    private String platform;

    public Integer getAppId() {
        return this.appId;
    }
    
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getPlatform() {
        return this.platform;
    }
    
    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
