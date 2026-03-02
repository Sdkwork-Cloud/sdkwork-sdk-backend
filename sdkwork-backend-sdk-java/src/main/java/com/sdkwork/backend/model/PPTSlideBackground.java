package com.sdkwork.backend.model;

public class PPTSlideBackground {
    private PPTSlideBackgroundType type;
    private String color;
    private PPTSlideBackgroundImage image;
    private PPTGradient pptgradient;

    public PPTSlideBackgroundType getType() {
        return this.type;
    }
    
    public void setType(PPTSlideBackgroundType type) {
        this.type = type;
    }

    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public PPTSlideBackgroundImage getImage() {
        return this.image;
    }
    
    public void setImage(PPTSlideBackgroundImage image) {
        this.image = image;
    }

    public PPTGradient getPptgradient() {
        return this.pptgradient;
    }
    
    public void setPptgradient(PPTGradient pptgradient) {
        this.pptgradient = pptgradient;
    }
}
