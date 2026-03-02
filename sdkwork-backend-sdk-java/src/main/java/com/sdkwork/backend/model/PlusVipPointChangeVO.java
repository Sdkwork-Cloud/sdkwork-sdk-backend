package com.sdkwork.backend.model;

public class PlusVipPointChangeVO {
    private String createdAt;
    private String updatedAt;
    private Integer userId;
    private String changeType;
    private Integer changeAmount;
    private Integer beforeBalance;
    private Integer afterBalance;
    private Integer sourceId;
    private String sourceType;
    private String remark;

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

    public String getChangeType() {
        return this.changeType;
    }
    
    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public Integer getChangeAmount() {
        return this.changeAmount;
    }
    
    public void setChangeAmount(Integer changeAmount) {
        this.changeAmount = changeAmount;
    }

    public Integer getBeforeBalance() {
        return this.beforeBalance;
    }
    
    public void setBeforeBalance(Integer beforeBalance) {
        this.beforeBalance = beforeBalance;
    }

    public Integer getAfterBalance() {
        return this.afterBalance;
    }
    
    public void setAfterBalance(Integer afterBalance) {
        this.afterBalance = afterBalance;
    }

    public Integer getSourceId() {
        return this.sourceId;
    }
    
    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceType() {
        return this.sourceType;
    }
    
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
