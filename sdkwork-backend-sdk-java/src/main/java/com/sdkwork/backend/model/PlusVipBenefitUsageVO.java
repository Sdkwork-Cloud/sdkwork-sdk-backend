package com.sdkwork.backend.model;

public class PlusVipBenefitUsageVO {
    private String createdAt;
    private String updatedAt;
    private Integer userId;
    private String benefitType;
    private String usageTime;
    private Integer usageCount;
    private Integer status;
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

    public String getBenefitType() {
        return this.benefitType;
    }
    
    public void setBenefitType(String benefitType) {
        this.benefitType = benefitType;
    }

    public String getUsageTime() {
        return this.usageTime;
    }
    
    public void setUsageTime(String usageTime) {
        this.usageTime = usageTime;
    }

    public Integer getUsageCount() {
        return this.usageCount;
    }
    
    public void setUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
    }

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
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
