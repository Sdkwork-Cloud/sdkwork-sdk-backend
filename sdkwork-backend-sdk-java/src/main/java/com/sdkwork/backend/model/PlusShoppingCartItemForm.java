package com.sdkwork.backend.model;

public class PlusShoppingCartItemForm {
    private Integer cartId;
    private String cartGroupUuid;
    private Integer productId;
    private Integer skuId;
    private Integer quantity;
    private Double price;
    private Boolean selected;

    public Integer getCartId() {
        return this.cartId;
    }
    
    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public String getCartGroupUuid() {
        return this.cartGroupUuid;
    }
    
    public void setCartGroupUuid(String cartGroupUuid) {
        this.cartGroupUuid = cartGroupUuid;
    }

    public Integer getProductId() {
        return this.productId;
    }
    
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSkuId() {
        return this.skuId;
    }
    
    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getSelected() {
        return this.selected;
    }
    
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }
}
