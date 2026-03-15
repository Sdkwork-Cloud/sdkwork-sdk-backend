package com.sdkwork.backend.model;

public class PlusOrderForm {
    private String orderType;
    private Integer userId;
    private String subject;
    private String orderSn;
    private String transactionId;
    private String outTradeNo;
    private Double totalAmount;
    private Double paidAmount;
    private Integer paidPointsAmount;
    private String status;
    private String payTime;
    private String expireTime;
    private String contentType;
    private Integer contentId;
    private String taskCode;
    private String dispatchMode;
    private String dispatchStatus;
    private Integer workerUserId;
    private Integer dispatcherUserId;
    private String acceptedTime;
    private String serviceStartTime;
    private String dispatchExpireTime;
    private Map<String, Object> taskPayload;

    public String getOrderType() {
        return this.orderType;
    }
    
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSubject() {
        return this.subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getOrderSn() {
        return this.orderSn;
    }
    
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getTransactionId() {
        return this.transactionId;
    }
    
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOutTradeNo() {
        return this.outTradeNo;
    }
    
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public Double getTotalAmount() {
        return this.totalAmount;
    }
    
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getPaidAmount() {
        return this.paidAmount;
    }
    
    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Integer getPaidPointsAmount() {
        return this.paidPointsAmount;
    }
    
    public void setPaidPointsAmount(Integer paidPointsAmount) {
        this.paidPointsAmount = paidPointsAmount;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getPayTime() {
        return this.payTime;
    }
    
    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getExpireTime() {
        return this.expireTime;
    }
    
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getContentType() {
        return this.contentType;
    }
    
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Integer getContentId() {
        return this.contentId;
    }
    
    public void setContentId(Integer contentId) {
        this.contentId = contentId;
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

    public Integer getDispatcherUserId() {
        return this.dispatcherUserId;
    }
    
    public void setDispatcherUserId(Integer dispatcherUserId) {
        this.dispatcherUserId = dispatcherUserId;
    }

    public String getAcceptedTime() {
        return this.acceptedTime;
    }
    
    public void setAcceptedTime(String acceptedTime) {
        this.acceptedTime = acceptedTime;
    }

    public String getServiceStartTime() {
        return this.serviceStartTime;
    }
    
    public void setServiceStartTime(String serviceStartTime) {
        this.serviceStartTime = serviceStartTime;
    }

    public String getDispatchExpireTime() {
        return this.dispatchExpireTime;
    }
    
    public void setDispatchExpireTime(String dispatchExpireTime) {
        this.dispatchExpireTime = dispatchExpireTime;
    }

    public Map<String, Object> getTaskPayload() {
        return this.taskPayload;
    }
    
    public void setTaskPayload(Map<String, Object> taskPayload) {
        this.taskPayload = taskPayload;
    }
}
