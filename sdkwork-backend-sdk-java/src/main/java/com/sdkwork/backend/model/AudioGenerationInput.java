package com.sdkwork.backend.model;

public class AudioGenerationInput {
    private String title;
    private String prompt;
    private String negativePrompt;
    private List<AssetMediaResource> referenceAssets;
    private VideoStoryboard storyboard;
    private Map<String, Object> parameters;
    private Integer n;
    private Integer seed;
    private String format;
    private String text;
    private String voice;
    private Integer voiceSpeakerId;
    private String language;
    private Double speed;
    private Double pitch;
    private Integer volume;
    private Integer sampleRate;
    private Integer bitRate;
    private Integer channels;
    private String emotion;
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

    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }

    public String getVoice() {
        return this.voice;
    }
    
    public void setVoice(String voice) {
        this.voice = voice;
    }

    public Integer getVoiceSpeakerId() {
        return this.voiceSpeakerId;
    }
    
    public void setVoiceSpeakerId(Integer voiceSpeakerId) {
        this.voiceSpeakerId = voiceSpeakerId;
    }

    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    public Double getSpeed() {
        return this.speed;
    }
    
    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getPitch() {
        return this.pitch;
    }
    
    public void setPitch(Double pitch) {
        this.pitch = pitch;
    }

    public Integer getVolume() {
        return this.volume;
    }
    
    public void setVolume(Integer volume) {
        this.volume = volume;
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

    public String getEmotion() {
        return this.emotion;
    }
    
    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

    public Integer getReferenceAssetCount() {
        return this.referenceAssetCount;
    }
    
    public void setReferenceAssetCount(Integer referenceAssetCount) {
        this.referenceAssetCount = referenceAssetCount;
    }
}
