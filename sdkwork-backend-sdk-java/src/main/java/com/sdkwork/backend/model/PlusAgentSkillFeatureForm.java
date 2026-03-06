package com.sdkwork.backend.model;

public class PlusAgentSkillFeatureForm {
    private Boolean featured;
    private Integer recommendWeight;

    public Boolean getFeatured() {
        return this.featured;
    }
    
    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public Integer getRecommendWeight() {
        return this.recommendWeight;
    }
    
    public void setRecommendWeight(Integer recommendWeight) {
        this.recommendWeight = recommendWeight;
    }
}
