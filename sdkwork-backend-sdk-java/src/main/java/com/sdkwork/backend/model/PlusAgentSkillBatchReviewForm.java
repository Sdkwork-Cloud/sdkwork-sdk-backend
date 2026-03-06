package com.sdkwork.backend.model;

public class PlusAgentSkillBatchReviewForm {
    private List<Integer> skillIds;
    private String comment;

    public List<Integer> getSkillIds() {
        return this.skillIds;
    }
    
    public void setSkillIds(List<Integer> skillIds) {
        this.skillIds = skillIds;
    }

    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }
}
