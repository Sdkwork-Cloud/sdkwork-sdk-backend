package com.sdkwork.backend.model;

public class PlusPptTemplate {
    private Integer tenantId;
    private Integer organizationId;
    private String dataScope;
    private Integer id;
    private String uuid;
    private String createdAt;
    private String updatedAt;
    private Integer v;
    private String title;
    private String description;
    private ImageMediaResourceList coverImages;
    private String type;
    private String status;
    private Integer authorId;
    private String authorName;
    private PlusUser author;
    private PlusPptTemplateTags tags;
    private PlusPptTemplateMeta meta;
    private List<PlusPptTemplateSlide> slides;

    public Integer getTenantId() {
        return this.tenantId;
    }
    
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public Integer getOrganizationId() {
        return this.organizationId;
    }
    
    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getDataScope() {
        return this.dataScope;
    }
    
    public void setDataScope(String dataScope) {
        this.dataScope = dataScope;
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

    public Integer getV() {
        return this.v;
    }
    
    public void setV(Integer v) {
        this.v = v;
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

    public PlusUser getAuthor() {
        return this.author;
    }
    
    public void setAuthor(PlusUser author) {
        this.author = author;
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
