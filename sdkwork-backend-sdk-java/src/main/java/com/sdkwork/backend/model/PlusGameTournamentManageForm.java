package com.sdkwork.backend.model;

public class PlusGameTournamentManageForm {
    private String status;
    private String signUpStartAt;
    private String signUpEndAt;
    private String startAt;
    private String endAt;
    private Integer winnerUserId;
    private Integer winnerClubId;

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getSignUpStartAt() {
        return this.signUpStartAt;
    }
    
    public void setSignUpStartAt(String signUpStartAt) {
        this.signUpStartAt = signUpStartAt;
    }

    public String getSignUpEndAt() {
        return this.signUpEndAt;
    }
    
    public void setSignUpEndAt(String signUpEndAt) {
        this.signUpEndAt = signUpEndAt;
    }

    public String getStartAt() {
        return this.startAt;
    }
    
    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public String getEndAt() {
        return this.endAt;
    }
    
    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    public Integer getWinnerUserId() {
        return this.winnerUserId;
    }
    
    public void setWinnerUserId(Integer winnerUserId) {
        this.winnerUserId = winnerUserId;
    }

    public Integer getWinnerClubId() {
        return this.winnerClubId;
    }
    
    public void setWinnerClubId(Integer winnerClubId) {
        this.winnerClubId = winnerClubId;
    }
}
