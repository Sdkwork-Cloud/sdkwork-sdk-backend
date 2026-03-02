package com.sdkwork.backend.model;

public class CartGroup {
    private String uuid;
    private String name;
    private List<CartItem> items;
    private Integer totalQuantity;
    private Double totalPrice;

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public List<CartItem> getItems() {
        return this.items;
    }
    
    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    public Integer getTotalQuantity() {
        return this.totalQuantity;
    }
    
    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public Double getTotalPrice() {
        return this.totalPrice;
    }
    
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
