package com.sdkwork.backend.model;

public class PlusUserCouponVO {
    private String createdAt;
    private String updatedAt;
    private Integer userId;
    private Integer couponId;
    private String couponCode;
    private String acquireTime;
    private String acquireRequestNo;
    private String acquireType;
    private Integer pointCost;
    private Boolean pointsRefunded;
    private String pointsRefundAt;
    private String useTime;
    private String status;

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

    public Integer getCouponId() {
        return this.couponId;
    }
    
    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getCouponCode() {
        return this.couponCode;
    }
    
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getAcquireTime() {
        return this.acquireTime;
    }
    
    public void setAcquireTime(String acquireTime) {
        this.acquireTime = acquireTime;
    }

    public String getAcquireRequestNo() {
        return this.acquireRequestNo;
    }
    
    public void setAcquireRequestNo(String acquireRequestNo) {
        this.acquireRequestNo = acquireRequestNo;
    }

    public String getAcquireType() {
        return this.acquireType;
    }
    
    public void setAcquireType(String acquireType) {
        this.acquireType = acquireType;
    }

    public Integer getPointCost() {
        return this.pointCost;
    }
    
    public void setPointCost(Integer pointCost) {
        this.pointCost = pointCost;
    }

    public Boolean getPointsRefunded() {
        return this.pointsRefunded;
    }
    
    public void setPointsRefunded(Boolean pointsRefunded) {
        this.pointsRefunded = pointsRefunded;
    }

    public String getPointsRefundAt() {
        return this.pointsRefundAt;
    }
    
    public void setPointsRefundAt(String pointsRefundAt) {
        this.pointsRefundAt = pointsRefundAt;
    }

    public String getUseTime() {
        return this.useTime;
    }
    
    public void setUseTime(String useTime) {
        this.useTime = useTime;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
