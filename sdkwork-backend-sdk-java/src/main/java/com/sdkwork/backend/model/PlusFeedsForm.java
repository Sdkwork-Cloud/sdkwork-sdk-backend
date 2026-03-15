package com.sdkwork.backend.model;

public class PlusFeedsForm {
    private String title;
    private String summary;
    private Integer categoryId;
    private String contentType;
    private Integer contentId;
    private ImageMediaResourceList coverImages;
    private String source;
    private String publishTime;
    private TagsContent tags;
    private String status;

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return this.summary;
    }
    
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
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

    public ImageMediaResourceList getCoverImages() {
        return this.coverImages;
    }
    
    public void setCoverImages(ImageMediaResourceList coverImages) {
        this.coverImages = coverImages;
    }

    public String getSource() {
        return this.source;
    }
    
    public void setSource(String source) {
        this.source = source;
    }

    public String getPublishTime() {
        return this.publishTime;
    }
    
    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public TagsContent getTags() {
        return this.tags;
    }
    
    public void setTags(TagsContent tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
