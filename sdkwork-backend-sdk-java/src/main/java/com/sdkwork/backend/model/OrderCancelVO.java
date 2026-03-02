package com.sdkwork.backend.model;

public class OrderCancelVO {
    private String createdAt;
    private String updatedAt;
    private Boolean success;
    private String message;
    private String operationTime;
    private Integer orderId;
    private String cancelReason;
    private Boolean refundable;
    private String refundAmount;
    private String cancelTime;

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

    public String getCancelReason() {
        return this.cancelReason;
    }
    
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public Boolean getRefundable() {
        return this.refundable;
    }
    
    public void setRefundable(Boolean refundable) {
        this.refundable = refundable;
    }

    public String getRefundAmount() {
        return this.refundAmount;
    }
    
    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getCancelTime() {
        return this.cancelTime;
    }
    
    public void setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime;
    }
}
