package com.sdkwork.backend.model;

public class PlusAiModelInfoVO {
    private String createdAt;
    private String updatedAt;
    private String objectId;
    private String model;
    private String name;
    private String description;
    private String channel;
    private String modelVersion;
    private String family;
    private String apiEndpoint;
    private String modelType;
    private String ownedBy;
    private ModelLimitInfo tokenLimit;
    private ModelPrice priceInfo;
    private ModelMetadata metadata;
    private String supportedVoices;
    private Double defaultTemperature;
    private Double defaultTopP;
    private Double defaultFrequencyPenalty;
    private Double defaultPresencePenalty;
    private String status;
    private Integer usageCount;
    private Integer totalTokens;
    private Integer avgResponseTime;
    private TagsContent tags;
    private String configParams;

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

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getModelVersion() {
        return this.modelVersion;
    }
    
    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    public String getFamily() {
        return this.family;
    }
    
    public void setFamily(String family) {
        this.family = family;
    }

    public String getApiEndpoint() {
        return this.apiEndpoint;
    }
    
    public void setApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
    }

    public String getModelType() {
        return this.modelType;
    }
    
    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getOwnedBy() {
        return this.ownedBy;
    }
    
    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    public ModelLimitInfo getTokenLimit() {
        return this.tokenLimit;
    }
    
    public void setTokenLimit(ModelLimitInfo tokenLimit) {
        this.tokenLimit = tokenLimit;
    }

    public ModelPrice getPriceInfo() {
        return this.priceInfo;
    }
    
    public void setPriceInfo(ModelPrice priceInfo) {
        this.priceInfo = priceInfo;
    }

    public ModelMetadata getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(ModelMetadata metadata) {
        this.metadata = metadata;
    }

    public String getSupportedVoices() {
        return this.supportedVoices;
    }
    
    public void setSupportedVoices(String supportedVoices) {
        this.supportedVoices = supportedVoices;
    }

    public Double getDefaultTemperature() {
        return this.defaultTemperature;
    }
    
    public void setDefaultTemperature(Double defaultTemperature) {
        this.defaultTemperature = defaultTemperature;
    }

    public Double getDefaultTopP() {
        return this.defaultTopP;
    }
    
    public void setDefaultTopP(Double defaultTopP) {
        this.defaultTopP = defaultTopP;
    }

    public Double getDefaultFrequencyPenalty() {
        return this.defaultFrequencyPenalty;
    }
    
    public void setDefaultFrequencyPenalty(Double defaultFrequencyPenalty) {
        this.defaultFrequencyPenalty = defaultFrequencyPenalty;
    }

    public Double getDefaultPresencePenalty() {
        return this.defaultPresencePenalty;
    }
    
    public void setDefaultPresencePenalty(Double defaultPresencePenalty) {
        this.defaultPresencePenalty = defaultPresencePenalty;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getUsageCount() {
        return this.usageCount;
    }
    
    public void setUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
    }

    public Integer getTotalTokens() {
        return this.totalTokens;
    }
    
    public void setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
    }

    public Integer getAvgResponseTime() {
        return this.avgResponseTime;
    }
    
    public void setAvgResponseTime(Integer avgResponseTime) {
        this.avgResponseTime = avgResponseTime;
    }

    public TagsContent getTags() {
        return this.tags;
    }
    
    public void setTags(TagsContent tags) {
        this.tags = tags;
    }

    public String getConfigParams() {
        return this.configParams;
    }
    
    public void setConfigParams(String configParams) {
        this.configParams = configParams;
    }
}
