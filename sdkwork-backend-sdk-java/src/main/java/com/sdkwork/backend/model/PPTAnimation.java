package com.sdkwork.backend.model;

public class PPTAnimation {
    private String id;
    private String elId;
    private String effect;
    private PPTAnimationType type;
    private Integer duration;
    private PPTAnimationTrigger trigger;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getElId() {
        return this.elId;
    }
    
    public void setElId(String elId) {
        this.elId = elId;
    }

    public String getEffect() {
        return this.effect;
    }
    
    public void setEffect(String effect) {
        this.effect = effect;
    }

    public PPTAnimationType getType() {
        return this.type;
    }
    
    public void setType(PPTAnimationType type) {
        this.type = type;
    }

    public Integer getDuration() {
        return this.duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public PPTAnimationTrigger getTrigger() {
        return this.trigger;
    }
    
    public void setTrigger(PPTAnimationTrigger trigger) {
        this.trigger = trigger;
    }
}
