package com.sdkwork.backend.model;

public class GroupInfo {
    private String id;
    private String object;
    private Integer created;
    private String model;
    private String systemFingerprint;
    private ChatCompletionMetadata metadata;
    private PlusAgent agent;

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

    public String getSystemFingerprint() {
        return this.systemFingerprint;
    }
    
    public void setSystemFingerprint(String systemFingerprint) {
        this.systemFingerprint = systemFingerprint;
    }

    public ChatCompletionMetadata getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(ChatCompletionMetadata metadata) {
        this.metadata = metadata;
    }

    public PlusAgent getAgent() {
        return this.agent;
    }
    
    public void setAgent(PlusAgent agent) {
        this.agent = agent;
    }
}
