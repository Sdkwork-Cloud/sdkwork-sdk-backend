package com.sdkwork.backend.model;

public class PlusCouponVO {
    private String createdAt;
    private String updatedAt;
    private String name;
    private String redeemCode;
    private Integer pointCost;
    private String type;
    private String description;
    private Integer amount;
    private Double discount;
    private Integer minConsume;
    private String startTime;
    private String endTime;
    private Integer total;
    private Integer getLimit;
    private String status;
    private String scopeType;
    private String scopeValue;

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

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getRedeemCode() {
        return this.redeemCode;
    }
    
    public void setRedeemCode(String redeemCode) {
        this.redeemCode = redeemCode;
    }

    public Integer getPointCost() {
        return this.pointCost;
    }
    
    public void setPointCost(Integer pointCost) {
        this.pointCost = pointCost;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAmount() {
        return this.amount;
    }
    
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getDiscount() {
        return this.discount;
    }
    
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getMinConsume() {
        return this.minConsume;
    }
    
    public void setMinConsume(Integer minConsume) {
        this.minConsume = minConsume;
    }

    public String getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getTotal() {
        return this.total;
    }
    
    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getGetLimit() {
        return this.getLimit;
    }
    
    public void setGetLimit(Integer getLimit) {
        this.getLimit = getLimit;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getScopeType() {
        return this.scopeType;
    }
    
    public void setScopeType(String scopeType) {
        this.scopeType = scopeType;
    }

    public String getScopeValue() {
        return this.scopeValue;
    }
    
    public void setScopeValue(String scopeValue) {
        this.scopeValue = scopeValue;
    }
}
