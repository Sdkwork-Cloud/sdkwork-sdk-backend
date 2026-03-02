package com.sdkwork.backend.model;

public class MsgVideoContent {
    private String content;
    private VideoMediaResource resource;

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public VideoMediaResource getResource() {
        return this.resource;
    }
    
    public void setResource(VideoMediaResource resource) {
        this.resource = resource;
    }
}
