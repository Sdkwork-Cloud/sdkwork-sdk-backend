package com.sdkwork.backend.model;

public class CartGroupList {
    private List<CartGroup> groups;
    private Integer totalQuantity;
    private Double totalPrice;
    private Integer selectedQuantity;
    private Double selectedPrice;
    private List<CartItem> allItems;

    public List<CartGroup> getGroups() {
        return this.groups;
    }
    
    public void setGroups(List<CartGroup> groups) {
        this.groups = groups;
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

    public Integer getSelectedQuantity() {
        return this.selectedQuantity;
    }
    
    public void setSelectedQuantity(Integer selectedQuantity) {
        this.selectedQuantity = selectedQuantity;
    }

    public Double getSelectedPrice() {
        return this.selectedPrice;
    }
    
    public void setSelectedPrice(Double selectedPrice) {
        this.selectedPrice = selectedPrice;
    }

    public List<CartItem> getAllItems() {
        return this.allItems;
    }
    
    public void setAllItems(List<CartItem> allItems) {
        this.allItems = allItems;
    }
}
