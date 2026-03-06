package com.sdkwork.backend.model;

public class PlusUserCouponForm {
    private Integer userId;
    private Integer couponId;
    private String couponCode;
    private String acquireAt;
    private String acquireRequestNo;
    private String acquireType;
    private Integer pointCost;
    private Boolean pointsRefunded;
    private String pointsRefundAt;
    private String useAt;
    private String status;

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

    public String getAcquireAt() {
        return this.acquireAt;
    }
    
    public void setAcquireAt(String acquireAt) {
        this.acquireAt = acquireAt;
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

    public String getUseAt() {
        return this.useAt;
    }
    
    public void setUseAt(String useAt) {
        this.useAt = useAt;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
