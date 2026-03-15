package com.sdkwork.backend.model;

public class PlusGameArenaQueryForm {
    private Integer id;
    private String createdAtFrom;
    private String createdAtTo;
    private Integer ownerUserId;
    private Integer currentChampionUserId;
    private String gameType;
    private String gameModeCode;
    private String status;

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
}
