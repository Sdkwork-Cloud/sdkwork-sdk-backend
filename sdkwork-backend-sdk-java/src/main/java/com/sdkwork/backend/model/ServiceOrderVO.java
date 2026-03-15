package com.sdkwork.backend.model;

public class ServiceOrderVO {
    private String createdAt;
    private String updatedAt;
    private Integer orderId;
    private String orderSn;
    private String taskCode;
    private String dispatchMode;
    private String dispatchStatus;
    private Integer workerUserId;
    private String dispatchExpireTime;
    private Boolean success;
    private String message;

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

    public Integer getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return this.orderSn;
    }
    
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getTaskCode() {
        return this.taskCode;
    }
    
    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    public String getDispatchMode() {
        return this.dispatchMode;
    }
    
    public void setDispatchMode(String dispatchMode) {
        this.dispatchMode = dispatchMode;
    }

    public String getDispatchStatus() {
        return this.dispatchStatus;
    }
    
    public void setDispatchStatus(String dispatchStatus) {
        this.dispatchStatus = dispatchStatus;
    }

    public Integer getWorkerUserId() {
        return this.workerUserId;
    }
    
    public void setWorkerUserId(Integer workerUserId) {
        this.workerUserId = workerUserId;
    }

    public String getDispatchExpireTime() {
        return this.dispatchExpireTime;
    }
    
    public void setDispatchExpireTime(String dispatchExpireTime) {
        this.dispatchExpireTime = dispatchExpireTime;
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
}
