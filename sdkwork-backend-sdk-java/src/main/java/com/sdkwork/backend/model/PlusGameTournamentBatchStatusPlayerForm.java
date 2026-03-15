package com.sdkwork.backend.model;

public class PlusGameTournamentBatchStatusPlayerForm {
    private Integer userId;
    private String status;
    private Integer rankNo;
    private Double scoreValue;
    private Integer totalMatchCount;
    private Integer winCount;
    private Integer loseCount;

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getRankNo() {
        return this.rankNo;
    }
    
    public void setRankNo(Integer rankNo) {
        this.rankNo = rankNo;
    }

    public Double getScoreValue() {
        return this.scoreValue;
    }
    
    public void setScoreValue(Double scoreValue) {
        this.scoreValue = scoreValue;
    }

    public Integer getTotalMatchCount() {
        return this.totalMatchCount;
    }
    
    public void setTotalMatchCount(Integer totalMatchCount) {
        this.totalMatchCount = totalMatchCount;
    }

    public Integer getWinCount() {
        return this.winCount;
    }
    
    public void setWinCount(Integer winCount) {
        this.winCount = winCount;
    }

    public Integer getLoseCount() {
        return this.loseCount;
    }
    
    public void setLoseCount(Integer loseCount) {
        this.loseCount = loseCount;
    }
}
