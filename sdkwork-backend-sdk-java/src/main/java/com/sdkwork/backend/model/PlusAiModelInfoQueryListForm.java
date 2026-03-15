package com.sdkwork.backend.model;

public class PlusAiModelInfoQueryListForm {
    private Integer id;
    private String createdAtFrom;
    private String createdAtTo;
    private String keyword;
    private String channel;
    private String modelType;
    private String status;
    private String family;
    private String vendor;
    private Boolean openSource;
    private String pricingType;
    private String lifecycleStage;
    private Integer minContextTokens;
    private Boolean supportReasoning;
    private Boolean supportMultimodal;
    private Boolean supportFunctionCall;
    private Boolean supportRealtime;
    private Boolean supportFineTuning;

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

    public String getKeyword() {
        return this.keyword;
    }
    
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getModelType() {
        return this.modelType;
    }
    
    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getFamily() {
        return this.family;
    }
    
    public void setFamily(String family) {
        this.family = family;
    }

    public String getVendor() {
        return this.vendor;
    }
    
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Boolean getOpenSource() {
        return this.openSource;
    }
    
    public void setOpenSource(Boolean openSource) {
        this.openSource = openSource;
    }

    public String getPricingType() {
        return this.pricingType;
    }
    
    public void setPricingType(String pricingType) {
        this.pricingType = pricingType;
    }

    public String getLifecycleStage() {
        return this.lifecycleStage;
    }
    
    public void setLifecycleStage(String lifecycleStage) {
        this.lifecycleStage = lifecycleStage;
    }

    public Integer getMinContextTokens() {
        return this.minContextTokens;
    }
    
    public void setMinContextTokens(Integer minContextTokens) {
        this.minContextTokens = minContextTokens;
    }

    public Boolean getSupportReasoning() {
        return this.supportReasoning;
    }
    
    public void setSupportReasoning(Boolean supportReasoning) {
        this.supportReasoning = supportReasoning;
    }

    public Boolean getSupportMultimodal() {
        return this.supportMultimodal;
    }
    
    public void setSupportMultimodal(Boolean supportMultimodal) {
        this.supportMultimodal = supportMultimodal;
    }

    public Boolean getSupportFunctionCall() {
        return this.supportFunctionCall;
    }
    
    public void setSupportFunctionCall(Boolean supportFunctionCall) {
        this.supportFunctionCall = supportFunctionCall;
    }

    public Boolean getSupportRealtime() {
        return this.supportRealtime;
    }
    
    public void setSupportRealtime(Boolean supportRealtime) {
        this.supportRealtime = supportRealtime;
    }

    public Boolean getSupportFineTuning() {
        return this.supportFineTuning;
    }
    
    public void setSupportFineTuning(Boolean supportFineTuning) {
        this.supportFineTuning = supportFineTuning;
    }
}
