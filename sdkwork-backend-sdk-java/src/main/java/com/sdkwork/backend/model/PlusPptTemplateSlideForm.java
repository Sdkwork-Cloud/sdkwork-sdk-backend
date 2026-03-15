package com.sdkwork.backend.model;

public class PlusPptTemplateSlideForm {
    private Integer templateId;
    private Integer pageNumber;
    private String layoutType;
    private Integer sortOrder;
    private Boolean isRequired;
    private String createdAt;
    private String updatedAt;

    public Integer getTemplateId() {
        return this.templateId;
    }
    
    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Integer getPageNumber() {
        return this.pageNumber;
    }
    
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getLayoutType() {
        return this.layoutType;
    }
    
    public void setLayoutType(String layoutType) {
        this.layoutType = layoutType;
    }

    public Integer getSortOrder() {
        return this.sortOrder;
    }
    
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getIsRequired() {
        return this.isRequired;
    }
    
    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

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
}
