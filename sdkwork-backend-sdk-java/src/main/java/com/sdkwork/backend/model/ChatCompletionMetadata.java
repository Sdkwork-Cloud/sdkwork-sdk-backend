package com.sdkwork.backend.model;

public class ChatCompletionMetadata {
    private List<String> actions;
    private Map<String, Object> agent;
    private Integer parentMessageId;
    private String parentMessageUuid;

    public List<String> getActions() {
        return this.actions;
    }
    
    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public Map<String, Object> getAgent() {
        return this.agent;
    }
    
    public void setAgent(Map<String, Object> agent) {
        this.agent = agent;
    }

    public Integer getParentMessageId() {
        return this.parentMessageId;
    }
    
    public void setParentMessageId(Integer parentMessageId) {
        this.parentMessageId = parentMessageId;
    }

    public String getParentMessageUuid() {
        return this.parentMessageUuid;
    }
    
    public void setParentMessageUuid(String parentMessageUuid) {
        this.parentMessageUuid = parentMessageUuid;
    }
}
