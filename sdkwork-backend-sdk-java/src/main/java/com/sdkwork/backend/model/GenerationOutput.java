package com.sdkwork.backend.model;

public class GenerationOutput {
    private List<AssetMediaResource> resources;
    private String primaryUrl;
    private List<String> urls;
    private Integer durationMs;
    private Integer tokenUsage;
    private Double cost;
    private String modelVersion;
    private Integer seed;
    private Map<String, Object> metadata;
    private String createdAt;
    private Integer resourceCount;
    private AssetMediaResource primaryResource;

    public List<AssetMediaResource> getResources() {
        return this.resources;
    }
    
    public void setResources(List<AssetMediaResource> resources) {
        this.resources = resources;
    }

    public String getPrimaryUrl() {
        return this.primaryUrl;
    }
    
    public void setPrimaryUrl(String primaryUrl) {
        this.primaryUrl = primaryUrl;
    }

    public List<String> getUrls() {
        return this.urls;
    }
    
    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public Integer getDurationMs() {
        return this.durationMs;
    }
    
    public void setDurationMs(Integer durationMs) {
        this.durationMs = durationMs;
    }

    public Integer getTokenUsage() {
        return this.tokenUsage;
    }
    
    public void setTokenUsage(Integer tokenUsage) {
        this.tokenUsage = tokenUsage;
    }

    public Double getCost() {
        return this.cost;
    }
    
    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getModelVersion() {
        return this.modelVersion;
    }
    
    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    public Integer getSeed() {
        return this.seed;
    }
    
    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    public Map<String, Object> getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getResourceCount() {
        return this.resourceCount;
    }
    
    public void setResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
    }

    public AssetMediaResource getPrimaryResource() {
        return this.primaryResource;
    }
    
    public void setPrimaryResource(AssetMediaResource primaryResource) {
        this.primaryResource = primaryResource;
    }
}
