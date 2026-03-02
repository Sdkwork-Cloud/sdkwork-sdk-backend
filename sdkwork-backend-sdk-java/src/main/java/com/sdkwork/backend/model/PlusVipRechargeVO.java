package com.sdkwork.backend.model;

public class PlusVipRechargeVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private Integer userId;
    private Integer vipLevelId;
    private Double amount;
    private Integer pointAmount;
    private String rechargeType;
    private String rechargeTime;
    private String transactionNo;
    private Integer status;
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

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVipLevelId() {
        return this.vipLevelId;
    }
    
    public void setVipLevelId(Integer vipLevelId) {
        this.vipLevelId = vipLevelId;
    }

    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getPointAmount() {
        return this.pointAmount;
    }
    
    public void setPointAmount(Integer pointAmount) {
        this.pointAmount = pointAmount;
    }

    public String getRechargeType() {
        return this.rechargeType;
    }
    
    public void setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType;
    }

    public String getRechargeTime() {
        return this.rechargeTime;
    }
    
    public void setRechargeTime(String rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    public String getTransactionNo() {
        return this.transactionNo;
    }
    
    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
