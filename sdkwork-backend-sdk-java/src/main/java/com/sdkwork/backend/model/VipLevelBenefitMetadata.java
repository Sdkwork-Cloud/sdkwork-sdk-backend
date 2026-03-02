package com.sdkwork.backend.model;

public class VipLevelBenefitMetadata {
    private Integer maxUsageCount;
    private Integer maxDailyUsage;
    private Integer maxMonthlyUsage;
    private Boolean isUnlimited;
    private String validPeriod;
    private String extendInfo;

    public Integer getMaxUsageCount() {
        return this.maxUsageCount;
    }
    
    public void setMaxUsageCount(Integer maxUsageCount) {
        this.maxUsageCount = maxUsageCount;
    }

    public Integer getMaxDailyUsage() {
        return this.maxDailyUsage;
    }
    
    public void setMaxDailyUsage(Integer maxDailyUsage) {
        this.maxDailyUsage = maxDailyUsage;
    }

    public Integer getMaxMonthlyUsage() {
        return this.maxMonthlyUsage;
    }
    
    public void setMaxMonthlyUsage(Integer maxMonthlyUsage) {
        this.maxMonthlyUsage = maxMonthlyUsage;
    }

    public Boolean getIsUnlimited() {
        return this.isUnlimited;
    }
    
    public void setIsUnlimited(Boolean isUnlimited) {
        this.isUnlimited = isUnlimited;
    }

    public String getValidPeriod() {
        return this.validPeriod;
    }
    
    public void setValidPeriod(String validPeriod) {
        this.validPeriod = validPeriod;
    }

    public String getExtendInfo() {
        return this.extendInfo;
    }
    
    public void setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
    }
}
