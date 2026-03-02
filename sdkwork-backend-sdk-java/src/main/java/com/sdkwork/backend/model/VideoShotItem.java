package com.sdkwork.backend.model;

public class VideoShotItem {
    private String id;
    private String uuid;
    private String shotPrompt;
    private String dialogue;
    private Double duration;
    private ImageMediaResource startFrame;
    private ImageMediaResource endFrame;
    private ImageMediaResource image;
    private AssetMediaResourceList resourceList;
    private String emotion;
    private String videoDescription;
    private VideoMediaResource video;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getShotPrompt() {
        return this.shotPrompt;
    }
    
    public void setShotPrompt(String shotPrompt) {
        this.shotPrompt = shotPrompt;
    }

    public String getDialogue() {
        return this.dialogue;
    }
    
    public void setDialogue(String dialogue) {
        this.dialogue = dialogue;
    }

    public Double getDuration() {
        return this.duration;
    }
    
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public ImageMediaResource getStartFrame() {
        return this.startFrame;
    }
    
    public void setStartFrame(ImageMediaResource startFrame) {
        this.startFrame = startFrame;
    }

    public ImageMediaResource getEndFrame() {
        return this.endFrame;
    }
    
    public void setEndFrame(ImageMediaResource endFrame) {
        this.endFrame = endFrame;
    }

    public ImageMediaResource getImage() {
        return this.image;
    }
    
    public void setImage(ImageMediaResource image) {
        this.image = image;
    }

    public AssetMediaResourceList getResourceList() {
        return this.resourceList;
    }
    
    public void setResourceList(AssetMediaResourceList resourceList) {
        this.resourceList = resourceList;
    }

    public String getEmotion() {
        return this.emotion;
    }
    
    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

    public String getVideoDescription() {
        return this.videoDescription;
    }
    
    public void setVideoDescription(String videoDescription) {
        this.videoDescription = videoDescription;
    }

    public VideoMediaResource getVideo() {
        return this.video;
    }
    
    public void setVideo(VideoMediaResource video) {
        this.video = video;
    }
}
