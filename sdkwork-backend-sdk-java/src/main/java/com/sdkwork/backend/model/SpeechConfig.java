package com.sdkwork.backend.model;

public class SpeechConfig {
    private SpeechSpeakerConfig speakerConfig;
    private SpeechTranscriptionConfig transcriptionConfig;
    private VadConfig vadConfig;
    private AecConfig aecConfig;

    public SpeechSpeakerConfig getSpeakerConfig() {
        return this.speakerConfig;
    }
    
    public void setSpeakerConfig(SpeechSpeakerConfig speakerConfig) {
        this.speakerConfig = speakerConfig;
    }

    public SpeechTranscriptionConfig getTranscriptionConfig() {
        return this.transcriptionConfig;
    }
    
    public void setTranscriptionConfig(SpeechTranscriptionConfig transcriptionConfig) {
        this.transcriptionConfig = transcriptionConfig;
    }

    public VadConfig getVadConfig() {
        return this.vadConfig;
    }
    
    public void setVadConfig(VadConfig vadConfig) {
        this.vadConfig = vadConfig;
    }

    public AecConfig getAecConfig() {
        return this.aecConfig;
    }
    
    public void setAecConfig(AecConfig aecConfig) {
        this.aecConfig = aecConfig;
    }
}
