package com.sdkwork.backend.model;

public class PPTGradient {
    private PPTGradientType type;
    private List<PPTGradientColor> colors;
    private Integer rotate;

    public PPTGradientType getType() {
        return this.type;
    }
    
    public void setType(PPTGradientType type) {
        this.type = type;
    }

    public List<PPTGradientColor> getColors() {
        return this.colors;
    }
    
    public void setColors(List<PPTGradientColor> colors) {
        this.colors = colors;
    }

    public Integer getRotate() {
        return this.rotate;
    }
    
    public void setRotate(Integer rotate) {
        this.rotate = rotate;
    }
}
