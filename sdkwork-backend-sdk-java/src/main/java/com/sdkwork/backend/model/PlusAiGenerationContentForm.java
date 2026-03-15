package com.sdkwork.backend.model;

public class PlusAiGenerationContentForm {
    private String title;
    private String description;
    private String contentType;
    private Integer contentId;
    private Map<String, Object> metadata;
    private String contentFormat;

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

    public String getContentFormat() {
        return this.contentFormat;
    }
    
    public void setContentFormat(String contentFormat) {
        this.contentFormat = contentFormat;
    }
}
