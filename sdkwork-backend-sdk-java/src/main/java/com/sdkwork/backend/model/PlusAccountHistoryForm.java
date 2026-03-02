package com.sdkwork.backend.model;

public class PlusAccountHistoryForm {
    private String assetType;
    private Integer accountId;
    private String transactionId;
    private String transactionType;
    private Double amount;
    private Double balanceBefore;
    private Double balanceAfter;
    private Integer relatedAccountId;
    private Integer pointsChange;
    private Integer pointsBefore;
    private Integer pointsAfter;
    private String sourceType;
    private String sourceId;
    private String expiredAt;
    private String status;
    private String remarks;

    public String getAssetType() {
        return this.assetType;
    }
    
    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public Integer getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getTransactionId() {
        return this.transactionId;
    }
    
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return this.transactionType;
    }
    
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getBalanceBefore() {
        return this.balanceBefore;
    }
    
    public void setBalanceBefore(Double balanceBefore) {
        this.balanceBefore = balanceBefore;
    }

    public Double getBalanceAfter() {
        return this.balanceAfter;
    }
    
    public void setBalanceAfter(Double balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    public Integer getRelatedAccountId() {
        return this.relatedAccountId;
    }
    
    public void setRelatedAccountId(Integer relatedAccountId) {
        this.relatedAccountId = relatedAccountId;
    }

    public Integer getPointsChange() {
        return this.pointsChange;
    }
    
    public void setPointsChange(Integer pointsChange) {
        this.pointsChange = pointsChange;
    }

    public Integer getPointsBefore() {
        return this.pointsBefore;
    }
    
    public void setPointsBefore(Integer pointsBefore) {
        this.pointsBefore = pointsBefore;
    }

    public Integer getPointsAfter() {
        return this.pointsAfter;
    }
    
    public void setPointsAfter(Integer pointsAfter) {
        this.pointsAfter = pointsAfter;
    }

    public String getSourceType() {
        return this.sourceType;
    }
    
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getSourceId() {
        return this.sourceId;
    }
    
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getExpiredAt() {
        return this.expiredAt;
    }
    
    public void setExpiredAt(String expiredAt) {
        this.expiredAt = expiredAt;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
