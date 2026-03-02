package com.sdkwork.backend.model;

public class MobileAppSdkConfigVO {
    private String packageName;
    private String version;
    private String appKey;
    private String pushToken;

    public String getPackageName() {
        return this.packageName;
    }
    
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }

    public String getAppKey() {
        return this.appKey;
    }
    
    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getPushToken() {
        return this.pushToken;
    }
    
    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }
}
