package com.sdkwork.backend.model;

public class QrCodeConfirmForm {
    private String qrKey;
    private String token;

    public String getQrKey() {
        return this.qrKey;
    }
    
    public void setQrKey(String qrKey) {
        this.qrKey = qrKey;
    }

    public String getToken() {
        return this.token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }
}
