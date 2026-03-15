package com.sdkwork.backend.model;

public class PlusGameTournamentBatchArrangePlayerForm {
    private Integer userId;
    private Integer seedNo;
    private Integer teamNo;

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSeedNo() {
        return this.seedNo;
    }
    
    public void setSeedNo(Integer seedNo) {
        this.seedNo = seedNo;
    }

    public Integer getTeamNo() {
        return this.teamNo;
    }
    
    public void setTeamNo(Integer teamNo) {
        this.teamNo = teamNo;
    }
}
