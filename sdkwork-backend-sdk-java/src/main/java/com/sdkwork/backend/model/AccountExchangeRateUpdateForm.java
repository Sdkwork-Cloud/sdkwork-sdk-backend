package com.sdkwork.backend.model;

public class AccountExchangeRateUpdateForm {
    private Double pointsToCashRate;
    private String remarks;

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
