package com.sdkwork.backend.model;

public class PaypalObject {
    private String token;
    private String payerId;
    private String paymentUrl;
    private String invoice;
    private String amount;
    private String currency;
    private String paymentStatus;
    private String transactionId;
    private String returnUrl;
    private String cancelUrl;

    public String getToken() {
        return this.token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }

    public String getPayerId() {
        return this.payerId;
    }
    
    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    public String getPaymentUrl() {
        return this.paymentUrl;
    }
    
    public void setPaymentUrl(String paymentUrl) {
        this.paymentUrl = paymentUrl;
    }

    public String getInvoice() {
        return this.invoice;
    }
    
    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getAmount() {
        return this.amount;
    }
    
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return this.currency;
    }
    
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPaymentStatus() {
        return this.paymentStatus;
    }
    
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getTransactionId() {
        return this.transactionId;
    }
    
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getReturnUrl() {
        return this.returnUrl;
    }
    
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getCancelUrl() {
        return this.cancelUrl;
    }
    
    public void setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
    }
}
