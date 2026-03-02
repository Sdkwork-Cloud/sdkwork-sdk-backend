package com.sdkwork.backend.model;

public class MsgFileContent {
    private String content;
    private FileMediaResource resource;

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public FileMediaResource getResource() {
        return this.resource;
    }
    
    public void setResource(FileMediaResource resource) {
        this.resource = resource;
    }
}
