package com.sdkwork.backend.model;

public class PlusGameArenaManageForm {
    private Integer ownerUserId;
    private Integer currentChampionUserId;
    private String gameType;
    private String gameModeCode;
    private String status;
    private String name;
    private String description;
    private Integer stakeScore;
    private Integer roomId;
    private Integer matchId;
    private String reason;

    public Integer getOwnerUserId() {
        return this.ownerUserId;
    }
    
    public void setOwnerUserId(Integer ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public Integer getCurrentChampionUserId() {
        return this.currentChampionUserId;
    }
    
    public void setCurrentChampionUserId(Integer currentChampionUserId) {
        this.currentChampionUserId = currentChampionUserId;
    }

    public String getGameType() {
        return this.gameType;
    }
    
    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getGameModeCode() {
        return this.gameModeCode;
    }
    
    public void setGameModeCode(String gameModeCode) {
        this.gameModeCode = gameModeCode;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStakeScore() {
        return this.stakeScore;
    }
    
    public void setStakeScore(Integer stakeScore) {
        this.stakeScore = stakeScore;
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
