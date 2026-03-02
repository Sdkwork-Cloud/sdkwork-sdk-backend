package com.sdkwork.backend.model;

public class AudioEffectGenerationInput {
    private String title;
    private String prompt;
    private String negativePrompt;
    private List<AssetMediaResource> referenceAssets;
    private VideoStoryboard storyboard;
    private Map<String, Object> parameters;
    private Integer n;
    private Integer seed;
    private String format;
    private String description;
    private String category;
    private Integer duration;
    private Integer sampleRate;
    private Integer bitRate;
    private Integer channels;
    private Boolean loop;
    private Double fadeIn;
    private Double fadeOut;
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

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getDuration() {
        return this.duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getSampleRate() {
        return this.sampleRate;
    }
    
    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }

    public Integer getBitRate() {
        return this.bitRate;
    }
    
    public void setBitRate(Integer bitRate) {
        this.bitRate = bitRate;
    }

    public Integer getChannels() {
        return this.channels;
    }
    
    public void setChannels(Integer channels) {
        this.channels = channels;
    }

    public Boolean getLoop() {
        return this.loop;
    }
    
    public void setLoop(Boolean loop) {
        this.loop = loop;
    }

    public Double getFadeIn() {
        return this.fadeIn;
    }
    
    public void setFadeIn(Double fadeIn) {
        this.fadeIn = fadeIn;
    }

    public Double getFadeOut() {
        return this.fadeOut;
    }
    
    public void setFadeOut(Double fadeOut) {
        this.fadeOut = fadeOut;
    }

    public Integer getReferenceAssetCount() {
        return this.referenceAssetCount;
    }
    
    public void setReferenceAssetCount(Integer referenceAssetCount) {
        this.referenceAssetCount = referenceAssetCount;
    }
}
