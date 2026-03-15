package com.sdkwork.backend.model;

public class CreateServiceOrderForm {
    private Integer publisherUserId;
    private String subject;
    private String taskCode;
    private String dispatchMode;
    private Double totalAmount;
    private String dispatchExpireTime;
    private String expireTime;
    private Map<String, Object> taskPayload;
    private String remark;

    public Integer getPublisherUserId() {
        return this.publisherUserId;
    }
    
    public void setPublisherUserId(Integer publisherUserId) {
        this.publisherUserId = publisherUserId;
    }

    public String getSubject() {
        return this.subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
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

    public Double getTotalAmount() {
        return this.totalAmount;
    }
    
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDispatchExpireTime() {
        return this.dispatchExpireTime;
    }
    
    public void setDispatchExpireTime(String dispatchExpireTime) {
        this.dispatchExpireTime = dispatchExpireTime;
    }

    public String getExpireTime() {
        return this.expireTime;
    }
    
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public Map<String, Object> getTaskPayload() {
        return this.taskPayload;
    }
    
    public void setTaskPayload(Map<String, Object> taskPayload) {
        this.taskPayload = taskPayload;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
