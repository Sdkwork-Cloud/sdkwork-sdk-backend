package com.sdkwork.backend.model;

public class ChatCompletionChunkDelta {
    private String role;
    private String content;
    private ChatCompletionAudio audio;
    private String reasoningContent;
    private List<ChatCompletionMessageToolCall> toolCalls;

    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public ChatCompletionAudio getAudio() {
        return this.audio;
    }
    
    public void setAudio(ChatCompletionAudio audio) {
        this.audio = audio;
    }

    public String getReasoningContent() {
        return this.reasoningContent;
    }
    
    public void setReasoningContent(String reasoningContent) {
        this.reasoningContent = reasoningContent;
    }

    public List<ChatCompletionMessageToolCall> getToolCalls() {
        return this.toolCalls;
    }
    
    public void setToolCalls(List<ChatCompletionMessageToolCall> toolCalls) {
        this.toolCalls = toolCalls;
    }
}
