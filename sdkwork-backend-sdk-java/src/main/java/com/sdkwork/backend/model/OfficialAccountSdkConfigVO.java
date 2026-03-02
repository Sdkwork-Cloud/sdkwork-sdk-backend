package com.sdkwork.backend.model;

public class OfficialAccountSdkConfigVO {
    private Boolean debug;
    private String appId;
    private String timestamp;
    private String nonceStr;
    private String signature;
    private List<String> jsApiList;

    public Boolean getDebug() {
        return this.debug;
    }
    
    public void setDebug(Boolean debug) {
        this.debug = debug;
    }

    public String getAppId() {
        return this.appId;
    }
    
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getTimestamp() {
        return this.timestamp;
    }
    
    public void setTimestamp(String timestamp) {
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
