package com.sdkwork.backend.model;

public class LogProbInfo {
    private List<String> tokens;
    private List<Double> tokenLogprobs;
    private List<Integer> textOffset;

    public List<String> getTokens() {
        return this.tokens;
    }
    
    public void setTokens(List<String> tokens) {
        this.tokens = tokens;
    }

    public List<Double> getTokenLogprobs() {
        return this.tokenLogprobs;
    }
    
    public void setTokenLogprobs(List<Double> tokenLogprobs) {
        this.tokenLogprobs = tokenLogprobs;
    }

    public List<Integer> getTextOffset() {
        return this.textOffset;
    }
    
    public void setTextOffset(List<Integer> textOffset) {
        this.textOffset = textOffset;
    }
}
