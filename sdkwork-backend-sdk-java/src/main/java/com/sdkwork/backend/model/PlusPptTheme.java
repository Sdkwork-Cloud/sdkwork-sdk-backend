package com.sdkwork.backend.model;

public class PlusPptTheme {
    private List<String> themeColors;
    private List<String> subColors;
    private List<String> exportThemeColors;
    private String fontColor;
    private String fontName;
    private String backgroundColor;
    private PlusPptThemeShadow shadow;
    private PlusPptThemeOutline outline;

    public List<String> getThemeColors() {
        return this.themeColors;
    }
    
    public void setThemeColors(List<String> themeColors) {
        this.themeColors = themeColors;
    }

    public List<String> getSubColors() {
        return this.subColors;
    }
    
    public void setSubColors(List<String> subColors) {
        this.subColors = subColors;
    }

    public List<String> getExportThemeColors() {
        return this.exportThemeColors;
    }
    
    public void setExportThemeColors(List<String> exportThemeColors) {
        this.exportThemeColors = exportThemeColors;
    }

    public String getFontColor() {
        return this.fontColor;
    }
    
    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public String getFontName() {
        return this.fontName;
    }
    
    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }
    
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public PlusPptThemeShadow getShadow() {
        return this.shadow;
    }
    
    public void setShadow(PlusPptThemeShadow shadow) {
        this.shadow = shadow;
    }

    public PlusPptThemeOutline getOutline() {
        return this.outline;
    }
    
    public void setOutline(PlusPptThemeOutline outline) {
        this.outline = outline;
    }
}
