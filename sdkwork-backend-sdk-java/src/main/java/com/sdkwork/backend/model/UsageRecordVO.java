package com.sdkwork.backend.model;

public class UsageRecordVO {
    private String createdAt;
    private String updatedAt;
    private Integer userId;
    private String requestId;
    private String modelName;
    private String channel;
    private String usageType;
    private String billingType;
    private Integer promptTokens;
    private Integer completionTokens;
    private Integer cachedTokens;
    private Integer totalTokens;
    private Integer callCount;
    private Integer processingTime;
    private Integer imageCount;
    private String imageSize;
    private Integer videoDuration;
    private Integer audioDuration;
    private Double cost;
    private String currencyCode;
    private String status;
    private String requestTime;
    private String responseTime;
    private Integer promptId;
    private Integer toolId;

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

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRequestId() {
        return this.requestId;
    }
    
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getModelName() {
        return this.modelName;
    }
    
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getUsageType() {
        return this.usageType;
    }
    
    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    public String getBillingType() {
        return this.billingType;
    }
    
    public void setBillingType(String billingType) {
        this.billingType = billingType;
    }

    public Integer getPromptTokens() {
        return this.promptTokens;
    }
    
    public void setPromptTokens(Integer promptTokens) {
        this.promptTokens = promptTokens;
    }

    public Integer getCompletionTokens() {
        return this.completionTokens;
    }
    
    public void setCompletionTokens(Integer completionTokens) {
        this.completionTokens = completionTokens;
    }

    public Integer getCachedTokens() {
        return this.cachedTokens;
    }
    
    public void setCachedTokens(Integer cachedTokens) {
        this.cachedTokens = cachedTokens;
    }

    public Integer getTotalTokens() {
        return this.totalTokens;
    }
    
    public void setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
    }

    public Integer getCallCount() {
        return this.callCount;
    }
    
    public void setCallCount(Integer callCount) {
        this.callCount = callCount;
    }

    public Integer getProcessingTime() {
        return this.processingTime;
    }
    
    public void setProcessingTime(Integer processingTime) {
        this.processingTime = processingTime;
    }

    public Integer getImageCount() {
        return this.imageCount;
    }
    
    public void setImageCount(Integer imageCount) {
        this.imageCount = imageCount;
    }

    public String getImageSize() {
        return this.imageSize;
    }
    
    public void setImageSize(String imageSize) {
        this.imageSize = imageSize;
    }

    public Integer getVideoDuration() {
        return this.videoDuration;
    }
    
    public void setVideoDuration(Integer videoDuration) {
        this.videoDuration = videoDuration;
    }

    public Integer getAudioDuration() {
        return this.audioDuration;
    }
    
    public void setAudioDuration(Integer audioDuration) {
        this.audioDuration = audioDuration;
    }

    public Double getCost() {
        return this.cost;
    }
    
    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }
    
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestTime() {
        return this.requestTime;
    }
    
    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public String getResponseTime() {
        return this.responseTime;
    }
    
    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }

    public Integer getPromptId() {
        return this.promptId;
    }
    
    public void setPromptId(Integer promptId) {
        this.promptId = promptId;
    }

    public Integer getToolId() {
        return this.toolId;
    }
    
    public void setToolId(Integer toolId) {
        this.toolId = toolId;
    }
}
