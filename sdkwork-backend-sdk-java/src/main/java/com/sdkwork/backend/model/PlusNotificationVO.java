package com.sdkwork.backend.model;

public class PlusNotificationVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private String role;
    private Integer senderId;
    private Participant sender;
    private Integer receiverId;
    private Participant receiver;
    private Integer groupId;
    private String title;
    private String content;
    private String type;
    private String channelType;
    private String templateId;
    private Map<String, Object> templateParams;
    private String redirectUrl;
    private String miniProgramPath;
    private String status;
    private String sentAt;
    private String readAt;
    private Map<String, Object> extraData;
    private Integer retryCount;
    private Integer maxRetryCount;
    private String errorMessage;

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

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
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

    public Integer getReceiverId() {
        return this.receiverId;
    }
    
    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
    }

    public Participant getReceiver() {
        return this.receiver;
    }
    
    public void setReceiver(Participant receiver) {
        this.receiver = receiver;
    }

    public Integer getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getChannelType() {
        return this.channelType;
    }
    
    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getTemplateId() {
        return this.templateId;
    }
    
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public Map<String, Object> getTemplateParams() {
        return this.templateParams;
    }
    
    public void setTemplateParams(Map<String, Object> templateParams) {
        this.templateParams = templateParams;
    }

    public String getRedirectUrl() {
        return this.redirectUrl;
    }
    
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getMiniProgramPath() {
        return this.miniProgramPath;
    }
    
    public void setMiniProgramPath(String miniProgramPath) {
        this.miniProgramPath = miniProgramPath;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getSentAt() {
        return this.sentAt;
    }
    
    public void setSentAt(String sentAt) {
        this.sentAt = sentAt;
    }

    public String getReadAt() {
        return this.readAt;
    }
    
    public void setReadAt(String readAt) {
        this.readAt = readAt;
    }

    public Map<String, Object> getExtraData() {
        return this.extraData;
    }
    
    public void setExtraData(Map<String, Object> extraData) {
        this.extraData = extraData;
    }

    public Integer getRetryCount() {
        return this.retryCount;
    }
    
    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

    public Integer getMaxRetryCount() {
        return this.maxRetryCount;
    }
    
    public void setMaxRetryCount(Integer maxRetryCount) {
        this.maxRetryCount = maxRetryCount;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
    
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
