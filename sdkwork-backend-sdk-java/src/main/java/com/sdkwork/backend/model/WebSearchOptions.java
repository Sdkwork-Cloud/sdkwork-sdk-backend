package com.sdkwork.backend.model;

public class WebSearchOptions {
    private String searchContextSize;
    private UserLocation userLocation;

    public String getSearchContextSize() {
        return this.searchContextSize;
    }
    
    public void setSearchContextSize(String searchContextSize) {
        this.searchContextSize = searchContextSize;
    }

    public UserLocation getUserLocation() {
        return this.userLocation;
    }
    
    public void setUserLocation(UserLocation userLocation) {
        this.userLocation = userLocation;
    }
}
