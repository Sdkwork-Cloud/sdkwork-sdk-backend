package com.sdkwork.backend.model;

public class ModelLimitInfo {
    private String unit;
    private List<ModelLimitItem> items;

    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public List<ModelLimitItem> getItems() {
        return this.items;
    }
    
    public void setItems(List<ModelLimitItem> items) {
        this.items = items;
    }
}
