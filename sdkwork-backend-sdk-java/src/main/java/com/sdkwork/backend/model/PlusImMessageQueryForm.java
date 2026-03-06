package com.sdkwork.backend.model;

public class PlusImMessageQueryForm {
    private Integer id;
    private String createdAtFrom;
    private String createdAtTo;
    private Integer conversationId;
    private Integer senderId;
    private Integer receiverId;
    private Integer groupId;
    private String type;

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreatedAtFrom() {
        return this.createdAtFrom;
    }
    
    public void setCreatedAtFrom(String createdAtFrom) {
        this.createdAtFrom = createdAtFrom;
    }

    public String getCreatedAtTo() {
        return this.createdAtTo;
    }
    
    public void setCreatedAtTo(String createdAtTo) {
        this.createdAtTo = createdAtTo;
    }

    public Integer getConversationId() {
        return this.conversationId;
    }
    
    public void setConversationId(Integer conversationId) {
        this.conversationId = conversationId;
    }

    public Integer getSenderId() {
        return this.senderId;
    }
    
    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
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

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}
