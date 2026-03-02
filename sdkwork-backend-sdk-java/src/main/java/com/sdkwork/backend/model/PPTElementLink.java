package com.sdkwork.backend.model;

public class PPTElementLink {
    private PPTElementLinkType type;
    private String target;

    public PPTElementLinkType getType() {
        return this.type;
    }
    
    public void setType(PPTElementLinkType type) {
        this.type = type;
    }

    public String getTarget() {
        return this.target;
    }
    
    public void setTarget(String target) {
        this.target = target;
    }
}
