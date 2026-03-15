package com.sdkwork.backend.model;

public class OrderDispatchRuleMetadata {
    private Map<String, Integer> ratingConcurrentLimits;
    private List<String> allowedRatingLevels;

    public Map<String, Integer> getRatingConcurrentLimits() {
        return this.ratingConcurrentLimits;
    }
    
    public void setRatingConcurrentLimits(Map<String, Integer> ratingConcurrentLimits) {
        this.ratingConcurrentLimits = ratingConcurrentLimits;
    }

    public List<String> getAllowedRatingLevels() {
        return this.allowedRatingLevels;
    }
    
    public void setAllowedRatingLevels(List<String> allowedRatingLevels) {
        this.allowedRatingLevels = allowedRatingLevels;
    }
}
