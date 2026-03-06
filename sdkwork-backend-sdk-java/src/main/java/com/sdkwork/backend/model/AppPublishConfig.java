package com.sdkwork.backend.model;

public class AppPublishConfig {
    private List<AppStoreListingConfig> stores;

    public List<AppStoreListingConfig> getStores() {
        return this.stores;
    }
    
    public void setStores(List<AppStoreListingConfig> stores) {
        this.stores = stores;
    }
}
