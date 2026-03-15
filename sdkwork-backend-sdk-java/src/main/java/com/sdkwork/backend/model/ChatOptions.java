package com.sdkwork.backend.model;

public class ChatOptions {
    private String model;
    private Double temperature;
    private Double topP;
    private Integer topK;
    private Double frequencyPenalty;
    private Double presencePenalty;
    private Integer maxTokens;
    private List<String> stopSequences;

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public Double getTemperature() {
        return this.temperature;
    }
    
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getTopP() {
        return this.topP;
    }
    
    public void setTopP(Double topP) {
        this.topP = topP;
    }

    public Integer getTopK() {
        return this.topK;
    }
    
    public void setTopK(Integer topK) {
        this.topK = topK;
    }

    public Double getFrequencyPenalty() {
        return this.frequencyPenalty;
    }
    
    public void setFrequencyPenalty(Double frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
    }

    public Double getPresencePenalty() {
        return this.presencePenalty;
    }
    
    public void setPresencePenalty(Double presencePenalty) {
        this.presencePenalty = presencePenalty;
    }

    public Integer getMaxTokens() {
        return this.maxTokens;
    }
    
    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    public List<String> getStopSequences() {
        return this.stopSequences;
    }
    
    public void setStopSequences(List<String> stopSequences) {
        this.stopSequences = stopSequences;
    }
}
