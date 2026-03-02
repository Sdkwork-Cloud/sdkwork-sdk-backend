package com.sdkwork.backend.model;

public class GenerateCharacterVO {
    private String createdAt;
    private String updatedAt;
    private String requestId;
    private String taskId;
    private String taskStatus;
    private List<ImageMediaResource> characterImages;
    private String characterId;
    private String characterName;
    private String characterDescription;
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

    public List<ImageMediaResource> getCharacterImages() {
        return this.characterImages;
    }
    
    public void setCharacterImages(List<ImageMediaResource> characterImages) {
        this.characterImages = characterImages;
    }

    public String getCharacterId() {
        return this.characterId;
    }
    
    public void setCharacterId(String characterId) {
        this.characterId = characterId;
    }

    public String getCharacterName() {
        return this.characterName;
    }
    
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterDescription() {
        return this.characterDescription;
    }
    
    public void setCharacterDescription(String characterDescription) {
        this.characterDescription = characterDescription;
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
