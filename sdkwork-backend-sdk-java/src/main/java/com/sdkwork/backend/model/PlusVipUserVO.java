package com.sdkwork.backend.model;

public class PlusVipUserVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private Integer userId;
    private Integer vipLevelId;
    private String status;
    private Integer pointBalance;
    private Integer totalRechargedPoints;
    private String validFrom;
    private String validTo;
    private String lastActiveTime;
    private String remark;
    private PlusVipLevelVO vipLevel;

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

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPointBalance() {
        return this.pointBalance;
    }
    
    public void setPointBalance(Integer pointBalance) {
        this.pointBalance = pointBalance;
    }

    public Integer getTotalRechargedPoints() {
        return this.totalRechargedPoints;
    }
    
    public void setTotalRechargedPoints(Integer totalRechargedPoints) {
        this.totalRechargedPoints = totalRechargedPoints;
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

    public String getLastActiveTime() {
        return this.lastActiveTime;
    }
    
    public void setLastActiveTime(String lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public PlusVipLevelVO getVipLevel() {
        return this.vipLevel;
    }
    
    public void setVipLevel(PlusVipLevelVO vipLevel) {
        this.vipLevel = vipLevel;
    }
}
