package com.sdkwork.backend.model;

public class PlusVisitHistoryForm {
    private String contentType;
    private Integer contentId;
    private Integer visitCount;
    private String lastVisitedAt;
    private Integer duration;
    private String source;

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

    public Integer getVisitCount() {
        return this.visitCount;
    }
    
    public void setVisitCount(Integer visitCount) {
        this.visitCount = visitCount;
    }

    public String getLastVisitedAt() {
        return this.lastVisitedAt;
    }
    
    public void setLastVisitedAt(String lastVisitedAt) {
        this.lastVisitedAt = lastVisitedAt;
    }

    public Integer getDuration() {
        return this.duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getSource() {
        return this.source;
    }
    
    public void setSource(String source) {
        this.source = source;
    }
}
