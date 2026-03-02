package com.sdkwork.backend.model;

public class PlusCardVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private Integer cardOrganizationId;
    private String cardType;
    private String codeType;
    private String title;
    private String brandName;
    private String logoUrl;
    private String notice;
    private String description;
    private String color;
    private Integer quantity;
    private Integer getLimit;
    private Boolean canShare;
    private Boolean canGiveFriend;
    private String startTime;
    private String endTime;
    private String status;

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCardOrganizationId() {
        return this.cardOrganizationId;
    }
    
    public void setCardOrganizationId(Integer cardOrganizationId) {
        this.cardOrganizationId = cardOrganizationId;
    }

    public String getCardType() {
        return this.cardType;
    }
    
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCodeType() {
        return this.codeType;
    }
    
    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrandName() {
        return this.brandName;
    }
    
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }
    
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getNotice() {
        return this.notice;
    }
    
    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getGetLimit() {
        return this.getLimit;
    }
    
    public void setGetLimit(Integer getLimit) {
        this.getLimit = getLimit;
    }

    public Boolean getCanShare() {
        return this.canShare;
    }
    
    public void setCanShare(Boolean canShare) {
        this.canShare = canShare;
    }

    public Boolean getCanGiveFriend() {
        return this.canGiveFriend;
    }
    
    public void setCanGiveFriend(Boolean canGiveFriend) {
        this.canGiveFriend = canGiveFriend;
    }

    public String getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
