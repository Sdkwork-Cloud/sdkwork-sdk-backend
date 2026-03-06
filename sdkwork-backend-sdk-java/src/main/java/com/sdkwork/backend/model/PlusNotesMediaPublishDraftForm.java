package com.sdkwork.backend.model;

public class PlusNotesMediaPublishDraftForm {
    private Integer userId;
    private String platform;
    private String product;
    private String draftMediaId;

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

    public String getDraftMediaId() {
        return this.draftMediaId;
    }
    
    public void setDraftMediaId(String draftMediaId) {
        this.draftMediaId = draftMediaId;
    }
}
