package com.sdkwork.backend.model;

public class ChatMessageQueryListForm {
    private Integer id;
    private String createdAtFrom;
    private String createdAtTo;
    private Integer conversationId;
    private String conversationUuid;
    private String lastSyncMessageId;

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

    public String getConversationUuid() {
        return this.conversationUuid;
    }
    
    public void setConversationUuid(String conversationUuid) {
        this.conversationUuid = conversationUuid;
    }

    public String getLastSyncMessageId() {
        return this.lastSyncMessageId;
    }
    
    public void setLastSyncMessageId(String lastSyncMessageId) {
        this.lastSyncMessageId = lastSyncMessageId;
    }
}
