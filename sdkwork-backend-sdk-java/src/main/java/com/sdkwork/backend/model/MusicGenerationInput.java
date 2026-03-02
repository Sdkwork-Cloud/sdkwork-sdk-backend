package com.sdkwork.backend.model;

public class MusicGenerationInput {
    private String title;
    private String prompt;
    private String negativePrompt;
    private List<AssetMediaResource> referenceAssets;
    private VideoStoryboard storyboard;
    private Map<String, Object> parameters;
    private Integer n;
    private Integer seed;
    private String format;
    private String lyrics;
    private Integer duration;
    private String genre;
    private String style;
    private Integer tempo;
    private String key;
    private String timeSignature;
    private String mood;
    private String instruments;
    private Boolean instrumental;
    private Boolean hd;
    private Integer referenceAssetCount;

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

    public String getNegativePrompt() {
        return this.negativePrompt;
    }
    
    public void setNegativePrompt(String negativePrompt) {
        this.negativePrompt = negativePrompt;
    }

    public List<AssetMediaResource> getReferenceAssets() {
        return this.referenceAssets;
    }
    
    public void setReferenceAssets(List<AssetMediaResource> referenceAssets) {
        this.referenceAssets = referenceAssets;
    }

    public VideoStoryboard getStoryboard() {
        return this.storyboard;
    }
    
    public void setStoryboard(VideoStoryboard storyboard) {
        this.storyboard = storyboard;
    }

    public Map<String, Object> getParameters() {
        return this.parameters;
    }
    
    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public Integer getN() {
        return this.n;
    }
    
    public void setN(Integer n) {
        this.n = n;
    }

    public Integer getSeed() {
        return this.seed;
    }
    
    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }

    public String getLyrics() {
        return this.lyrics;
    }
    
    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public Integer getDuration() {
        return this.duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return this.genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStyle() {
        return this.style;
    }
    
    public void setStyle(String style) {
        this.style = style;
    }

    public Integer getTempo() {
        return this.tempo;
    }
    
    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    public String getKey() {
        return this.key;
    }
    
    public void setKey(String key) {
        this.key = key;
    }

    public String getTimeSignature() {
        return this.timeSignature;
    }
    
    public void setTimeSignature(String timeSignature) {
        this.timeSignature = timeSignature;
    }

    public String getMood() {
        return this.mood;
    }
    
    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getInstruments() {
        return this.instruments;
    }
    
    public void setInstruments(String instruments) {
        this.instruments = instruments;
    }

    public Boolean getInstrumental() {
        return this.instrumental;
    }
    
    public void setInstrumental(Boolean instrumental) {
        this.instrumental = instrumental;
    }

    public Boolean getHd() {
        return this.hd;
    }
    
    public void setHd(Boolean hd) {
        this.hd = hd;
    }

    public Integer getReferenceAssetCount() {
        return this.referenceAssetCount;
    }
    
    public void setReferenceAssetCount(Integer referenceAssetCount) {
        this.referenceAssetCount = referenceAssetCount;
    }
}
