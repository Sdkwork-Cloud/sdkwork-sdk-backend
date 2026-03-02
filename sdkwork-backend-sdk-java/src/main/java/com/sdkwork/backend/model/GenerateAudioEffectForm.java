package com.sdkwork.backend.model;

public class GenerateAudioEffectForm {
    private String title;
    private String prompt;
    private String audioType;
    private String effectType;
    private Integer intensity;
    private String effectParams;
    private String model;
    private String channel;

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

    public String getAudioType() {
        return this.audioType;
    }
    
    public void setAudioType(String audioType) {
        this.audioType = audioType;
    }

    public String getEffectType() {
        return this.effectType;
    }
    
    public void setEffectType(String effectType) {
        this.effectType = effectType;
    }

    public Integer getIntensity() {
        return this.intensity;
    }
    
    public void setIntensity(Integer intensity) {
        this.intensity = intensity;
    }

    public String getEffectParams() {
        return this.effectParams;
    }
    
    public void setEffectParams(String effectParams) {
        this.effectParams = effectParams;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }
}
