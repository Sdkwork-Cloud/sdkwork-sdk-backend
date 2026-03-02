package com.sdkwork.backend.model;

public class GenerateAudioForm {
    private String title;
    private String prompt;
    private String voice;
    private String model;
    private String format;
    private Double speed;

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrompt() {
        return this.prompt;
    }
    
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getVoice() {
        return this.voice;
    }
    
    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }

    public Double getSpeed() {
        return this.speed;
    }
    
    public void setSpeed(Double speed) {
        this.speed = speed;
    }
}
