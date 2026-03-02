package com.sdkwork.backend.model;

public class MiniProgramSdkConfigVO {
    private String appId;
    private Integer timestamp;
    private String nonceStr;
    private String signature;
    private List<String> jsApiList;

    public String getAppId() {
        return this.appId;
    }
    
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Integer getTimestamp() {
        return this.timestamp;
    }
    
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getNonceStr() {
        return this.nonceStr;
    }
    
    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getSignature() {
        return this.signature;
    }
    
    public void setSignature(String signature) {
        this.signature = signature;
    }

    public List<String> getJsApiList() {
        return this.jsApiList;
    }
    
    public void setJsApiList(List<String> jsApiList) {
        this.jsApiList = jsApiList;
    }
}
