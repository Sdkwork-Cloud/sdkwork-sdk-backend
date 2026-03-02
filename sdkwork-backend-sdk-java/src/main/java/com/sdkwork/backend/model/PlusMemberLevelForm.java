package com.sdkwork.backend.model;

public class PlusMemberLevelForm {
    private Integer cardId;
    private String levelName;
    private Integer requiredPoints;
    private String description;
    private String status;

    public Integer getCardId() {
        return this.cardId;
    }
    
    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getLevelName() {
        return this.levelName;
    }
    
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public Integer getRequiredPoints() {
        return this.requiredPoints;
    }
    
    public void setRequiredPoints(Integer requiredPoints) {
        this.requiredPoints = requiredPoints;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
