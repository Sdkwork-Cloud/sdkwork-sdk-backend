package com.sdkwork.backend.model;

public class PlusAiModelInfoVO {
    private String createdAt;
    private String updatedAt;
    private String objectId;
    private String model;
    private String modelId;
    private String modelKey;
    private String vendorModel;
    private String name;
    private String description;
    private String channel;
    private String vendor;
    private String modelVersion;
    private String family;
    private String apiEndpoint;
    private String modelType;
    private String pricingType;
    private String lifecycleStage;
    private String releaseDate;
    private String deprecatedAt;
    private Integer contextTokens;
    private Integer maxInputTokens;
    private Integer maxOutputTokens;
    private Boolean supportReasoning;
    private Boolean supportMultimodal;
    private Boolean supportFunctionCall;
    private Boolean supportStructuredOutput;
    private Boolean supportRealtime;
    private Boolean supportFineTuning;
    private Integer popularityScore;
    private String ownedBy;
    private SceneContent scenes;
    private ModelLimitInfo tokenLimit;
    private ModelFunctionInfo functionInfo;
    private ModelPrice priceInfo;
    private ModelMetadata metadata;
    private Map<String, Object> productSupportInfo;
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

    public String getModelId() {
        return this.modelId;
    }
    
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getModelKey() {
        return this.modelKey;
    }
    
    public void setModelKey(String modelKey) {
        this.modelKey = modelKey;
    }

    public String getVendorModel() {
        return this.vendorModel;
    }
    
    public void setVendorModel(String vendorModel) {
        this.vendorModel = vendorModel;
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

    public String getVendor() {
        return this.vendor;
    }
    
    public void setVendor(String vendor) {
        this.vendor = vendor;
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

    public String getReleaseDate() {
        return this.releaseDate;
    }
    
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDeprecatedAt() {
        return this.deprecatedAt;
    }
    
    public void setDeprecatedAt(String deprecatedAt) {
        this.deprecatedAt = deprecatedAt;
    }

    public Integer getContextTokens() {
        return this.contextTokens;
    }
    
    public void setContextTokens(Integer contextTokens) {
        this.contextTokens = contextTokens;
    }

    public Integer getMaxInputTokens() {
        return this.maxInputTokens;
    }
    
    public void setMaxInputTokens(Integer maxInputTokens) {
        this.maxInputTokens = maxInputTokens;
    }

    public Integer getMaxOutputTokens() {
        return this.maxOutputTokens;
    }
    
    public void setMaxOutputTokens(Integer maxOutputTokens) {
        this.maxOutputTokens = maxOutputTokens;
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

    public Boolean getSupportStructuredOutput() {
        return this.supportStructuredOutput;
    }
    
    public void setSupportStructuredOutput(Boolean supportStructuredOutput) {
        this.supportStructuredOutput = supportStructuredOutput;
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

    public Integer getPopularityScore() {
        return this.popularityScore;
    }
    
    public void setPopularityScore(Integer popularityScore) {
        this.popularityScore = popularityScore;
    }

    public String getOwnedBy() {
        return this.ownedBy;
    }
    
    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    public SceneContent getScenes() {
        return this.scenes;
    }
    
    public void setScenes(SceneContent scenes) {
        this.scenes = scenes;
    }

    public ModelLimitInfo getTokenLimit() {
        return this.tokenLimit;
    }
    
    public void setTokenLimit(ModelLimitInfo tokenLimit) {
        this.tokenLimit = tokenLimit;
    }

    public ModelFunctionInfo getFunctionInfo() {
        return this.functionInfo;
    }
    
    public void setFunctionInfo(ModelFunctionInfo functionInfo) {
        this.functionInfo = functionInfo;
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

    public Map<String, Object> getProductSupportInfo() {
        return this.productSupportInfo;
    }
    
    public void setProductSupportInfo(Map<String, Object> productSupportInfo) {
        this.productSupportInfo = productSupportInfo;
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
