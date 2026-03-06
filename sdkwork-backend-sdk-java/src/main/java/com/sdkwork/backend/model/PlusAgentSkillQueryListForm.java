package com.sdkwork.backend.model;

public class PlusAgentSkillQueryListForm {
    private Integer id;
    private String createdAtFrom;
    private String createdAtTo;
    private String keyword;
    private Integer userId;
    private Integer categoryId;
    private Integer packageId;
    private String marketStatus;
    private String visibility;
    private String sourceType;
    private String reviewStatus;
    private Boolean builtin;
    private Boolean enabled;
    private Boolean featured;

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreatedAtFrom() {
        return this.createdAtFrom;
    }
    
    public void setCreatedAtFrom(String createdAtFrom) {
        this.createdAtFrom = createdAtFrom;
    }

    public String getCreatedAtTo() {
        return this.createdAtTo;
    }
    
    public void setCreatedAtTo(String createdAtTo) {
        this.createdAtTo = createdAtTo;
    }

    public String getKeyword() {
        return this.keyword;
    }
    
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getPackageId() {
        return this.packageId;
    }
    
    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public String getMarketStatus() {
        return this.marketStatus;
    }
    
    public void setMarketStatus(String marketStatus) {
        this.marketStatus = marketStatus;
    }

    public String getVisibility() {
        return this.visibility;
    }
    
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getSourceType() {
        return this.sourceType;
    }
    
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getReviewStatus() {
        return this.reviewStatus;
    }
    
    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public Boolean getBuiltin() {
        return this.builtin;
    }
    
    public void setBuiltin(Boolean builtin) {
        this.builtin = builtin;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getFeatured() {
        return this.featured;
    }
    
    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }
}
