package com.sdkwork.backend.model;

public class ModelMetadata {
    private List<Integer> durations;
    private List<String> resolutions;
    private List<AspectRatio> ratios;
    private Boolean isMultimodal;
    private Boolean isReasoning;
    private Boolean isToolCall;

    public List<Integer> getDurations() {
        return this.durations;
    }
    
    public void setDurations(List<Integer> durations) {
        this.durations = durations;
    }

    public List<String> getResolutions() {
        return this.resolutions;
    }
    
    public void setResolutions(List<String> resolutions) {
        this.resolutions = resolutions;
    }

    public List<AspectRatio> getRatios() {
        return this.ratios;
    }
    
    public void setRatios(List<AspectRatio> ratios) {
        this.ratios = ratios;
    }

    public Boolean getIsMultimodal() {
        return this.isMultimodal;
    }
    
    public void setIsMultimodal(Boolean isMultimodal) {
        this.isMultimodal = isMultimodal;
    }

    public Boolean getIsReasoning() {
        return this.isReasoning;
    }
    
    public void setIsReasoning(Boolean isReasoning) {
        this.isReasoning = isReasoning;
    }

    public Boolean getIsToolCall() {
        return this.isToolCall;
    }
    
    public void setIsToolCall(Boolean isToolCall) {
        this.isToolCall = isToolCall;
    }
}
