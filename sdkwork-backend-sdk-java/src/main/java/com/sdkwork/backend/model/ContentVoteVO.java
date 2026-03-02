package com.sdkwork.backend.model;

public class ContentVoteVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private Integer v;
    private Integer userId;
    private String contentType;
    private String rating;
    private Integer contentId;
    private ContentVoteMetadata metadata;

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

    public Integer getV() {
        return this.v;
    }
    
    public void setV(Integer v) {
        this.v = v;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContentType() {
        return this.contentType;
    }
    
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getRating() {
        return this.rating;
    }
    
    public void setRating(String rating) {
        this.rating = rating;
    }

    public Integer getContentId() {
        return this.contentId;
    }
    
    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public ContentVoteMetadata getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(ContentVoteMetadata metadata) {
        this.metadata = metadata;
    }
}
