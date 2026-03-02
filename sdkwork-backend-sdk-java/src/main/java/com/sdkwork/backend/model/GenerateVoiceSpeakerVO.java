package com.sdkwork.backend.model;

public class GenerateVoiceSpeakerVO {
    private String createdAt;
    private String updatedAt;
    private String requestId;
    private String taskId;
    private String taskStatus;
    private AudioMediaResourceList voiceResources;
    private String voiceSpeakerId;
    private String voiceSpeakerName;
    private String voiceType;
    private String voiceStyle;
    private String model;
    private Integer duration;
    private String errorMessage;

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getRequestId() {
        return this.requestId;
    }
    
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getTaskId() {
        return this.taskId;
    }
    
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskStatus() {
        return this.taskStatus;
    }
    
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public AudioMediaResourceList getVoiceResources() {
        return this.voiceResources;
    }
    
    public void setVoiceResources(AudioMediaResourceList voiceResources) {
        this.voiceResources = voiceResources;
    }

    public String getVoiceSpeakerId() {
        return this.voiceSpeakerId;
    }
    
    public void setVoiceSpeakerId(String voiceSpeakerId) {
        this.voiceSpeakerId = voiceSpeakerId;
    }

    public String getVoiceSpeakerName() {
        return this.voiceSpeakerName;
    }
    
    public void setVoiceSpeakerName(String voiceSpeakerName) {
        this.voiceSpeakerName = voiceSpeakerName;
    }

    public String getVoiceType() {
        return this.voiceType;
    }
    
    public void setVoiceType(String voiceType) {
        this.voiceType = voiceType;
    }

    public String getVoiceStyle() {
        return this.voiceStyle;
    }
    
    public void setVoiceStyle(String voiceStyle) {
        this.voiceStyle = voiceStyle;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public Integer getDuration() {
        return this.duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
    
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
