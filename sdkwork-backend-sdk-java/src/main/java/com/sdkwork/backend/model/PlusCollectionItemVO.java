package com.sdkwork.backend.model;

public class PlusCollectionItemVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private Integer collectionId;
    private String collectionUuid;
    private String type;
    private String contentType;
    private Integer contentId;
    private String contentUuid;
    private String title;
    private String description;
    private Integer position;
    private Boolean isPinned;
    private String tags;
    private String extraData;

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

    public Integer getCollectionId() {
        return this.collectionId;
    }
    
    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public String getCollectionUuid() {
        return this.collectionUuid;
    }
    
    public void setCollectionUuid(String collectionUuid) {
        this.collectionUuid = collectionUuid;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
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

    public String getContentUuid() {
        return this.contentUuid;
    }
    
    public void setContentUuid(String contentUuid) {
        this.contentUuid = contentUuid;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPosition() {
        return this.position;
    }
    
    public void setPosition(Integer position) {
        this.position = position;
    }

    public Boolean getIsPinned() {
        return this.isPinned;
    }
    
    public void setIsPinned(Boolean isPinned) {
        this.isPinned = isPinned;
    }

    public String getTags() {
        return this.tags;
    }
    
    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getExtraData() {
        return this.extraData;
    }
    
    public void setExtraData(String extraData) {
        this.extraData = extraData;
    }
}
