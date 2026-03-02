package com.sdkwork.backend.model;

public class PlusOrderVO {
    private String createdAt;
    private String updatedAt;
    private String orderType;
    private Integer userId;
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
    private ClientPayObjects payObjects;

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

    public ClientPayObjects getPayObjects() {
        return this.payObjects;
    }
    
    public void setPayObjects(ClientPayObjects payObjects) {
        this.payObjects = payObjects;
    }
}
