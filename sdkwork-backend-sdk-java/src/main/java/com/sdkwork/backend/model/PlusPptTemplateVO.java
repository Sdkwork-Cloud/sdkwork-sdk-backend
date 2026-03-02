package com.sdkwork.backend.model;

public class PlusPptTemplateVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private String title;
    private String description;
    private ImageMediaResourceList coverImages;
    private String type;
    private String status;
    private Integer authorId;
    private String authorName;
    private PlusPptTemplateTags tags;
    private PlusPptTemplateMeta meta;
    private List<PlusPptTemplateSlideVO> slides;

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

    public List<PlusPptTemplateSlideVO> getSlides() {
        return this.slides;
    }
    
    public void setSlides(List<PlusPptTemplateSlideVO> slides) {
        this.slides = slides;
    }
}
