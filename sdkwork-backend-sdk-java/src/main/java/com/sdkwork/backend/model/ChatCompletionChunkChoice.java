package com.sdkwork.backend.model;

public class ChatCompletionChunkChoice {
    private Integer index;
    private ChatCompletionChunkDelta delta;
    private LogProbInfo logprobs;
    private String finishReason;

    public Integer getIndex() {
        return this.index;
    }
    
    public void setIndex(Integer index) {
        this.index = index;
    }

    public ChatCompletionChunkDelta getDelta() {
        return this.delta;
    }
    
    public void setDelta(ChatCompletionChunkDelta delta) {
        this.delta = delta;
    }

    public LogProbInfo getLogprobs() {
        return this.logprobs;
    }
    
    public void setLogprobs(LogProbInfo logprobs) {
        this.logprobs = logprobs;
    }

    public String getFinishReason() {
        return this.finishReason;
    }
    
    public void setFinishReason(String finishReason) {
        this.finishReason = finishReason;
    }
}
