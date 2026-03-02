package com.sdkwork.backend.model;

public class PlusCardTemplateForm {
    private String name;
    private String templateCode;
    private String cardType;
    private String codeType;
    private String title;
    private String description;
    private String brandName;
    private String logoUrl;
    private String notice;
    private String color;
    private Integer quantity;
    private Integer getLimit;
    private Boolean canShare;
    private Boolean canGiveFriend;
    private Double minimumBalance;
    private Double initialBalance;
    private Double discountRate;
    private String validityType;
    private String startTime;
    private String endTime;
    private Integer validityDays;
    private Boolean isDeleted;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getTemplateCode() {
        return this.templateCode;
    }
    
    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
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

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
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

    public Double getMinimumBalance() {
        return this.minimumBalance;
    }
    
    public void setMinimumBalance(Double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public Double getInitialBalance() {
        return this.initialBalance;
    }
    
    public void setInitialBalance(Double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public Double getDiscountRate() {
        return this.discountRate;
    }
    
    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }

    public String getValidityType() {
        return this.validityType;
    }
    
    public void setValidityType(String validityType) {
        this.validityType = validityType;
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

    public Integer getValidityDays() {
        return this.validityDays;
    }
    
    public void setValidityDays(Integer validityDays) {
        this.validityDays = validityDays;
    }

    public Boolean getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}
