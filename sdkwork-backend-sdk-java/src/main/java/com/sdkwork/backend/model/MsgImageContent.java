package com.sdkwork.backend.model;

public class MsgImageContent {
    private String content;
    private ImageMediaResource resource;

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public ImageMediaResource getResource() {
        return this.resource;
    }
    
    public void setResource(ImageMediaResource resource) {
        this.resource = resource;
    }
}
