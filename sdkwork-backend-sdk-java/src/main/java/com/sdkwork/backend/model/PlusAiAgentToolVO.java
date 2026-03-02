package com.sdkwork.backend.model;

public class PlusAiAgentToolVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private Integer agentId;
    private Integer toolId;
    private Integer sortOrder;
    private Boolean enabled;
    private String agentName;
    private String toolName;

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

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getAgentId() {
        return this.agentId;
    }
    
    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getToolId() {
        return this.toolId;
    }
    
    public void setToolId(Integer toolId) {
        this.toolId = toolId;
    }

    public Integer getSortOrder() {
        return this.sortOrder;
    }
    
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getAgentName() {
        return this.agentName;
    }
    
    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getToolName() {
        return this.toolName;
    }
    
    public void setToolName(String toolName) {
        this.toolName = toolName;
    }
}
