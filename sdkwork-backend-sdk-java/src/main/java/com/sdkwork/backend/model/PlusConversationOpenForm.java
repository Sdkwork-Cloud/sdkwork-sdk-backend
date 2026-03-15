package com.sdkwork.backend.model;

public class PlusConversationOpenForm {
    private String conversationId;
    private String uuid;
    private Integer userId;
    private Integer agentId;
    private Integer knowledgeBaseId;
    private Integer dataSourceId;
    private PlusChatOptions chatOptions;

    public String getConversationId() {
        return this.conversationId;
    }
    
    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAgentId() {
        return this.agentId;
    }
    
    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }
    
    public void setKnowledgeBaseId(Integer knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    public Integer getDataSourceId() {
        return this.dataSourceId;
    }
    
    public void setDataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public PlusChatOptions getChatOptions() {
        return this.chatOptions;
    }
    
    public void setChatOptions(PlusChatOptions chatOptions) {
        this.chatOptions = chatOptions;
    }
}
