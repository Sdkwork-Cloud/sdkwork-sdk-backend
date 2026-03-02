package com.sdkwork.backend.model;

public class PlusCommentsForm {
    private String content;
    private String contentType;
    private Integer contentId;
    private String status;
    private Integer rating;
    private Integer likes;
    private Integer replyCount;
    private Boolean isTop;
    private String ipAddress;
    private String deviceInfo;
    private Integer parentId;
    private String parentUuid;
    private Integer userId;
    private PlusTreeParentMetadata parentMetadata;

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
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

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getRating() {
        return this.rating;
    }
    
    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getLikes() {
        return this.likes;
    }
    
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getReplyCount() {
        return this.replyCount;
    }
    
    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public Boolean getIsTop() {
        return this.isTop;
    }
    
    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }
    
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getDeviceInfo() {
        return this.deviceInfo;
    }
    
    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getParentUuid() {
        return this.parentUuid;
    }
    
    public void setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public PlusTreeParentMetadata getParentMetadata() {
        return this.parentMetadata;
    }
    
    public void setParentMetadata(PlusTreeParentMetadata parentMetadata) {
        this.parentMetadata = parentMetadata;
    }
}
