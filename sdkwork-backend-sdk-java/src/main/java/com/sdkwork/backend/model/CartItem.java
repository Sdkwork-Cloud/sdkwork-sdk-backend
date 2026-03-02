package com.sdkwork.backend.model;

public class CartItem {
    private Integer id;
    private PlusSku sku;
    private Integer quantity;
    private Double unitPrice;
    private Double totalPrice;
    private Boolean selected;

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public PlusSku getSku() {
        return this.sku;
    }
    
    public void setSku(PlusSku sku) {
        this.sku = sku;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return this.unitPrice;
    }
    
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotalPrice() {
        return this.totalPrice;
    }
    
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Boolean getSelected() {
        return this.selected;
    }
    
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }
}
