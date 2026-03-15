package com.sdkwork.backend.model;

public class PlusGameChallengeManageForm {
    private String status;
    private Integer winnerUserId;
    private Integer roomId;
    private Integer matchId;
    private String reason;

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getWinnerUserId() {
        return this.winnerUserId;
    }
    
    public void setWinnerUserId(Integer winnerUserId) {
        this.winnerUserId = winnerUserId;
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

    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
}
