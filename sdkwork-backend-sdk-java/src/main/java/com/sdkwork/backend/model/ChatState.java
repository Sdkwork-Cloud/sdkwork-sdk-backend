package com.sdkwork.backend.model;

public class ChatState {
    private String content;
    private String reasoningContent;
    private Boolean thinking;

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getReasoningContent() {
        return this.reasoningContent;
    }
    
    public void setReasoningContent(String reasoningContent) {
        this.reasoningContent = reasoningContent;
    }

    public Boolean getThinking() {
        return this.thinking;
    }
    
    public void setThinking(Boolean thinking) {
        this.thinking = thinking;
    }
}
