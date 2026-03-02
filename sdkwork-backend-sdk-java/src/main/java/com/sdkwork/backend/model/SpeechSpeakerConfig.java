package com.sdkwork.backend.model;

public class SpeechSpeakerConfig {
    private VoiceSpeakerInfo speaker;
    private Integer speakerId;
    private Double volume;
    private Double pitch;
    private String language;
    private Double speed;
    private String format;

    public VoiceSpeakerInfo getSpeaker() {
        return this.speaker;
    }
    
    public void setSpeaker(VoiceSpeakerInfo speaker) {
        this.speaker = speaker;
    }

    public Integer getSpeakerId() {
        return this.speakerId;
    }
    
    public void setSpeakerId(Integer speakerId) {
        this.speakerId = speakerId;
    }

    public Double getVolume() {
        return this.volume;
    }
    
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getPitch() {
        return this.pitch;
    }
    
    public void setPitch(Double pitch) {
        this.pitch = pitch;
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

    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }
}
