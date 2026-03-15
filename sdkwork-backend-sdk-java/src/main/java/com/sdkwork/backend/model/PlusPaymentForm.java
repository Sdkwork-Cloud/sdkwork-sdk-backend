package com.sdkwork.backend.model;

public class PlusPaymentForm {
    private String purpose;
    private Integer orderId;
    private String transactionId;
    private String outTradeNo;
    private String channel;
    private String provider;
    private String status;
    private Double amount;
    private String successTime;
    private String remark;
    private String contentType;
    private Integer contentId;
    private String productType;

    public String getPurpose() {
        return this.purpose;
    }
    
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Integer getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getProvider() {
        return this.provider;
    }
    
    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getSuccessTime() {
        return this.successTime;
    }
    
    public void setSuccessTime(String successTime) {
        this.successTime = successTime;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getProductType() {
        return this.productType;
    }
    
    public void setProductType(String productType) {
        this.productType = productType;
    }
}
