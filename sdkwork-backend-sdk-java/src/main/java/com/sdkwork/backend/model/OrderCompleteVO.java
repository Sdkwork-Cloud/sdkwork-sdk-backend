package com.sdkwork.backend.model;

public class OrderCompleteVO {
    private String createdAt;
    private String updatedAt;
    private Boolean success;
    private String message;
    private String operationTime;
    private Integer orderId;
    private String completeTime;
    private Boolean reviewed;
    private Integer pointsEarned;

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

    public String getCompleteTime() {
        return this.completeTime;
    }
    
    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    public Boolean getReviewed() {
        return this.reviewed;
    }
    
    public void setReviewed(Boolean reviewed) {
        this.reviewed = reviewed;
    }

    public Integer getPointsEarned() {
        return this.pointsEarned;
    }
    
    public void setPointsEarned(Integer pointsEarned) {
        this.pointsEarned = pointsEarned;
    }
}
