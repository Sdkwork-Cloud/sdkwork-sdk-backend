package com.sdkwork.backend.model;

public class PlusAiModelPriceForm {
    private String objectId;
    private String model;
    private Integer modelId;
    private String channel;
    private String modelKey;
    private String productCode;
    private String featureCode;
    private String billingType;
    private String priceItemType;
    private String tierName;
    private Integer rulePriority;
    private String unit;
    private Double unitSize;
    private Double price;
    private Double inputPrice;
    private Double batchInputPrice;
    private Double cachedInputPrice;
    private Double batchCachedInputPrice;
    private Double outputPrice;
    private Double batchOutputPrice;
    private String currency;
    private Double minUsage;
    private Double maxUsage;
    private String effectiveFrom;
    private String effectiveTo;
    private Boolean defaultRule;
    private String status;
    private Map<String, Object> metadata;

    public String getObjectId() {
        return this.objectId;
    }
    
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public Integer getModelId() {
        return this.modelId;
    }
    
    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getModelKey() {
        return this.modelKey;
    }
    
    public void setModelKey(String modelKey) {
        this.modelKey = modelKey;
    }

    public String getProductCode() {
        return this.productCode;
    }
    
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getFeatureCode() {
        return this.featureCode;
    }
    
    public void setFeatureCode(String featureCode) {
        this.featureCode = featureCode;
    }

    public String getBillingType() {
        return this.billingType;
    }
    
    public void setBillingType(String billingType) {
        this.billingType = billingType;
    }

    public String getPriceItemType() {
        return this.priceItemType;
    }
    
    public void setPriceItemType(String priceItemType) {
        this.priceItemType = priceItemType;
    }

    public String getTierName() {
        return this.tierName;
    }
    
    public void setTierName(String tierName) {
        this.tierName = tierName;
    }

    public Integer getRulePriority() {
        return this.rulePriority;
    }
    
    public void setRulePriority(Integer rulePriority) {
        this.rulePriority = rulePriority;
    }

    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getUnitSize() {
        return this.unitSize;
    }
    
    public void setUnitSize(Double unitSize) {
        this.unitSize = unitSize;
    }

    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getInputPrice() {
        return this.inputPrice;
    }
    
    public void setInputPrice(Double inputPrice) {
        this.inputPrice = inputPrice;
    }

    public Double getBatchInputPrice() {
        return this.batchInputPrice;
    }
    
    public void setBatchInputPrice(Double batchInputPrice) {
        this.batchInputPrice = batchInputPrice;
    }

    public Double getCachedInputPrice() {
        return this.cachedInputPrice;
    }
    
    public void setCachedInputPrice(Double cachedInputPrice) {
        this.cachedInputPrice = cachedInputPrice;
    }

    public Double getBatchCachedInputPrice() {
        return this.batchCachedInputPrice;
    }
    
    public void setBatchCachedInputPrice(Double batchCachedInputPrice) {
        this.batchCachedInputPrice = batchCachedInputPrice;
    }

    public Double getOutputPrice() {
        return this.outputPrice;
    }
    
    public void setOutputPrice(Double outputPrice) {
        this.outputPrice = outputPrice;
    }

    public Double getBatchOutputPrice() {
        return this.batchOutputPrice;
    }
    
    public void setBatchOutputPrice(Double batchOutputPrice) {
        this.batchOutputPrice = batchOutputPrice;
    }

    public String getCurrency() {
        return this.currency;
    }
    
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getMinUsage() {
        return this.minUsage;
    }
    
    public void setMinUsage(Double minUsage) {
        this.minUsage = minUsage;
    }

    public Double getMaxUsage() {
        return this.maxUsage;
    }
    
    public void setMaxUsage(Double maxUsage) {
        this.maxUsage = maxUsage;
    }

    public String getEffectiveFrom() {
        return this.effectiveFrom;
    }
    
    public void setEffectiveFrom(String effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
    }

    public String getEffectiveTo() {
        return this.effectiveTo;
    }
    
    public void setEffectiveTo(String effectiveTo) {
        this.effectiveTo = effectiveTo;
    }

    public Boolean getDefaultRule() {
        return this.defaultRule;
    }
    
    public void setDefaultRule(Boolean defaultRule) {
        this.defaultRule = defaultRule;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, Object> getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }
}
