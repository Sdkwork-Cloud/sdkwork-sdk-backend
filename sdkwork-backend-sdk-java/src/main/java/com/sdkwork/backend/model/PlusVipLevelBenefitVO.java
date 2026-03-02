package com.sdkwork.backend.model;

public class PlusVipLevelBenefitVO {
    private String createdAt;
    private String updatedAt;
    private Integer vipLevelId;
    private Integer benefitId;
    private Integer dailyLimit;
    private Integer monthlyLimit;
    private Integer totalLimit;
    private String status;
    private VipLevelBenefitMetadata metadata;
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

    public Integer getVipLevelId() {
        return this.vipLevelId;
    }
    
    public void setVipLevelId(Integer vipLevelId) {
        this.vipLevelId = vipLevelId;
    }

    public Integer getBenefitId() {
        return this.benefitId;
    }
    
    public void setBenefitId(Integer benefitId) {
        this.benefitId = benefitId;
    }

    public Integer getDailyLimit() {
        return this.dailyLimit;
    }
    
    public void setDailyLimit(Integer dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    public Integer getMonthlyLimit() {
        return this.monthlyLimit;
    }
    
    public void setMonthlyLimit(Integer monthlyLimit) {
        this.monthlyLimit = monthlyLimit;
    }

    public Integer getTotalLimit() {
        return this.totalLimit;
    }
    
    public void setTotalLimit(Integer totalLimit) {
        this.totalLimit = totalLimit;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public VipLevelBenefitMetadata getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(VipLevelBenefitMetadata metadata) {
        this.metadata = metadata;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
