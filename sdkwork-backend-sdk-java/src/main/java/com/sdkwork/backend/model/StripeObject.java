package com.sdkwork.backend.model;

public class StripeObject {
    private String sessionId;
    private String paymentUrl;
    private String clientSecret;
    private String paymentIntentId;
    private String publishableKey;
    private String returnUrl;
    private String amount;
    private String currency;

    public String getSessionId() {
        return this.sessionId;
    }
    
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getPaymentUrl() {
        return this.paymentUrl;
    }
    
    public void setPaymentUrl(String paymentUrl) {
        this.paymentUrl = paymentUrl;
    }

    public String getClientSecret() {
        return this.clientSecret;
    }
    
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getPaymentIntentId() {
        return this.paymentIntentId;
    }
    
    public void setPaymentIntentId(String paymentIntentId) {
        this.paymentIntentId = paymentIntentId;
    }

    public String getPublishableKey() {
        return this.publishableKey;
    }
    
    public void setPublishableKey(String publishableKey) {
        this.publishableKey = publishableKey;
    }

    public String getReturnUrl() {
        return this.returnUrl;
    }
    
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
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
}
