package com.sdkwork.backend.model;

public class PlusFavoriteVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private String contentType;
    private Integer contentId;
    private Integer folderId;
    private String remark;
    private String tags;
    private Integer sortWeight;
    private String title;
    private ImageMediaResource image;
    private Boolean isPrivate;
    private String status;
    private Integer viewCount;
    private String lastViewedAt;

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

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getContentType() {
        return this.contentType;
    }
    
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Integer getContentId() {
        return this.contentId;
    }
    
    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Integer getFolderId() {
        return this.folderId;
    }
    
    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTags() {
        return this.tags;
    }
    
    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getSortWeight() {
        return this.sortWeight;
    }
    
    public void setSortWeight(Integer sortWeight) {
        this.sortWeight = sortWeight;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public ImageMediaResource getImage() {
        return this.image;
    }
    
    public void setImage(ImageMediaResource image) {
        this.image = image;
    }

    public Boolean getIsPrivate() {
        return this.isPrivate;
    }
    
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getViewCount() {
        return this.viewCount;
    }
    
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public String getLastViewedAt() {
        return this.lastViewedAt;
    }
    
    public void setLastViewedAt(String lastViewedAt) {
        this.lastViewedAt = lastViewedAt;
    }
}
