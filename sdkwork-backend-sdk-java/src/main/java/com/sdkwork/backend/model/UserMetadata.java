package com.sdkwork.backend.model;

public class UserMetadata {
    private Integer spMchId;
    private Integer partnerId;
    private Integer agentId;
    private Integer shopId;
    private Integer fromUserId;

    public Integer getSpMchId() {
        return this.spMchId;
    }
    
    public void setSpMchId(Integer spMchId) {
        this.spMchId = spMchId;
    }

    public Integer getPartnerId() {
        return this.partnerId;
    }
    
    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    public Integer getAgentId() {
        return this.agentId;
    }
    
    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getShopId() {
        return this.shopId;
    }
    
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getFromUserId() {
        return this.fromUserId;
    }
    
    public void setFromUserId(Integer fromUserId) {
        this.fromUserId = fromUserId;
    }
}
