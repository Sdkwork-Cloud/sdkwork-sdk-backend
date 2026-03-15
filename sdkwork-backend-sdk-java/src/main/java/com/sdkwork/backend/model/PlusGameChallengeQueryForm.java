package com.sdkwork.backend.model;

public class PlusGameChallengeQueryForm {
    private Integer id;
    private String createdAtFrom;
    private String createdAtTo;
    private Integer challengerUserId;
    private Integer targetUserId;
    private Integer arenaId;
    private Integer winnerUserId;
    private String gameType;
    private String status;
    private String sourceType;

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

    public Integer getChallengerUserId() {
        return this.challengerUserId;
    }
    
    public void setChallengerUserId(Integer challengerUserId) {
        this.challengerUserId = challengerUserId;
    }

    public Integer getTargetUserId() {
        return this.targetUserId;
    }
    
    public void setTargetUserId(Integer targetUserId) {
        this.targetUserId = targetUserId;
    }

    public Integer getArenaId() {
        return this.arenaId;
    }
    
    public void setArenaId(Integer arenaId) {
        this.arenaId = arenaId;
    }

    public Integer getWinnerUserId() {
        return this.winnerUserId;
    }
    
    public void setWinnerUserId(Integer winnerUserId) {
        this.winnerUserId = winnerUserId;
    }

    public String getGameType() {
        return this.gameType;
    }
    
    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getSourceType() {
        return this.sourceType;
    }
    
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
}
