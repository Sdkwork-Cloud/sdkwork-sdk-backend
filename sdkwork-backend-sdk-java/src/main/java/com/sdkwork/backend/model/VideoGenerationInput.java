package com.sdkwork.backend.model;

public class VideoGenerationInput {
    private String title;
    private String prompt;
    private String negativePrompt;
    private List<AssetMediaResource> referenceAssets;
    private VideoStoryboard storyboard;
    private Map<String, Object> parameters;
    private Integer n;
    private Integer seed;
    private String format;
    private Integer width;
    private Integer height;
    private Integer duration;
    private Integer fps;
    private String style;
    private String aspectRatio;
    private Integer motionStrength;
    private String cameraMotion;
    private Boolean loop;
    private Boolean hd;
    private Boolean subtitle;
    private Boolean textToVideo;
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

    public Integer getWidth() {
        return this.width;
    }
    
    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return this.height;
    }
    
    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getDuration() {
        return this.duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getFps() {
        return this.fps;
    }
    
    public void setFps(Integer fps) {
        this.fps = fps;
    }

    public String getStyle() {
        return this.style;
    }
    
    public void setStyle(String style) {
        this.style = style;
    }

    public String getAspectRatio() {
        return this.aspectRatio;
    }
    
    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public Integer getMotionStrength() {
        return this.motionStrength;
    }
    
    public void setMotionStrength(Integer motionStrength) {
        this.motionStrength = motionStrength;
    }

    public String getCameraMotion() {
        return this.cameraMotion;
    }
    
    public void setCameraMotion(String cameraMotion) {
        this.cameraMotion = cameraMotion;
    }

    public Boolean getLoop() {
        return this.loop;
    }
    
    public void setLoop(Boolean loop) {
        this.loop = loop;
    }

    public Boolean getHd() {
        return this.hd;
    }
    
    public void setHd(Boolean hd) {
        this.hd = hd;
    }

    public Boolean getSubtitle() {
        return this.subtitle;
    }
    
    public void setSubtitle(Boolean subtitle) {
        this.subtitle = subtitle;
    }

    public Boolean getTextToVideo() {
        return this.textToVideo;
    }
    
    public void setTextToVideo(Boolean textToVideo) {
        this.textToVideo = textToVideo;
    }

    public Integer getReferenceAssetCount() {
        return this.referenceAssetCount;
    }
    
    public void setReferenceAssetCount(Integer referenceAssetCount) {
        this.referenceAssetCount = referenceAssetCount;
    }
}
