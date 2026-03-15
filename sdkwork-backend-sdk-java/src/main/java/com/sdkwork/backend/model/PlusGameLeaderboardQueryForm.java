package com.sdkwork.backend.model;

public class PlusGameLeaderboardQueryForm {
    private Integer id;
    private String createdAtFrom;
    private String createdAtTo;
    private String gameType;
    private String gameModeCode;
    private String seasonKey;
    private Integer scopeOwnerId;
    private String rankingType;
    private String periodType;
    private String scopeType;

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

    public Integer getScopeOwnerId() {
        return this.scopeOwnerId;
    }
    
    public void setScopeOwnerId(Integer scopeOwnerId) {
        this.scopeOwnerId = scopeOwnerId;
    }

    public String getRankingType() {
        return this.rankingType;
    }
    
    public void setRankingType(String rankingType) {
        this.rankingType = rankingType;
    }

    public String getPeriodType() {
        return this.periodType;
    }
    
    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public String getScopeType() {
        return this.scopeType;
    }
    
    public void setScopeType(String scopeType) {
        this.scopeType = scopeType;
    }
}
