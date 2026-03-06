package com.sdkwork.backend.model;

public class CreateVirtualOrderForm {
    private List<OrderContentItem> items;
    private String expireTime;

    public List<OrderContentItem> getItems() {
        return this.items;
    }
    
    public void setItems(List<OrderContentItem> items) {
        this.items = items;
    }

    public String getExpireTime() {
        return this.expireTime;
    }
    
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }
}
