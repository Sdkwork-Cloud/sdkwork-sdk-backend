package com.sdkwork.backend.model;

public class PlusCouponTemplateVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String name;
    private String templateCode;
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
    private String validityType;
    private Integer validityDays;
    private Boolean canShare;
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

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getTemplateCode() {
        return this.templateCode;
    }
    
    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
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

    public String getValidityType() {
        return this.validityType;
    }
    
    public void setValidityType(String validityType) {
        this.validityType = validityType;
    }

    public Integer getValidityDays() {
        return this.validityDays;
    }
    
    public void setValidityDays(Integer validityDays) {
        this.validityDays = validityDays;
    }

    public Boolean getCanShare() {
        return this.canShare;
    }
    
    public void setCanShare(Boolean canShare) {
        this.canShare = canShare;
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
