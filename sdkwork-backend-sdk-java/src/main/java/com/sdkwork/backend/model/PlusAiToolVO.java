package com.sdkwork.backend.model;

public class PlusAiToolVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String name;
    private String description;
    private String type;
    private String status;
    private Boolean enabled;
    private HttpApiDefinition httpApiDefinition;
    private PlusToolDefinition toolDefinition;

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

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
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

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public HttpApiDefinition getHttpApiDefinition() {
        return this.httpApiDefinition;
    }
    
    public void setHttpApiDefinition(HttpApiDefinition httpApiDefinition) {
        this.httpApiDefinition = httpApiDefinition;
    }

    public PlusToolDefinition getToolDefinition() {
        return this.toolDefinition;
    }
    
    public void setToolDefinition(PlusToolDefinition toolDefinition) {
        this.toolDefinition = toolDefinition;
    }
}
