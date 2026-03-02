package com.sdkwork.backend.model;

public class ChannelConfigInfo {
    private String uuid;
    private List<ModelConfig> accounts;

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public List<ModelConfig> getAccounts() {
        return this.accounts;
    }
    
    public void setAccounts(List<ModelConfig> accounts) {
        this.accounts = accounts;
    }
}
