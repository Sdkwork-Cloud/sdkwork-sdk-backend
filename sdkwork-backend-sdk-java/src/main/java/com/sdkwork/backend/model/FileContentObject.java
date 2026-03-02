package com.sdkwork.backend.model;

public class FileContentObject {
    private String text;
    private Map<String, String> contents;

    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }

    public Map<String, String> getContents() {
        return this.contents;
    }
    
    public void setContents(Map<String, String> contents) {
        this.contents = contents;
    }
}
