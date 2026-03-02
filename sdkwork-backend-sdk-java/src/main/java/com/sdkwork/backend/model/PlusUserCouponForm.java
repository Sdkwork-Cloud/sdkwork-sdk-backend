package com.sdkwork.backend.model;

public class PlusUserCouponForm {
    private Integer userId;
    private Integer couponId;
    private String couponCode;
    private String acquireAt;
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
