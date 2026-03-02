package com.sdkwork.backend.model;

public class PlusRefundForm {
    private Integer orderId;
    private Integer paymentId;
    private String outRefundNo;
    private String outTradeNo;
    private String refundId;
    private Double amount;
    private String type;
    private String status;
    private String applyTime;
    private String completeTime;
    private String remark;
    private String contentType;
    private Integer contentId;

    public Integer getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getPaymentId() {
        return this.paymentId;
    }
    
    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getOutRefundNo() {
        return this.outRefundNo;
    }
    
    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo;
    }

    public String getOutTradeNo() {
        return this.outTradeNo;
    }
    
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getRefundId() {
        return this.refundId;
    }
    
    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getApplyTime() {
        return this.applyTime;
    }
    
    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getCompleteTime() {
        return this.completeTime;
    }
    
    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
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
}
