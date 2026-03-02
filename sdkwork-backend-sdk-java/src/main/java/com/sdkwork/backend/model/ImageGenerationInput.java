package com.sdkwork.backend.model;

public class ImageGenerationInput {
    private String title;
    private String prompt;
    private String negativePrompt;
    private List<AssetMediaResource> referenceAssets;
    private VideoStoryboard storyboard;
    private Map<String, Object> parameters;
    private Integer n;
    private Integer seed;
    private String format;
    private Integer width;
    private Integer height;
    private String size;
    private String quality;
    private String style;
    private Double cfgScale;
    private Integer steps;
    private String sampler;
    private Double strength;
    private Boolean safetyChecker;
    private String aspectRatio;
    private Integer referenceAssetCount;

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrompt() {
        return this.prompt;
    }
    
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getNegativePrompt() {
        return this.negativePrompt;
    }
    
    public void setNegativePrompt(String negativePrompt) {
        this.negativePrompt = negativePrompt;
    }

    public List<AssetMediaResource> getReferenceAssets() {
        return this.referenceAssets;
    }
    
    public void setReferenceAssets(List<AssetMediaResource> referenceAssets) {
        this.referenceAssets = referenceAssets;
    }

    public VideoStoryboard getStoryboard() {
        return this.storyboard;
    }
    
    public void setStoryboard(VideoStoryboard storyboard) {
        this.storyboard = storyboard;
    }

    public Map<String, Object> getParameters() {
        return this.parameters;
    }
    
    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public Integer getN() {
        return this.n;
    }
    
    public void setN(Integer n) {
        this.n = n;
    }

    public Integer getSeed() {
        return this.seed;
    }
    
    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getWidth() {
        return this.width;
    }
    
    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return this.height;
    }
    
    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getSize() {
        return this.size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }

    public String getQuality() {
        return this.quality;
    }
    
    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getStyle() {
        return this.style;
    }
    
    public void setStyle(String style) {
        this.style = style;
    }

    public Double getCfgScale() {
        return this.cfgScale;
    }
    
    public void setCfgScale(Double cfgScale) {
        this.cfgScale = cfgScale;
    }

    public Integer getSteps() {
        return this.steps;
    }
    
    public void setSteps(Integer steps) {
        this.steps = steps;
    }

    public String getSampler() {
        return this.sampler;
    }
    
    public void setSampler(String sampler) {
        this.sampler = sampler;
    }

    public Double getStrength() {
        return this.strength;
    }
    
    public void setStrength(Double strength) {
        this.strength = strength;
    }

    public Boolean getSafetyChecker() {
        return this.safetyChecker;
    }
    
    public void setSafetyChecker(Boolean safetyChecker) {
        this.safetyChecker = safetyChecker;
    }

    public String getAspectRatio() {
        return this.aspectRatio;
    }
    
    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public Integer getReferenceAssetCount() {
        return this.referenceAssetCount;
    }
    
    public void setReferenceAssetCount(Integer referenceAssetCount) {
        this.referenceAssetCount = referenceAssetCount;
    }
}
