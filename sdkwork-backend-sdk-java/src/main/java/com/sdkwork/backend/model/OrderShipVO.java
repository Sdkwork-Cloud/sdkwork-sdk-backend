package com.sdkwork.backend.model;

public class OrderShipVO {
    private String createdAt;
    private String updatedAt;
    private Boolean success;
    private String message;
    private String operationTime;
    private Integer orderId;
    private String shippingCompany;
    private String trackingNumber;
    private String shipTime;
    private String estimatedArrivalTime;

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

    public String getShippingCompany() {
        return this.shippingCompany;
    }
    
    public void setShippingCompany(String shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public String getTrackingNumber() {
        return this.trackingNumber;
    }
    
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getShipTime() {
        return this.shipTime;
    }
    
    public void setShipTime(String shipTime) {
        this.shipTime = shipTime;
    }

    public String getEstimatedArrivalTime() {
        return this.estimatedArrivalTime;
    }
    
    public void setEstimatedArrivalTime(String estimatedArrivalTime) {
        this.estimatedArrivalTime = estimatedArrivalTime;
    }
}
