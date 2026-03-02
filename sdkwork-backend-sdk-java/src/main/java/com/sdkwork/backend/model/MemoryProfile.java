package com.sdkwork.backend.model;

public class MemoryProfile {
    private List<ProfileItem> items;
    private Map<String, List<ProfileItem>> customs;
    private String description;

    public List<ProfileItem> getItems() {
        return this.items;
    }
    
    public void setItems(List<ProfileItem> items) {
        this.items = items;
    }

    public Map<String, List<ProfileItem>> getCustoms() {
        return this.customs;
    }
    
    public void setCustoms(Map<String, List<ProfileItem>> customs) {
        this.customs = customs;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
