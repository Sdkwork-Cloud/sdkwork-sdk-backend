package com.sdkwork.backend.model;

public class AccountExchangeRateVO {
    private String createdAt;
    private String updatedAt;
    private String configKey;
    private Double pointsToCashRate;
    private String remarks;

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

    public String getConfigKey() {
        return this.configKey;
    }
    
    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    public Double getPointsToCashRate() {
        return this.pointsToCashRate;
    }
    
    public void setPointsToCashRate(Double pointsToCashRate) {
        this.pointsToCashRate = pointsToCashRate;
    }

    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
