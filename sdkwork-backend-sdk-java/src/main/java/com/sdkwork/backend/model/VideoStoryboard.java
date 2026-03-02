package com.sdkwork.backend.model;

public class VideoStoryboard {
    private List<VideoShotItem> shots;
    private VideoMediaResource finalVideo;
    private AudioMediaResource finalAudio;
    private String title;
    private String description;
    private String style;
    private String aspectRatio;
    private String prompt;
    private Double duration;
    private VoiceSpeakerInfo speaker;

    public List<VideoShotItem> getShots() {
        return this.shots;
    }
    
    public void setShots(List<VideoShotItem> shots) {
        this.shots = shots;
    }

    public VideoMediaResource getFinalVideo() {
        return this.finalVideo;
    }
    
    public void setFinalVideo(VideoMediaResource finalVideo) {
        this.finalVideo = finalVideo;
    }

    public AudioMediaResource getFinalAudio() {
        return this.finalAudio;
    }
    
    public void setFinalAudio(AudioMediaResource finalAudio) {
        this.finalAudio = finalAudio;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
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

    public String getPrompt() {
        return this.prompt;
    }
    
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public Double getDuration() {
        return this.duration;
    }
    
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public VoiceSpeakerInfo getSpeaker() {
        return this.speaker;
    }
    
    public void setSpeaker(VoiceSpeakerInfo speaker) {
        this.speaker = speaker;
    }
}
