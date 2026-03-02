package com.sdkwork.backend.model;

public class PlusProductForm {
    private String title;
    private String code;
    private String subtitle;
    private AssetMediaResourceList resources;
    private Double price;
    private Double originalPrice;
    private Integer stock;
    private Integer salesCount;
    private String status;
    private String onSaleAt;
    private String description;
    private Integer categoryId;
    private Attributes baseAttributes;
    private Attributes specAttributes;

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getSubtitle() {
        return this.subtitle;
    }
    
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public AssetMediaResourceList getResources() {
        return this.resources;
    }
    
    public void setResources(AssetMediaResourceList resources) {
        this.resources = resources;
    }

    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getOriginalPrice() {
        return this.originalPrice;
    }
    
    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Integer getStock() {
        return this.stock;
    }
    
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getSalesCount() {
        return this.salesCount;
    }
    
    public void setSalesCount(Integer salesCount) {
        this.salesCount = salesCount;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getOnSaleAt() {
        return this.onSaleAt;
    }
    
    public void setOnSaleAt(String onSaleAt) {
        this.onSaleAt = onSaleAt;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Attributes getBaseAttributes() {
        return this.baseAttributes;
    }
    
    public void setBaseAttributes(Attributes baseAttributes) {
        this.baseAttributes = baseAttributes;
    }

    public Attributes getSpecAttributes() {
        return this.specAttributes;
    }
    
    public void setSpecAttributes(Attributes specAttributes) {
        this.specAttributes = specAttributes;
    }
}
