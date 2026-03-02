package com.sdkwork.backend.model;

public class PlusVipPackForm {
    private String name;
    private String description;
    private Integer groupId;
    private Integer vipLevelId;
    private Double price;
    private Integer pointAmount;
    private Integer vipDurationDays;
    private String status;
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

    public Integer getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getVipLevelId() {
        return this.vipLevelId;
    }
    
    public void setVipLevelId(Integer vipLevelId) {
        this.vipLevelId = vipLevelId;
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

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
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
