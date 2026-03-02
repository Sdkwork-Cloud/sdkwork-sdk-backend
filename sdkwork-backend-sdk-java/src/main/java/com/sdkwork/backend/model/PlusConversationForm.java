package com.sdkwork.backend.model;

public class PlusConversationForm {
    private String uuid;
    private String title;
    private String description;
    private Integer userId;
    private String status;
    private Integer agentId;
    private String summary;
    private Integer lastMessageId;
    private Integer messageCount;
    private TagsContent tags;
    private String systemContext;
    private String userContext;
    private String lastInteractionTime;
    private Integer modelId;
    private String model;
    private Integer knowledgeBaseId;
    private Integer dataSourceId;
    private PlusChatOptions chatOptions;
    private Boolean pinned;
    private Integer sortOrder;

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getAgentId() {
        return this.agentId;
    }
    
    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getSummary() {
        return this.summary;
    }
    
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getLastMessageId() {
        return this.lastMessageId;
    }
    
    public void setLastMessageId(Integer lastMessageId) {
        this.lastMessageId = lastMessageId;
    }

    public Integer getMessageCount() {
        return this.messageCount;
    }
    
    public void setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
    }

    public TagsContent getTags() {
        return this.tags;
    }
    
    public void setTags(TagsContent tags) {
        this.tags = tags;
    }

    public String getSystemContext() {
        return this.systemContext;
    }
    
    public void setSystemContext(String systemContext) {
        this.systemContext = systemContext;
    }

    public String getUserContext() {
        return this.userContext;
    }
    
    public void setUserContext(String userContext) {
        this.userContext = userContext;
    }

    public String getLastInteractionTime() {
        return this.lastInteractionTime;
    }
    
    public void setLastInteractionTime(String lastInteractionTime) {
        this.lastInteractionTime = lastInteractionTime;
    }

    public Integer getModelId() {
        return this.modelId;
    }
    
    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
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

    public Boolean getPinned() {
        return this.pinned;
    }
    
    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    public Integer getSortOrder() {
        return this.sortOrder;
    }
    
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
}
