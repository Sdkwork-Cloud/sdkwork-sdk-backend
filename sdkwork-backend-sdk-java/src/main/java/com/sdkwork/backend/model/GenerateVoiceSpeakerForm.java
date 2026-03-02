package com.sdkwork.backend.model;

public class GenerateVoiceSpeakerForm {
    private String voiceSpeakerName;
    private String voiceType;
    private String text;
    private Double speed;
    private Double pitch;
    private Integer volume;
    private String model;
    private String responseFormat;
    private String prompt;

    public String getVoiceSpeakerName() {
        return this.voiceSpeakerName;
    }
    
    public void setVoiceSpeakerName(String voiceSpeakerName) {
        this.voiceSpeakerName = voiceSpeakerName;
    }

    public String getVoiceType() {
        return this.voiceType;
    }
    
    public void setVoiceType(String voiceType) {
        this.voiceType = voiceType;
    }

    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
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

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public String getResponseFormat() {
        return this.responseFormat;
    }
    
    public void setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
    }

    public String getPrompt() {
        return this.prompt;
    }
    
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
}
