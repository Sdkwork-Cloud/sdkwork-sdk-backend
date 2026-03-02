package com.sdkwork.backend.model;

public class PlusChatMessageContentForm {
    private String role;
    private String type;
    private String status;
    private Integer conversationId;
    private String conversationUuid;
    private Integer agentId;
    private String agentType;
    private String agentBizType;
    private MessageBody content;
    private Map<String, Object> metadata;

    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getConversationId() {
        return this.conversationId;
    }
    
    public void setConversationId(Integer conversationId) {
        this.conversationId = conversationId;
    }

    public String getConversationUuid() {
        return this.conversationUuid;
    }
    
    public void setConversationUuid(String conversationUuid) {
        this.conversationUuid = conversationUuid;
    }

    public Integer getAgentId() {
        return this.agentId;
    }
    
    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getAgentType() {
        return this.agentType;
    }
    
    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    public String getAgentBizType() {
        return this.agentBizType;
    }
    
    public void setAgentBizType(String agentBizType) {
        this.agentBizType = agentBizType;
    }

    public MessageBody getContent() {
        return this.content;
    }
    
    public void setContent(MessageBody content) {
        this.content = content;
    }

    public Map<String, Object> getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }
}
