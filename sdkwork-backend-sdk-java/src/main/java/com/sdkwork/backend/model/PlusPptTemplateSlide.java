package com.sdkwork.backend.model;

public class PlusPptTemplateSlide {
    private Integer tenantId;
    private Integer organizationId;
    private String dataScope;
    private Integer id;
    private String uuid;
    private String createdAt;
    private String updatedAt;
    private Integer v;
    private Integer templateId;
    private PlusPptTemplate pptTemplate;
    private PPTSlideType type;
    private String title;
    private String description;
    private Integer sortOrder;
    private String layoutType;
    private PlusPptSlide slideConfig;
    private PlusPptPayload payload;
    private PPTTurningMode pptturningMode;

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

    public Integer getTemplateId() {
        return this.templateId;
    }
    
    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public PlusPptTemplate getPptTemplate() {
        return this.pptTemplate;
    }
    
    public void setPptTemplate(PlusPptTemplate pptTemplate) {
        this.pptTemplate = pptTemplate;
    }

    public PPTSlideType getType() {
        return this.type;
    }
    
    public void setType(PPTSlideType type) {
        this.type = type;
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

    public Integer getSortOrder() {
        return this.sortOrder;
    }
    
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getLayoutType() {
        return this.layoutType;
    }
    
    public void setLayoutType(String layoutType) {
        this.layoutType = layoutType;
    }

    public PlusPptSlide getSlideConfig() {
        return this.slideConfig;
    }
    
    public void setSlideConfig(PlusPptSlide slideConfig) {
        this.slideConfig = slideConfig;
    }

    public PlusPptPayload getPayload() {
        return this.payload;
    }
    
    public void setPayload(PlusPptPayload payload) {
        this.payload = payload;
    }

    public PPTTurningMode getPptturningMode() {
        return this.pptturningMode;
    }
    
    public void setPptturningMode(PPTTurningMode pptturningMode) {
        this.pptturningMode = pptturningMode;
    }
}
