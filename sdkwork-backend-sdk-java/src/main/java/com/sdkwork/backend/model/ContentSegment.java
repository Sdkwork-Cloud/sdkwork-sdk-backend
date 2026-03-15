package com.sdkwork.backend.model;

public class ContentSegment {
    private String id;
    private Integer order;
    private String type;
    private String text;
    private Integer startMs;
    private Integer endMs;
    private Map<String, Object> metadata;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public Integer getOrder() {
        return this.order;
    }
    
    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }

    public Integer getStartMs() {
        return this.startMs;
    }
    
    public void setStartMs(Integer startMs) {
        this.startMs = startMs;
    }

    public Integer getEndMs() {
        return this.endMs;
    }
    
    public void setEndMs(Integer endMs) {
        this.endMs = endMs;
    }

    public Map<String, Object> getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }
}
