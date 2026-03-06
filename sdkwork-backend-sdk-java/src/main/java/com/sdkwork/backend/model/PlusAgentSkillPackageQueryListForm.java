package com.sdkwork.backend.model;

public class PlusAgentSkillPackageQueryListForm {
    private Integer id;
    private String createdAtFrom;
    private String createdAtTo;
    private String keyword;
    private Integer userId;
    private Integer categoryId;
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
