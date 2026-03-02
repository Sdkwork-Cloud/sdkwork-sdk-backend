package com.sdkwork.backend.model;

public class PlusPptTemplateForm {
    private String title;
    private String description;
    private ImageMediaResourceList coverImages;
    private String type;
    private String status;
    private Integer authorId;
    private String authorName;
    private PlusPptTemplateTags tags;
    private PlusPptTemplateMeta meta;
    private List<PlusPptTemplateSlide> slides;

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

    public ImageMediaResourceList getCoverImages() {
        return this.coverImages;
    }
    
    public void setCoverImages(ImageMediaResourceList coverImages) {
        this.coverImages = coverImages;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getAuthorId() {
        return this.authorId;
    }
    
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return this.authorName;
    }
    
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public PlusPptTemplateTags getTags() {
        return this.tags;
    }
    
    public void setTags(PlusPptTemplateTags tags) {
        this.tags = tags;
    }

    public PlusPptTemplateMeta getMeta() {
        return this.meta;
    }
    
    public void setMeta(PlusPptTemplateMeta meta) {
        this.meta = meta;
    }

    public List<PlusPptTemplateSlide> getSlides() {
        return this.slides;
    }
    
    public void setSlides(List<PlusPptTemplateSlide> slides) {
        this.slides = slides;
    }
}
