package com.sdkwork.backend.model;

public class PlusNotesMediaPublishStatusForm {
    private Integer userId;
    private String platform;
    private String product;
    private String publishId;

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPlatform() {
        return this.platform;
    }
    
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getProduct() {
        return this.product;
    }
    
    public void setProduct(String product) {
        this.product = product;
    }

    public String getPublishId() {
        return this.publishId;
    }
    
    public void setPublishId(String publishId) {
        this.publishId = publishId;
    }
}
