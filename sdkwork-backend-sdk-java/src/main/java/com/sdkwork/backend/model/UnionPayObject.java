package com.sdkwork.backend.model;

public class UnionPayObject {
    private String payUrl;
    private String tn;
    private String merOrderId;
    private String merId;
    private String mode;
    private String schemeStr;
    private String signature;

    public String getPayUrl() {
        return this.payUrl;
    }
    
    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl;
    }

    public String getTn() {
        return this.tn;
    }
    
    public void setTn(String tn) {
        this.tn = tn;
    }

    public String getMerOrderId() {
        return this.merOrderId;
    }
    
    public void setMerOrderId(String merOrderId) {
        this.merOrderId = merOrderId;
    }

    public String getMerId() {
        return this.merId;
    }
    
    public void setMerId(String merId) {
        this.merId = merId;
    }

    public String getMode() {
        return this.mode;
    }
    
    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getSchemeStr() {
        return this.schemeStr;
    }
    
    public void setSchemeStr(String schemeStr) {
        this.schemeStr = schemeStr;
    }

    public String getSignature() {
        return this.signature;
    }
    
    public void setSignature(String signature) {
        this.signature = signature;
    }
}
