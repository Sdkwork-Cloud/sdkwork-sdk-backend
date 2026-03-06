package com.sdkwork.backend.model;

public class VoiceSpeakerGenerationInput {
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
    private String speakerName;
    private String speakerId;
    private String language;
    private Double speed;
    private Double pitch;
    private Integer volume;
    private String emotion;
    private Boolean saveSpeaker;
    private Boolean voiceClone;
    private Boolean usingExistingSpeaker;
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

    public String getSpeakerName() {
        return this.speakerName;
    }
    
    public void setSpeakerName(String speakerName) {
        this.speakerName = speakerName;
    }

    public String getSpeakerId() {
        return this.speakerId;
    }
    
    public void setSpeakerId(String speakerId) {
        this.speakerId = speakerId;
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

    public String getEmotion() {
        return this.emotion;
    }
    
    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

    public Boolean getSaveSpeaker() {
        return this.saveSpeaker;
    }
    
    public void setSaveSpeaker(Boolean saveSpeaker) {
        this.saveSpeaker = saveSpeaker;
    }

    public Boolean getVoiceClone() {
        return this.voiceClone;
    }
    
    public void setVoiceClone(Boolean voiceClone) {
        this.voiceClone = voiceClone;
    }

    public Boolean getUsingExistingSpeaker() {
        return this.usingExistingSpeaker;
    }
    
    public void setUsingExistingSpeaker(Boolean usingExistingSpeaker) {
        this.usingExistingSpeaker = usingExistingSpeaker;
    }

    public Integer getReferenceAssetCount() {
        return this.referenceAssetCount;
    }
    
    public void setReferenceAssetCount(Integer referenceAssetCount) {
        this.referenceAssetCount = referenceAssetCount;
    }
}
