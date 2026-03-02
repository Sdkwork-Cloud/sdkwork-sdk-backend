package com.sdkwork.backend.model;

public class ModelPrice {
    private String unit;
    private List<ModelPriceItem> items;
    private String currency;

    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public List<ModelPriceItem> getItems() {
        return this.items;
    }
    
    public void setItems(List<ModelPriceItem> items) {
        this.items = items;
    }

    public String getCurrency() {
        return this.currency;
    }
    
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
