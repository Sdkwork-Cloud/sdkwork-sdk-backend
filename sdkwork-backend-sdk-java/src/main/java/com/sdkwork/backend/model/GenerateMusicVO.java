package com.sdkwork.backend.model;

public class GenerateMusicVO {
    private String createdAt;
    private String updatedAt;
    private String requestId;
    private String taskId;
    private String taskStatus;
    private AudioMediaResourceList audios;
    private String lyrics;

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

    public AudioMediaResourceList getAudios() {
        return this.audios;
    }
    
    public void setAudios(AudioMediaResourceList audios) {
        this.audios = audios;
    }

    public String getLyrics() {
        return this.lyrics;
    }
    
    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
}
