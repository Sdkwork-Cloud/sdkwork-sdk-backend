package com.sdkwork.backend.model;

public class AecConfig {
    private Integer echoMode;
    private Integer delayEstimation;
    private Integer noiseSuppression;
    private Integer echoTailMs;
    private Integer sampleRate;

    public Integer getEchoMode() {
        return this.echoMode;
    }
    
    public void setEchoMode(Integer echoMode) {
        this.echoMode = echoMode;
    }

    public Integer getDelayEstimation() {
        return this.delayEstimation;
    }
    
    public void setDelayEstimation(Integer delayEstimation) {
        this.delayEstimation = delayEstimation;
    }

    public Integer getNoiseSuppression() {
        return this.noiseSuppression;
    }
    
    public void setNoiseSuppression(Integer noiseSuppression) {
        this.noiseSuppression = noiseSuppression;
    }

    public Integer getEchoTailMs() {
        return this.echoTailMs;
    }
    
    public void setEchoTailMs(Integer echoTailMs) {
        this.echoTailMs = echoTailMs;
    }

    public Integer getSampleRate() {
        return this.sampleRate;
    }
    
    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }
}
