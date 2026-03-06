package com.sdkwork.backend.model;

public class CreatePointsOrderForm {
    private List<OrderContentItem> items;
    private Integer pointsAmount;
    private String expireTime;

    public List<OrderContentItem> getItems() {
        return this.items;
    }
    
    public void setItems(List<OrderContentItem> items) {
        this.items = items;
    }

    public Integer getPointsAmount() {
        return this.pointsAmount;
    }
    
    public void setPointsAmount(Integer pointsAmount) {
        this.pointsAmount = pointsAmount;
    }

    public String getExpireTime() {
        return this.expireTime;
    }
    
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }
}
