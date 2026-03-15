package com.sdkwork.backend.model;

public class PlusGameGrowthRewardClaimVO {
    private String createdAt;
    private String updatedAt;
    private Integer accountId;
    private Integer userId;
    private String accountType;
    private String gameType;
    private String gameModeCode;
    private String seasonKey;
    private Integer currentLevelNo;
    private Integer levelNo;
    private String levelCode;
    private String levelName;
    private String title;
    private String badgeCode;
    private String claimedAt;
    private String rewardIssuedAt;
    private Integer operatorUserId;
    private Map<String, Object> rewardConfig;
    private Map<String, Object> rewardSummary;

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

    public Integer getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

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

    public Integer getCurrentLevelNo() {
        return this.currentLevelNo;
    }
    
    public void setCurrentLevelNo(Integer currentLevelNo) {
        this.currentLevelNo = currentLevelNo;
    }

    public Integer getLevelNo() {
        return this.levelNo;
    }
    
    public void setLevelNo(Integer levelNo) {
        this.levelNo = levelNo;
    }

    public String getLevelCode() {
        return this.levelCode;
    }
    
    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    public String getLevelName() {
        return this.levelName;
    }
    
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getBadgeCode() {
        return this.badgeCode;
    }
    
    public void setBadgeCode(String badgeCode) {
        this.badgeCode = badgeCode;
    }

    public String getClaimedAt() {
        return this.claimedAt;
    }
    
    public void setClaimedAt(String claimedAt) {
        this.claimedAt = claimedAt;
    }

    public String getRewardIssuedAt() {
        return this.rewardIssuedAt;
    }
    
    public void setRewardIssuedAt(String rewardIssuedAt) {
        this.rewardIssuedAt = rewardIssuedAt;
    }

    public Integer getOperatorUserId() {
        return this.operatorUserId;
    }
    
    public void setOperatorUserId(Integer operatorUserId) {
        this.operatorUserId = operatorUserId;
    }

    public Map<String, Object> getRewardConfig() {
        return this.rewardConfig;
    }
    
    public void setRewardConfig(Map<String, Object> rewardConfig) {
        this.rewardConfig = rewardConfig;
    }

    public Map<String, Object> getRewardSummary() {
        return this.rewardSummary;
    }
    
    public void setRewardSummary(Map<String, Object> rewardSummary) {
        this.rewardSummary = rewardSummary;
    }
}
