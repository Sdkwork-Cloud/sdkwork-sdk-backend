package com.sdkwork.backend.model;

public class ContentVoteForm {
    private String contentType;
    private String rating;
    private Integer contentId;
    private ContentVoteMetadata metadata;

    public String getContentType() {
        return this.contentType;
    }
    
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getRating() {
        return this.rating;
    }
    
    public void setRating(String rating) {
        this.rating = rating;
    }

    public Integer getContentId() {
        return this.contentId;
    }
    
    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public ContentVoteMetadata getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(ContentVoteMetadata metadata) {
        this.metadata = metadata;
    }
}
