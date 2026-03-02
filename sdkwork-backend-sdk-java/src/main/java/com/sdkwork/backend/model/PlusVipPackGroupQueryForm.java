package com.sdkwork.backend.model;

public class PlusVipPackGroupQueryForm {
    private Integer id;
    private String createdAtFrom;
    private String createdAtTo;
    private Integer appId;
    private List<Integer> appIdIn;

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreatedAtFrom() {
        return this.createdAtFrom;
    }
    
    public void setCreatedAtFrom(String createdAtFrom) {
        this.createdAtFrom = createdAtFrom;
    }

    public String getCreatedAtTo() {
        return this.createdAtTo;
    }
    
    public void setCreatedAtTo(String createdAtTo) {
        this.createdAtTo = createdAtTo;
    }

    public Integer getAppId() {
        return this.appId;
    }
    
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public List<Integer> getAppIdIn() {
        return this.appIdIn;
    }
    
    public void setAppIdIn(List<Integer> appIdIn) {
        this.appIdIn = appIdIn;
    }
}
