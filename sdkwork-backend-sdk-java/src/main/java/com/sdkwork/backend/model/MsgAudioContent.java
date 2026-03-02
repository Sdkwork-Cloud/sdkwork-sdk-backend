package com.sdkwork.backend.model;

public class MsgAudioContent {
    private String content;
    private AudioMediaResource resource;

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public AudioMediaResource getResource() {
        return this.resource;
    }
    
    public void setResource(AudioMediaResource resource) {
        this.resource = resource;
    }
}
