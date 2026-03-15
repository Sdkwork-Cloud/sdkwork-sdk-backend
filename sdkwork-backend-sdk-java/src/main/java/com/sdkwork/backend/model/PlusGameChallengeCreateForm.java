package com.sdkwork.backend.model;

public class PlusGameChallengeCreateForm {
    private Integer challengerUserId;
    private Integer targetUserId;
    private String gameType;
    private String gameModeCode;
    private Integer stakeScore;
    private String sourceType;
    private Integer arenaId;
    private Integer leaderboardId;
    private String reason;

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

    public Integer getStakeScore() {
        return this.stakeScore;
    }
    
    public void setStakeScore(Integer stakeScore) {
        this.stakeScore = stakeScore;
    }

    public String getSourceType() {
        return this.sourceType;
    }
    
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getArenaId() {
        return this.arenaId;
    }
    
    public void setArenaId(Integer arenaId) {
        this.arenaId = arenaId;
    }

    public Integer getLeaderboardId() {
        return this.leaderboardId;
    }
    
    public void setLeaderboardId(Integer leaderboardId) {
        this.leaderboardId = leaderboardId;
    }

    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
}
