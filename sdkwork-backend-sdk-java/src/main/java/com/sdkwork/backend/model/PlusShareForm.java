package com.sdkwork.backend.model;

public class PlusShareForm {
    private String title;
    private String description;
    private String type;
    private ShareContents contents;
    private String contentType;
    private String status;
    private String shareUrl;
    private List<String> contentIds;
    private String password;
    private String expireAt;
    private Integer clickCount;
    private TagsContent tags;
    private String shareCode;

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

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public ShareContents getContents() {
        return this.contents;
    }
    
    public void setContents(ShareContents contents) {
        this.contents = contents;
    }

    public String getContentType() {
        return this.contentType;
    }
    
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }
    
    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public List<String> getContentIds() {
        return this.contentIds;
    }
    
    public void setContentIds(List<String> contentIds) {
        this.contentIds = contentIds;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getExpireAt() {
        return this.expireAt;
    }
    
    public void setExpireAt(String expireAt) {
        this.expireAt = expireAt;
    }

    public Integer getClickCount() {
        return this.clickCount;
    }
    
    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public TagsContent getTags() {
        return this.tags;
    }
    
    public void setTags(TagsContent tags) {
        this.tags = tags;
    }

    public String getShareCode() {
        return this.shareCode;
    }
    
    public void setShareCode(String shareCode) {
        this.shareCode = shareCode;
    }
}
