package com.sdkwork.backend.model;

public class UserMessage {
    private String messageType;
    private Map<String, Object> metadata;
    private List<Media> media;
    private String text;

    public String getMessageType() {
        return this.messageType;
    }
    
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public Map<String, Object> getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public List<Media> getMedia() {
        return this.media;
    }
    
    public void setMedia(List<Media> media) {
        this.media = media;
    }

    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
}
