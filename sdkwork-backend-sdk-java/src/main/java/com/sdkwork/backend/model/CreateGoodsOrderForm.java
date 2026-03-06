package com.sdkwork.backend.model;

public class CreateGoodsOrderForm {
    private List<CartItem> items;
    private String expireTime;

    public List<CartItem> getItems() {
        return this.items;
    }
    
    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    public String getExpireTime() {
        return this.expireTime;
    }
    
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }
}
