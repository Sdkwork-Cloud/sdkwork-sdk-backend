package com.sdkwork.backend.model;

public class PlusWorkspaceForm {
    private String name;
    private String code;
    private String title;
    private String description;
    private String icon;
    private String color;
    private String type;
    private String status;
    private Integer ownerId;
    private Integer leaderId;
    private String startTime;
    private String endTime;
    private Integer maxMembers;
    private Integer currentMembers;
    private Integer maxStorage;
    private Integer usedStorage;
    private Map<String, Object> settings;
    private Boolean isDeleted;
    private Boolean isPublic;
    private Boolean isTemplate;

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

    public String getIcon() {
        return this.icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getOwnerId() {
        return this.ownerId;
    }
    
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
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

    public Integer getMaxMembers() {
        return this.maxMembers;
    }
    
    public void setMaxMembers(Integer maxMembers) {
        this.maxMembers = maxMembers;
    }

    public Integer getCurrentMembers() {
        return this.currentMembers;
    }
    
    public void setCurrentMembers(Integer currentMembers) {
        this.currentMembers = currentMembers;
    }

    public Integer getMaxStorage() {
        return this.maxStorage;
    }
    
    public void setMaxStorage(Integer maxStorage) {
        this.maxStorage = maxStorage;
    }

    public Integer getUsedStorage() {
        return this.usedStorage;
    }
    
    public void setUsedStorage(Integer usedStorage) {
        this.usedStorage = usedStorage;
    }

    public Map<String, Object> getSettings() {
        return this.settings;
    }
    
    public void setSettings(Map<String, Object> settings) {
        this.settings = settings;
    }

    public Boolean getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Boolean getIsPublic() {
        return this.isPublic;
    }
    
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public Boolean getIsTemplate() {
        return this.isTemplate;
    }
    
    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }
}
