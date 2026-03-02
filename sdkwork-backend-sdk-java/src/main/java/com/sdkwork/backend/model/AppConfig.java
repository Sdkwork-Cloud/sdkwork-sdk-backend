package com.sdkwork.backend.model;

public class AppConfig {
    private OfficialAccountConfig officialAccount;

    public OfficialAccountConfig getOfficialAccount() {
        return this.officialAccount;
    }
    
    public void setOfficialAccount(OfficialAccountConfig officialAccount) {
        this.officialAccount = officialAccount;
    }
}
