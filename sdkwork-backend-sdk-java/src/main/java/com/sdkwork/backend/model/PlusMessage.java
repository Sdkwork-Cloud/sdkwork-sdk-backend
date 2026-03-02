package com.sdkwork.backend.model;

public class PlusMessage {
    private Integer id;
    private String uuid;
    private String createdAt;
    private String updatedAt;
    private String sendAt;
    private Integer conversationId;
    private String type;
    private Participant sender;
    private Participant receiver;
    private Integer groupId;
    private String msgId;
    private String clientMsgId;
    private MessageBody body;
    private Map<String, Object> metadata;
    private String content;

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

    public String getSendAt() {
        return this.sendAt;
    }
    
    public void setSendAt(String sendAt) {
        this.sendAt = sendAt;
    }

    public Integer getConversationId() {
        return this.conversationId;
    }
    
    public void setConversationId(Integer conversationId) {
        this.conversationId = conversationId;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
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

    public Integer getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getMsgId() {
        return this.msgId;
    }
    
    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getClientMsgId() {
        return this.clientMsgId;
    }
    
    public void setClientMsgId(String clientMsgId) {
        this.clientMsgId = clientMsgId;
    }

    public MessageBody getBody() {
        return this.body;
    }
    
    public void setBody(MessageBody body) {
        this.body = body;
    }

    public Map<String, Object> getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
}
