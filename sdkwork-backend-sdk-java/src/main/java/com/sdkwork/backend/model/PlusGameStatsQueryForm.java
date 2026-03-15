package com.sdkwork.backend.model;

public class PlusGameStatsQueryForm {
    private Integer userId;
    private String gameType;
    private String gameModeCode;
    private String seasonKey;
    private String scopeType;
    private Integer scopeOwnerId;

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getSeasonKey() {
        return this.seasonKey;
    }
    
    public void setSeasonKey(String seasonKey) {
        this.seasonKey = seasonKey;
    }

    public String getScopeType() {
        return this.scopeType;
    }
    
    public void setScopeType(String scopeType) {
        this.scopeType = scopeType;
    }

    public Integer getScopeOwnerId() {
        return this.scopeOwnerId;
    }
    
    public void setScopeOwnerId(Integer scopeOwnerId) {
        this.scopeOwnerId = scopeOwnerId;
    }
}
