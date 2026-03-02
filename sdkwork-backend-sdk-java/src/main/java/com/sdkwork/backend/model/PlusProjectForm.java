package com.sdkwork.backend.model;

public class PlusProjectForm {
    private String name;
    private String code;
    private String description;
    private String status;
    private Integer leaderId;
    private String startTime;
    private String endTime;
    private Integer budgetAmount;
    private Boolean isDeleted;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
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

    public Integer getLeaderId() {
        return this.leaderId;
    }
    
    public void setLeaderId(Integer leaderId) {
        this.leaderId = leaderId;
    }

    public String getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getBudgetAmount() {
        return this.budgetAmount;
    }
    
    public void setBudgetAmount(Integer budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    public Boolean getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}
