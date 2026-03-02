package com.sdkwork.backend.model;

public class PlusParticipantVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private String type;
    private String name;
    private ImageMediaResource face;
    private Integer userId;
    private Integer agentId;
    private String role;
    private String contextType;
    private Integer contextId;
    private Integer conversationId;
    private String groupType;
    private String conversationType;
    private Boolean isCreator;
    private Boolean isOnline;
    private String lastActiveTime;
    private Boolean isTemporary;

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

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public ImageMediaResource getFace() {
        return this.face;
    }
    
    public void setFace(ImageMediaResource face) {
        this.face = face;
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

    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }

    public String getContextType() {
        return this.contextType;
    }
    
    public void setContextType(String contextType) {
        this.contextType = contextType;
    }

    public Integer getContextId() {
        return this.contextId;
    }
    
    public void setContextId(Integer contextId) {
        this.contextId = contextId;
    }

    public Integer getConversationId() {
        return this.conversationId;
    }
    
    public void setConversationId(Integer conversationId) {
        this.conversationId = conversationId;
    }

    public String getGroupType() {
        return this.groupType;
    }
    
    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public String getConversationType() {
        return this.conversationType;
    }
    
    public void setConversationType(String conversationType) {
        this.conversationType = conversationType;
    }

    public Boolean getIsCreator() {
        return this.isCreator;
    }
    
    public void setIsCreator(Boolean isCreator) {
        this.isCreator = isCreator;
    }

    public Boolean getIsOnline() {
        return this.isOnline;
    }
    
    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

    public String getLastActiveTime() {
        return this.lastActiveTime;
    }
    
    public void setLastActiveTime(String lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
    }

    public Boolean getIsTemporary() {
        return this.isTemporary;
    }
    
    public void setIsTemporary(Boolean isTemporary) {
        this.isTemporary = isTemporary;
    }
}
