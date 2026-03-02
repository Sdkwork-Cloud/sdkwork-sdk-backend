package com.sdkwork.backend.model;

public class ChatCompletionChunk {
    private String id;
    private String object;
    private Integer created;
    private String model;
    private List<ChatCompletionChunkChoice> choices;
    private CompletionUsage usage;
    private ChatCompletionMetadata metadata;
    private String content;
    private PlusAgent agent;
    private String reasoningContent;
    private String systemFingerprint;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return this.object;
    }
    
    public void setObject(String object) {
        this.object = object;
    }

    public Integer getCreated() {
        return this.created;
    }
    
    public void setCreated(Integer created) {
        this.created = created;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public List<ChatCompletionChunkChoice> getChoices() {
        return this.choices;
    }
    
    public void setChoices(List<ChatCompletionChunkChoice> choices) {
        this.choices = choices;
    }

    public CompletionUsage getUsage() {
        return this.usage;
    }
    
    public void setUsage(CompletionUsage usage) {
        this.usage = usage;
    }

    public ChatCompletionMetadata getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(ChatCompletionMetadata metadata) {
        this.metadata = metadata;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public PlusAgent getAgent() {
        return this.agent;
    }
    
    public void setAgent(PlusAgent agent) {
        this.agent = agent;
    }

    public String getReasoningContent() {
        return this.reasoningContent;
    }
    
    public void setReasoningContent(String reasoningContent) {
        this.reasoningContent = reasoningContent;
    }

    public String getSystemFingerprint() {
        return this.systemFingerprint;
    }
    
    public void setSystemFingerprint(String systemFingerprint) {
        this.systemFingerprint = systemFingerprint;
    }
}
