package com.sdkwork.backend.model;

public class PlusChatMessageVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private MessageBody body;
    private String role;
    private String type;
    private String status;
    private Integer conversationId;
    private String conversationUuid;
    private Integer userId;
    private Integer senderId;
    private Participant sender;
    private Participant receiver;
    private Integer receiverId;
    private Integer groupId;
    private Integer parentMessageId;
    private List<PlusChatMessageVO> children;
    private Map<String, Object> metadata;
    private Integer tokenCount;
    private String sendAt;
    private String receiveAt;
    private String readAt;
    private Integer processingTime;
    private Boolean isError;
    private String errorCode;
    private String errorMessage;
    private Integer modelId;
    private String model;
    private Double temperature;
    private Boolean usedRag;
    private PlusChatOptions chatOptions;
    private String channelId;
    private Integer agentId;
    private Integer knowledgeBaseId;
    private Integer datasourceId;
    private String agentType;
    private String agentBizType;
    private String channelMsgId;
    private String channelClientMsgId;
    private Integer channelMsgSeq;
    private String conversationType;
    private FeedbackMetadata feedbackMetadata;

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public MessageBody getBody() {
        return this.body;
    }
    
    public void setBody(MessageBody body) {
        this.body = body;
    }

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

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSenderId() {
        return this.senderId;
    }
    
    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    public Participant getSender() {
        return this.sender;
    }
    
    public void setSender(Participant sender) {
        this.sender = sender;
    }

    public Participant getReceiver() {
        return this.receiver;
    }
    
    public void setReceiver(Participant receiver) {
        this.receiver = receiver;
    }

    public Integer getReceiverId() {
        return this.receiverId;
    }
    
    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
    }

    public Integer getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getParentMessageId() {
        return this.parentMessageId;
    }
    
    public void setParentMessageId(Integer parentMessageId) {
        this.parentMessageId = parentMessageId;
    }

    public List<PlusChatMessageVO> getChildren() {
        return this.children;
    }
    
    public void setChildren(List<PlusChatMessageVO> children) {
        this.children = children;
    }

    public Map<String, Object> getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public Integer getTokenCount() {
        return this.tokenCount;
    }
    
    public void setTokenCount(Integer tokenCount) {
        this.tokenCount = tokenCount;
    }

    public String getSendAt() {
        return this.sendAt;
    }
    
    public void setSendAt(String sendAt) {
        this.sendAt = sendAt;
    }

    public String getReceiveAt() {
        return this.receiveAt;
    }
    
    public void setReceiveAt(String receiveAt) {
        this.receiveAt = receiveAt;
    }

    public String getReadAt() {
        return this.readAt;
    }
    
    public void setReadAt(String readAt) {
        this.readAt = readAt;
    }

    public Integer getProcessingTime() {
        return this.processingTime;
    }
    
    public void setProcessingTime(Integer processingTime) {
        this.processingTime = processingTime;
    }

    public Boolean getIsError() {
        return this.isError;
    }
    
    public void setIsError(Boolean isError) {
        this.isError = isError;
    }

    public String getErrorCode() {
        return this.errorCode;
    }
    
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
    
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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

    public Double getTemperature() {
        return this.temperature;
    }
    
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Boolean getUsedRag() {
        return this.usedRag;
    }
    
    public void setUsedRag(Boolean usedRag) {
        this.usedRag = usedRag;
    }

    public PlusChatOptions getChatOptions() {
        return this.chatOptions;
    }
    
    public void setChatOptions(PlusChatOptions chatOptions) {
        this.chatOptions = chatOptions;
    }

    public String getChannelId() {
        return this.channelId;
    }
    
    public void setChannelId(String channelId) {
        this.channelId = channelId;
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

    public Integer getDatasourceId() {
        return this.datasourceId;
    }
    
    public void setDatasourceId(Integer datasourceId) {
        this.datasourceId = datasourceId;
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

    public String getChannelMsgId() {
        return this.channelMsgId;
    }
    
    public void setChannelMsgId(String channelMsgId) {
        this.channelMsgId = channelMsgId;
    }

    public String getChannelClientMsgId() {
        return this.channelClientMsgId;
    }
    
    public void setChannelClientMsgId(String channelClientMsgId) {
        this.channelClientMsgId = channelClientMsgId;
    }

    public Integer getChannelMsgSeq() {
        return this.channelMsgSeq;
    }
    
    public void setChannelMsgSeq(Integer channelMsgSeq) {
        this.channelMsgSeq = channelMsgSeq;
    }

    public String getConversationType() {
        return this.conversationType;
    }
    
    public void setConversationType(String conversationType) {
        this.conversationType = conversationType;
    }

    public FeedbackMetadata getFeedbackMetadata() {
        return this.feedbackMetadata;
    }
    
    public void setFeedbackMetadata(FeedbackMetadata feedbackMetadata) {
        this.feedbackMetadata = feedbackMetadata;
    }
}
