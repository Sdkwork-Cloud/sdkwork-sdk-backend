package com.sdkwork.backend.model;

public class WechatPayObject {
    private String prepayId;
    private String mwebUrl;
    private String codeUrl;
    private String timeStamp;
    private String nonceStr;
    private String signType;
    private String paySign;
    private String outTradeNo;
    private String tradeType;

    public String getPrepayId() {
        return this.prepayId;
    }
    
    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getMwebUrl() {
        return this.mwebUrl;
    }
    
    public void setMwebUrl(String mwebUrl) {
        this.mwebUrl = mwebUrl;
    }

    public String getCodeUrl() {
        return this.codeUrl;
    }
    
    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    public String getTimeStamp() {
        return this.timeStamp;
    }
    
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getNonceStr() {
        return this.nonceStr;
    }
    
    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getSignType() {
        return this.signType;
    }
    
    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getPaySign() {
        return this.paySign;
    }
    
    public void setPaySign(String paySign) {
        this.paySign = paySign;
    }

    public String getOutTradeNo() {
        return this.outTradeNo;
    }
    
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getTradeType() {
        return this.tradeType;
    }
    
    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }
}
