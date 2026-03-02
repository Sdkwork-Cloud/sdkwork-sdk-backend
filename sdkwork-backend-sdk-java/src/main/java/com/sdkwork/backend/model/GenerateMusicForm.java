package com.sdkwork.backend.model;

public class GenerateMusicForm {
    private String prompt;
    private String lyrics;
    private Integer n;
    private String model;
    private Integer tempo;
    private String style;
    private String instrument;

    public String getPrompt() {
        return this.prompt;
    }
    
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getLyrics() {
        return this.lyrics;
    }
    
    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public Integer getN() {
        return this.n;
    }
    
    public void setN(Integer n) {
        this.n = n;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public Integer getTempo() {
        return this.tempo;
    }
    
    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    public String getStyle() {
        return this.style;
    }
    
    public void setStyle(String style) {
        this.style = style;
    }

    public String getInstrument() {
        return this.instrument;
    }
    
    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
}
