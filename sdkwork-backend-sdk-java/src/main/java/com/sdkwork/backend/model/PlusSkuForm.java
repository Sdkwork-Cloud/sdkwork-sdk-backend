package com.sdkwork.backend.model;

public class PlusSkuForm {
    private String title;
    private Integer productId;
    private String skuCode;
    private ImageMediaResourceList images;
    private AssetMediaResourceList resources;
    private Double price;
    private Double originalPrice;
    private Integer stock;
    private Integer salesCount;
    private String status;
    private Integer categoryId;
    private List<AttributeItem> attributes;

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getProductId() {
        return this.productId;
    }
    
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getSkuCode() {
        return this.skuCode;
    }
    
    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public ImageMediaResourceList getImages() {
        return this.images;
    }
    
    public void setImages(ImageMediaResourceList images) {
        this.images = images;
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

    public Integer getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public List<AttributeItem> getAttributes() {
        return this.attributes;
    }
    
    public void setAttributes(List<AttributeItem> attributes) {
        this.attributes = attributes;
    }
}
