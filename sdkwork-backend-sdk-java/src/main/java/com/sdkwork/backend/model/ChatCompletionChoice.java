package com.sdkwork.backend.model;

public class ChatCompletionChoice {
    private Integer index;
    private ChatCompletionMessage message;
    private LogProbInfo logprobs;
    private String finishReason;

    public Integer getIndex() {
        return this.index;
    }
    
    public void setIndex(Integer index) {
        this.index = index;
    }

    public ChatCompletionMessage getMessage() {
        return this.message;
    }
    
    public void setMessage(ChatCompletionMessage message) {
        this.message = message;
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
