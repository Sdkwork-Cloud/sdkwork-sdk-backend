package com.sdkwork.backend.model;

public class PlusAiAgentToolForm {
    private Integer agentId;
    private Integer toolId;
    private Integer sortOrder;
    private Boolean enabled;

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
}
