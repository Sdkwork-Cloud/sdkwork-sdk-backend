package com.sdkwork.backend.model;

public class PlusDetailForm {
    private String contentType;
    private Integer contentId;
    private DetailContent content;

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

    public DetailContent getContent() {
        return this.content;
    }
    
    public void setContent(DetailContent content) {
        this.content = content;
    }
}
