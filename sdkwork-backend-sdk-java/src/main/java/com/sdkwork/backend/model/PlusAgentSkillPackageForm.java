package com.sdkwork.backend.model;

public class PlusAgentSkillPackageForm {
    private Integer userId;
    private String packageKey;
    private String name;
    private String summary;
    private String description;
    private String icon;
    private String coverImage;
    private Integer categoryId;
    private Boolean enabled;
    private Boolean featured;
    private Integer sortWeight;
    private List<String> tags;

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPackageKey() {
        return this.packageKey;
    }
    
    public void setPackageKey(String packageKey) {
        this.packageKey = packageKey;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return this.summary;
    }
    
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return this.icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCoverImage() {
        return this.coverImage;
    }
    
    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
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

    public Integer getSortWeight() {
        return this.sortWeight;
    }
    
    public void setSortWeight(Integer sortWeight) {
        this.sortWeight = sortWeight;
    }

    public List<String> getTags() {
        return this.tags;
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
