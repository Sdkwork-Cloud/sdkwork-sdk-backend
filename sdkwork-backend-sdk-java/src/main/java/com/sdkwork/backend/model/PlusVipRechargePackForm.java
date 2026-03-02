package com.sdkwork.backend.model;

public class PlusVipRechargePackForm {
    private String name;
    private String description;
    private Double price;
    private Integer pointAmount;
    private Integer vipDurationDays;
    private Integer status;
    private Integer sortWeight;
    private String validFrom;
    private String validTo;
    private String remark;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPointAmount() {
        return this.pointAmount;
    }
    
    public void setPointAmount(Integer pointAmount) {
        this.pointAmount = pointAmount;
    }

    public Integer getVipDurationDays() {
        return this.vipDurationDays;
    }
    
    public void setVipDurationDays(Integer vipDurationDays) {
        this.vipDurationDays = vipDurationDays;
    }

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSortWeight() {
        return this.sortWeight;
    }
    
    public void setSortWeight(Integer sortWeight) {
        this.sortWeight = sortWeight;
    }

    public String getValidFrom() {
        return this.validFrom;
    }
    
    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTo() {
        return this.validTo;
    }
    
    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
