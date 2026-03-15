package com.sdkwork.backend.model;

public class PlusGameTournamentPlayerManageForm {
    private String status;
    private Integer seedNo;
    private Integer rankNo;
    private Integer teamNo;
    private Double scoreValue;
    private Integer totalMatchCount;
    private Integer winCount;
    private Integer loseCount;

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSeedNo() {
        return this.seedNo;
    }
    
    public void setSeedNo(Integer seedNo) {
        this.seedNo = seedNo;
    }

    public Integer getRankNo() {
        return this.rankNo;
    }
    
    public void setRankNo(Integer rankNo) {
        this.rankNo = rankNo;
    }

    public Integer getTeamNo() {
        return this.teamNo;
    }
    
    public void setTeamNo(Integer teamNo) {
        this.teamNo = teamNo;
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
