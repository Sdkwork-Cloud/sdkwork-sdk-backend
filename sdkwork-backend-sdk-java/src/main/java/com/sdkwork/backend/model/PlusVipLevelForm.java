package com.sdkwork.backend.model;

public class PlusVipLevelForm {
    private String name;
    private Integer levelValue;
    private Integer requiredPoints;
    private String description;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevelValue() {
        return this.levelValue;
    }
    
    public void setLevelValue(Integer levelValue) {
        this.levelValue = levelValue;
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
}
