package com.sdkwork.backend.model;

public class OrderConfirmVO {
    private String createdAt;
    private String updatedAt;
    private Boolean success;
    private String message;
    private String operationTime;
    private Integer orderId;
    private String confirmTime;
    private String estimatedShipTime;

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

    public String getConfirmTime() {
        return this.confirmTime;
    }
    
    public void setConfirmTime(String confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getEstimatedShipTime() {
        return this.estimatedShipTime;
    }
    
    public void setEstimatedShipTime(String estimatedShipTime) {
        this.estimatedShipTime = estimatedShipTime;
    }
}
