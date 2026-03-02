package com.sdkwork.backend.model;

public class OrderCloseVO {
    private String createdAt;
    private String updatedAt;
    private Boolean success;
    private String message;
    private String operationTime;
    private Integer orderId;
    private String closeReason;
    private String closeTime;
    private Boolean reopenable;

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

    public Boolean getSuccess() {
        return this.success;
    }
    
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    public String getOperationTime() {
        return this.operationTime;
    }
    
    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime;
    }

    public Integer getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getCloseReason() {
        return this.closeReason;
    }
    
    public void setCloseReason(String closeReason) {
        this.closeReason = closeReason;
    }

    public String getCloseTime() {
        return this.closeTime;
    }
    
    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public Boolean getReopenable() {
        return this.reopenable;
    }
    
    public void setReopenable(Boolean reopenable) {
        this.reopenable = reopenable;
    }
}
