package com.sdkwork.backend.model;

public class CompletionUsage {
    private Integer promptTokens;
    private Integer completionTokens;
    private Integer totalTokens;
    private Integer promptCacheHitTokens;
    private Integer promptCacheMissTokens;
    private PromptTokensDetails promptTokensDetails;
    private CompletionTokensDetails completionTokensDetails;

    public Integer getPromptTokens() {
        return this.promptTokens;
    }
    
    public void setPromptTokens(Integer promptTokens) {
        this.promptTokens = promptTokens;
    }

    public Integer getCompletionTokens() {
        return this.completionTokens;
    }
    
    public void setCompletionTokens(Integer completionTokens) {
        this.completionTokens = completionTokens;
    }

    public Integer getTotalTokens() {
        return this.totalTokens;
    }
    
    public void setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
    }

    public Integer getPromptCacheHitTokens() {
        return this.promptCacheHitTokens;
    }
    
    public void setPromptCacheHitTokens(Integer promptCacheHitTokens) {
        this.promptCacheHitTokens = promptCacheHitTokens;
    }

    public Integer getPromptCacheMissTokens() {
        return this.promptCacheMissTokens;
    }
    
    public void setPromptCacheMissTokens(Integer promptCacheMissTokens) {
        this.promptCacheMissTokens = promptCacheMissTokens;
    }

    public PromptTokensDetails getPromptTokensDetails() {
        return this.promptTokensDetails;
    }
    
    public void setPromptTokensDetails(PromptTokensDetails promptTokensDetails) {
        this.promptTokensDetails = promptTokensDetails;
    }

    public CompletionTokensDetails getCompletionTokensDetails() {
        return this.completionTokensDetails;
    }
    
    public void setCompletionTokensDetails(CompletionTokensDetails completionTokensDetails) {
        this.completionTokensDetails = completionTokensDetails;
    }
}
