package com.sdkwork.backend.model;

public class PlusPptTemplateSlideForm {
    private Integer templateId;
    private String sectionTitle;
    private String sectionContent;
    private Integer pageNumber;
    private String layoutType;
    private String backgroundImage;
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

    public String getSectionTitle() {
        return this.sectionTitle;
    }
    
    public void setSectionTitle(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public String getSectionContent() {
        return this.sectionContent;
    }
    
    public void setSectionContent(String sectionContent) {
        this.sectionContent = sectionContent;
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

    public String getBackgroundImage() {
        return this.backgroundImage;
    }
    
    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
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
