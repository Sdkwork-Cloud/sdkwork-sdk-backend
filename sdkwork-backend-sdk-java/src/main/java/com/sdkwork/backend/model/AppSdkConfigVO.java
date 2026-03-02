package com.sdkwork.backend.model;

public class AppSdkConfigVO {
    private String createdAt;
    private String updatedAt;
    private String platform;
    private OfficialAccountSdkConfigVO officialAccount;
    private MiniProgramSdkConfigVO miniProgram;
    private MobileAppSdkConfigVO app;

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

    public String getPlatform() {
        return this.platform;
    }
    
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public OfficialAccountSdkConfigVO getOfficialAccount() {
        return this.officialAccount;
    }
    
    public void setOfficialAccount(OfficialAccountSdkConfigVO officialAccount) {
        this.officialAccount = officialAccount;
    }

    public MiniProgramSdkConfigVO getMiniProgram() {
        return this.miniProgram;
    }
    
    public void setMiniProgram(MiniProgramSdkConfigVO miniProgram) {
        this.miniProgram = miniProgram;
    }

    public MobileAppSdkConfigVO getApp() {
        return this.app;
    }
    
    public void setApp(MobileAppSdkConfigVO app) {
        this.app = app;
    }
}
