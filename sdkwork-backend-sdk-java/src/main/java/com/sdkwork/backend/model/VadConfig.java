package com.sdkwork.backend.model;

public class VadConfig {
    private Double speechThreshold;
    private Integer minSpeechDurationMs;
    private Integer minSilenceDurationMs;
    private Integer maxSilenceDurationMs;
    private Integer silenceTimeout;
    private Integer speechTimeout;
    private Integer windowSize;
    private Integer stepSize;

    public Double getSpeechThreshold() {
        return this.speechThreshold;
    }
    
    public void setSpeechThreshold(Double speechThreshold) {
        this.speechThreshold = speechThreshold;
    }

    public Integer getMinSpeechDurationMs() {
        return this.minSpeechDurationMs;
    }
    
    public void setMinSpeechDurationMs(Integer minSpeechDurationMs) {
        this.minSpeechDurationMs = minSpeechDurationMs;
    }

    public Integer getMinSilenceDurationMs() {
        return this.minSilenceDurationMs;
    }
    
    public void setMinSilenceDurationMs(Integer minSilenceDurationMs) {
        this.minSilenceDurationMs = minSilenceDurationMs;
    }

    public Integer getMaxSilenceDurationMs() {
        return this.maxSilenceDurationMs;
    }
    
    public void setMaxSilenceDurationMs(Integer maxSilenceDurationMs) {
        this.maxSilenceDurationMs = maxSilenceDurationMs;
    }

    public Integer getSilenceTimeout() {
        return this.silenceTimeout;
    }
    
    public void setSilenceTimeout(Integer silenceTimeout) {
        this.silenceTimeout = silenceTimeout;
    }

    public Integer getSpeechTimeout() {
        return this.speechTimeout;
    }
    
    public void setSpeechTimeout(Integer speechTimeout) {
        this.speechTimeout = speechTimeout;
    }

    public Integer getWindowSize() {
        return this.windowSize;
    }
    
    public void setWindowSize(Integer windowSize) {
        this.windowSize = windowSize;
    }

    public Integer getStepSize() {
        return this.stepSize;
    }
    
    public void setStepSize(Integer stepSize) {
        this.stepSize = stepSize;
    }
}
