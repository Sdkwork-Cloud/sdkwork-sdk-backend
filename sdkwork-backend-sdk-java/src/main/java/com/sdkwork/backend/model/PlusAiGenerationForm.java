package com.sdkwork.backend.model;

public class PlusAiGenerationForm {
    private Integer userId;
    private String requestId;
    private String model;
    private String channel;
    private String type;
    private ImageMediaResourceList coverImages;
    private AssetMediaResourceList resourceList;
    private VideoStoryboard storyboard;
    private AuthorInfo author;
    private TagsContent tags;
    private Integer promptId;
    private String channelTaskId;
    private String channelTaskStatus;
    private String taskCreatedTime;
    private String taskUpdatedTime;
    private Double cost;
    private String status;
    private String requestTime;
    private String responseTime;
    private Integer usageRecordId;
    private Integer conversationId;
    private Integer messageId;

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

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public ImageMediaResourceList getCoverImages() {
        return this.coverImages;
    }
    
    public void setCoverImages(ImageMediaResourceList coverImages) {
        this.coverImages = coverImages;
    }

    public AssetMediaResourceList getResourceList() {
        return this.resourceList;
    }
    
    public void setResourceList(AssetMediaResourceList resourceList) {
        this.resourceList = resourceList;
    }

    public VideoStoryboard getStoryboard() {
        return this.storyboard;
    }
    
    public void setStoryboard(VideoStoryboard storyboard) {
        this.storyboard = storyboard;
    }

    public AuthorInfo getAuthor() {
        return this.author;
    }
    
    public void setAuthor(AuthorInfo author) {
        this.author = author;
    }

    public TagsContent getTags() {
        return this.tags;
    }
    
    public void setTags(TagsContent tags) {
        this.tags = tags;
    }

    public Integer getPromptId() {
        return this.promptId;
    }
    
    public void setPromptId(Integer promptId) {
        this.promptId = promptId;
    }

    public String getChannelTaskId() {
        return this.channelTaskId;
    }
    
    public void setChannelTaskId(String channelTaskId) {
        this.channelTaskId = channelTaskId;
    }

    public String getChannelTaskStatus() {
        return this.channelTaskStatus;
    }
    
    public void setChannelTaskStatus(String channelTaskStatus) {
        this.channelTaskStatus = channelTaskStatus;
    }

    public String getTaskCreatedTime() {
        return this.taskCreatedTime;
    }
    
    public void setTaskCreatedTime(String taskCreatedTime) {
        this.taskCreatedTime = taskCreatedTime;
    }

    public String getTaskUpdatedTime() {
        return this.taskUpdatedTime;
    }
    
    public void setTaskUpdatedTime(String taskUpdatedTime) {
        this.taskUpdatedTime = taskUpdatedTime;
    }

    public Double getCost() {
        return this.cost;
    }
    
    public void setCost(Double cost) {
        this.cost = cost;
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

    public Integer getUsageRecordId() {
        return this.usageRecordId;
    }
    
    public void setUsageRecordId(Integer usageRecordId) {
        this.usageRecordId = usageRecordId;
    }

    public Integer getConversationId() {
        return this.conversationId;
    }
    
    public void setConversationId(Integer conversationId) {
        this.conversationId = conversationId;
    }

    public Integer getMessageId() {
        return this.messageId;
    }
    
    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }
}
