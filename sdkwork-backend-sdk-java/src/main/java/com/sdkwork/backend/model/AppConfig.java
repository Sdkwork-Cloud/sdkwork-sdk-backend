package com.sdkwork.backend.model;

public class AppConfig {
    private OfficialAccountConfig officialAccount;
    private AppPublishConfig publish;

    public OfficialAccountConfig getOfficialAccount() {
        return this.officialAccount;
    }
    
    public void setOfficialAccount(OfficialAccountConfig officialAccount) {
        this.officialAccount = officialAccount;
    }

    public AppPublishConfig getPublish() {
        return this.publish;
    }
    
    public void setPublish(AppPublishConfig publish) {
        this.publish = publish;
    }
}
