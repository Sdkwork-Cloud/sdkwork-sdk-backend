package com.sdkwork.backend.model;

public class ApplePayObject {
    private String paymentData;
    private String merchantId;
    private String transactionId;
    private String displayName;
    private String network;
    private String type;
    private String amount;
    private String currencyCode;

    public String getPaymentData() {
        return this.paymentData;
    }
    
    public void setPaymentData(String paymentData) {
        this.paymentData = paymentData;
    }

    public String getMerchantId() {
        return this.merchantId;
    }
    
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getTransactionId() {
        return this.transactionId;
    }
    
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getDisplayName() {
        return this.displayName;
    }
    
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getNetwork() {
        return this.network;
    }
    
    public void setNetwork(String network) {
        this.network = network;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getAmount() {
        return this.amount;
    }
    
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }
    
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
