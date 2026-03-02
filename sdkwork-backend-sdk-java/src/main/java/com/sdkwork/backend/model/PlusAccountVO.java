package com.sdkwork.backend.model;

public class PlusAccountVO {
    private String createdAt;
    private String updatedAt;
    private Integer userId;
    private Double availableBalance;
    private Double frozenBalance;
    private Integer availablePoints;
    private Integer frozenPoints;
    private String status;
    private List<PlusAccountHistoryVO> historyList;

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

    public List<PlusAccountHistoryVO> getHistoryList() {
        return this.historyList;
    }
    
    public void setHistoryList(List<PlusAccountHistoryVO> historyList) {
        this.historyList = historyList;
    }
}
