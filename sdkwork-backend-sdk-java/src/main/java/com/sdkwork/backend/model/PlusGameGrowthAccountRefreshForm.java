package com.sdkwork.backend.model;

public class PlusGameGrowthAccountRefreshForm {
    private Integer userId;
    private String accountType;
    private String gameType;
    private String gameModeCode;
    private String seasonKey;

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAccountType() {
        return this.accountType;
    }
    
    public void setAccountType(String accountType) {
        this.accountType = accountType;
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
}
