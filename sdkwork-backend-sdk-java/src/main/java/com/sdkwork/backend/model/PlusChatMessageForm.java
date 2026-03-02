package com.sdkwork.backend.model;

public class PlusChatMessageForm {
    private MessageBody content;
    private String role;
    private String type;
    private String status;
    private Integer conversationId;
    private Integer userId;
    private Integer parentMessageId;
    private Map<String, Object> metadata;
    private Integer tokenCount;
    private Integer processingTime;
    private Boolean isError;
    private String errorCode;
    private String errorMessage;
    private Integer modelId;
    private String model;
    private Double temperature;
    private Boolean usedRag;
    private PlusChatOptions chatOptions;

    public MessageBody getContent() {
        return this.content;
    }
    
    public void setContent(MessageBody content) {
        this.content = content;
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

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getParentMessageId() {
        return this.parentMessageId;
    }
    
    public void setParentMessageId(Integer parentMessageId) {
        this.parentMessageId = parentMessageId;
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
}
