package com.sdkwork.backend.model;

public class PlusPptSlide {
    private String id;
    private List<PPTBaseElement> elements;
    private List<PPTNote> notes;
    private String remark;
    private PPTSlideBackground background;
    private List<PPTAnimation> animations;
    private PPTTurningMode turningMode;
    private PPTSectionTag sectionTag;
    private PPTSlideType type;
    private PlusPptPayload payload;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public List<PPTBaseElement> getElements() {
        return this.elements;
    }
    
    public void setElements(List<PPTBaseElement> elements) {
        this.elements = elements;
    }

    public List<PPTNote> getNotes() {
        return this.notes;
    }
    
    public void setNotes(List<PPTNote> notes) {
        this.notes = notes;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public PPTSlideBackground getBackground() {
        return this.background;
    }
    
    public void setBackground(PPTSlideBackground background) {
        this.background = background;
    }

    public List<PPTAnimation> getAnimations() {
        return this.animations;
    }
    
    public void setAnimations(List<PPTAnimation> animations) {
        this.animations = animations;
    }

    public PPTTurningMode getTurningMode() {
        return this.turningMode;
    }
    
    public void setTurningMode(PPTTurningMode turningMode) {
        this.turningMode = turningMode;
    }

    public PPTSectionTag getSectionTag() {
        return this.sectionTag;
    }
    
    public void setSectionTag(PPTSectionTag sectionTag) {
        this.sectionTag = sectionTag;
    }

    public PPTSlideType getType() {
        return this.type;
    }
    
    public void setType(PPTSlideType type) {
        this.type = type;
    }

    public PlusPptPayload getPayload() {
        return this.payload;
    }
    
    public void setPayload(PlusPptPayload payload) {
        this.payload = payload;
    }
}
