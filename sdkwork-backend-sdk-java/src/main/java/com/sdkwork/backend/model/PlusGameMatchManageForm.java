package com.sdkwork.backend.model;

public class PlusGameMatchManageForm {
    private String status;
    private Integer currentRoundNo;
    private Integer maxRoundCount;
    private Integer currentTurnSeatNo;
    private Integer dealerSeatNo;
    private Integer winnerSeatNo;
    private Integer winnerUserId;
    private Boolean leaderboardEligible;
    private Boolean validForStats;
    private Boolean resultConfirmed;
    private Boolean abnormalFinished;
    private String invalidReason;

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCurrentRoundNo() {
        return this.currentRoundNo;
    }
    
    public void setCurrentRoundNo(Integer currentRoundNo) {
        this.currentRoundNo = currentRoundNo;
    }

    public Integer getMaxRoundCount() {
        return this.maxRoundCount;
    }
    
    public void setMaxRoundCount(Integer maxRoundCount) {
        this.maxRoundCount = maxRoundCount;
    }

    public Integer getCurrentTurnSeatNo() {
        return this.currentTurnSeatNo;
    }
    
    public void setCurrentTurnSeatNo(Integer currentTurnSeatNo) {
        this.currentTurnSeatNo = currentTurnSeatNo;
    }

    public Integer getDealerSeatNo() {
        return this.dealerSeatNo;
    }
    
    public void setDealerSeatNo(Integer dealerSeatNo) {
        this.dealerSeatNo = dealerSeatNo;
    }

    public Integer getWinnerSeatNo() {
        return this.winnerSeatNo;
    }
    
    public void setWinnerSeatNo(Integer winnerSeatNo) {
        this.winnerSeatNo = winnerSeatNo;
    }

    public Integer getWinnerUserId() {
        return this.winnerUserId;
    }
    
    public void setWinnerUserId(Integer winnerUserId) {
        this.winnerUserId = winnerUserId;
    }

    public Boolean getLeaderboardEligible() {
        return this.leaderboardEligible;
    }
    
    public void setLeaderboardEligible(Boolean leaderboardEligible) {
        this.leaderboardEligible = leaderboardEligible;
    }

    public Boolean getValidForStats() {
        return this.validForStats;
    }
    
    public void setValidForStats(Boolean validForStats) {
        this.validForStats = validForStats;
    }

    public Boolean getResultConfirmed() {
        return this.resultConfirmed;
    }
    
    public void setResultConfirmed(Boolean resultConfirmed) {
        this.resultConfirmed = resultConfirmed;
    }

    public Boolean getAbnormalFinished() {
        return this.abnormalFinished;
    }
    
    public void setAbnormalFinished(Boolean abnormalFinished) {
        this.abnormalFinished = abnormalFinished;
    }

    public String getInvalidReason() {
        return this.invalidReason;
    }
    
    public void setInvalidReason(String invalidReason) {
        this.invalidReason = invalidReason;
    }
}
