package com.sdkwork.backend.model;

public class PlusAccountForm {
    private Integer userId;
    private Double availableBalance;
    private Double frozenBalance;
    private Integer availablePoints;
    private Integer frozenPoints;
    private String status;

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getAvailableBalance() {
        return this.availableBalance;
    }
    
    public void setAvailableBalance(Double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public Double getFrozenBalance() {
        return this.frozenBalance;
    }
    
    public void setFrozenBalance(Double frozenBalance) {
        this.frozenBalance = frozenBalance;
    }

    public Integer getAvailablePoints() {
        return this.availablePoints;
    }
    
    public void setAvailablePoints(Integer availablePoints) {
        this.availablePoints = availablePoints;
    }

    public Integer getFrozenPoints() {
        return this.frozenPoints;
    }
    
    public void setFrozenPoints(Integer frozenPoints) {
        this.frozenPoints = frozenPoints;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
