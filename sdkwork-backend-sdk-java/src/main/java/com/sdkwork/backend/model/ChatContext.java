package com.sdkwork.backend.model;

public class ChatContext {
    private String indent;
    private ChatResponseHandler responseHandler;
    private ShardingContext shardingContext;
    private String conversationId;
    private String conversationUuid;
    private Integer userId;
    private Integer knowledgeBaseId;
    private Integer agentId;
    private Integer flowId;
    private Integer datasourceId;
    private Integer parentMessageId;
    private Boolean saveAudio;
    private List<String> modalities;
    private PlusChatOptions chatOptions;
    private List<String> responseChannels;

    public String getIndent() {
        return this.indent;
    }
    
    public void setIndent(String indent) {
        this.indent = indent;
    }

    public ChatResponseHandler getResponseHandler() {
        return this.responseHandler;
    }
    
    public void setResponseHandler(ChatResponseHandler responseHandler) {
        this.responseHandler = responseHandler;
    }

    public ShardingContext getShardingContext() {
        return this.shardingContext;
    }
    
    public void setShardingContext(ShardingContext shardingContext) {
        this.shardingContext = shardingContext;
    }

    public String getConversationId() {
        return this.conversationId;
    }
    
    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public String getConversationUuid() {
        return this.conversationUuid;
    }
    
    public void setConversationUuid(String conversationUuid) {
        this.conversationUuid = conversationUuid;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }
    
    public void setKnowledgeBaseId(Integer knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    public Integer getAgentId() {
        return this.agentId;
    }
    
    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getFlowId() {
        return this.flowId;
    }
    
    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    public Integer getDatasourceId() {
        return this.datasourceId;
    }
    
    public void setDatasourceId(Integer datasourceId) {
        this.datasourceId = datasourceId;
    }

    public Integer getParentMessageId() {
        return this.parentMessageId;
    }
    
    public void setParentMessageId(Integer parentMessageId) {
        this.parentMessageId = parentMessageId;
    }

    public Boolean getSaveAudio() {
        return this.saveAudio;
    }
    
    public void setSaveAudio(Boolean saveAudio) {
        this.saveAudio = saveAudio;
    }

    public List<String> getModalities() {
        return this.modalities;
    }
    
    public void setModalities(List<String> modalities) {
        this.modalities = modalities;
    }

    public PlusChatOptions getChatOptions() {
        return this.chatOptions;
    }
    
    public void setChatOptions(PlusChatOptions chatOptions) {
        this.chatOptions = chatOptions;
    }

    public List<String> getResponseChannels() {
        return this.responseChannels;
    }
    
    public void setResponseChannels(List<String> responseChannels) {
        this.responseChannels = responseChannels;
    }
}
