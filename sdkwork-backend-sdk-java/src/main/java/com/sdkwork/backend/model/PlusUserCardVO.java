package com.sdkwork.backend.model;

public class PlusUserCardVO {
    private String createdAt;
    private String updatedAt;
    private Integer userId;
    private Integer cardId;
    private String cardCode;
    private String acquireTime;
    private String activateTime;
    private String cancelTime;
    private Integer points;
    private Integer balance;

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

    public Integer getCardId() {
        return this.cardId;
    }
    
    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCardCode() {
        return this.cardCode;
    }
    
    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getAcquireTime() {
        return this.acquireTime;
    }
    
    public void setAcquireTime(String acquireTime) {
        this.acquireTime = acquireTime;
    }

    public String getActivateTime() {
        return this.activateTime;
    }
    
    public void setActivateTime(String activateTime) {
        this.activateTime = activateTime;
    }

    public String getCancelTime() {
        return this.cancelTime;
    }
    
    public void setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Integer getPoints() {
        return this.points;
    }
    
    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getBalance() {
        return this.balance;
    }
    
    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
