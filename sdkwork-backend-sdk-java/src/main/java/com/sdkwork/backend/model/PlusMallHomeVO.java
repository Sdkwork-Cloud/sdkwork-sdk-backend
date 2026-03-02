package com.sdkwork.backend.model;

public class PlusMallHomeVO {
    private String createdAt;
    private String updatedAt;
    private List<PlusCategoryVO> gridCategories;
    private List<PlusProductVO> products;
    private List<PlusProductVO> banners;
    private List<PlusProductVO> hotProducts;
    private List<PlusProductVO> newProducts;
    private List<PlusProductVO> recommendProducts;
    private List<PlusProductVO> hotSalesProducts;

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<PlusCategoryVO> getGridCategories() {
        return this.gridCategories;
    }
    
    public void setGridCategories(List<PlusCategoryVO> gridCategories) {
        this.gridCategories = gridCategories;
    }

    public List<PlusProductVO> getProducts() {
        return this.products;
    }
    
    public void setProducts(List<PlusProductVO> products) {
        this.products = products;
    }

    public List<PlusProductVO> getBanners() {
        return this.banners;
    }
    
    public void setBanners(List<PlusProductVO> banners) {
        this.banners = banners;
    }

    public List<PlusProductVO> getHotProducts() {
        return this.hotProducts;
    }
    
    public void setHotProducts(List<PlusProductVO> hotProducts) {
        this.hotProducts = hotProducts;
    }

    public List<PlusProductVO> getNewProducts() {
        return this.newProducts;
    }
    
    public void setNewProducts(List<PlusProductVO> newProducts) {
        this.newProducts = newProducts;
    }

    public List<PlusProductVO> getRecommendProducts() {
        return this.recommendProducts;
    }
    
    public void setRecommendProducts(List<PlusProductVO> recommendProducts) {
        this.recommendProducts = recommendProducts;
    }

    public List<PlusProductVO> getHotSalesProducts() {
        return this.hotSalesProducts;
    }
    
    public void setHotSalesProducts(List<PlusProductVO> hotSalesProducts) {
        this.hotSalesProducts = hotSalesProducts;
    }
}
