package com.sdkwork.backend.model;

public class PlusGameActionRecordQueryForm {
    private Integer id;
    private String createdAtFrom;
    private String createdAtTo;
    private Integer roomId;
    private Integer matchId;
    private Integer playerUserId;
    private String actionType;
    private String actionCode;

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

    public Integer getRoomId() {
        return this.roomId;
    }
    
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getMatchId() {
        return this.matchId;
    }
    
    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public Integer getPlayerUserId() {
        return this.playerUserId;
    }
    
    public void setPlayerUserId(Integer playerUserId) {
        this.playerUserId = playerUserId;
    }

    public String getActionType() {
        return this.actionType;
    }
    
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionCode() {
        return this.actionCode;
    }
    
    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }
}
