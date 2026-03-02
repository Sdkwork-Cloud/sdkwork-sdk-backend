package com.sdkwork.backend.model;

public class PlusAiGenerationContentVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private Integer version;
    private String title;
    private String description;
    private String contentType;
    private Integer contentId;
    private Map<String, Object> metadata;
    private GenerationInputParams inputParams;
    private GenerationOutput output;
    private String contentFormat;
    private String contentUrl;
    private Integer fileSize;

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

    public Integer getVersion() {
        return this.version;
    }
    
    public void setVersion(Integer version) {
        this.version = version;
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

    public Map<String, Object> getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public GenerationInputParams getInputParams() {
        return this.inputParams;
    }
    
    public void setInputParams(GenerationInputParams inputParams) {
        this.inputParams = inputParams;
    }

    public GenerationOutput getOutput() {
        return this.output;
    }
    
    public void setOutput(GenerationOutput output) {
        this.output = output;
    }

    public String getContentFormat() {
        return this.contentFormat;
    }
    
    public void setContentFormat(String contentFormat) {
        this.contentFormat = contentFormat;
    }

    public String getContentUrl() {
        return this.contentUrl;
    }
    
    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public Integer getFileSize() {
        return this.fileSize;
    }
    
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }
}
