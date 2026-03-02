package com.sdkwork.backend.model;

public class GenerateVideoVO {
    private String createdAt;
    private String updatedAt;
    private String requestId;
    private String taskId;
    private String taskStatus;
    private VideoMediaResourceList videos;
    private String status;

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

    public VideoMediaResourceList getVideos() {
        return this.videos;
    }
    
    public void setVideos(VideoMediaResourceList videos) {
        this.videos = videos;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
