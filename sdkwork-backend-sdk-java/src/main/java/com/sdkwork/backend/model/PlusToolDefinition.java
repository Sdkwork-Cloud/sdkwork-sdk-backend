package com.sdkwork.backend.model;

public class PlusToolDefinition {
    private Integer id;
    private String uuid;
    private String type;
    private String name;
    private String description;
    private String inputSchema;
    private Boolean buildIn;
    private HttpApiDefinition httpDefinition;

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

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
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

    public String getInputSchema() {
        return this.inputSchema;
    }
    
    public void setInputSchema(String inputSchema) {
        this.inputSchema = inputSchema;
    }

    public Boolean getBuildIn() {
        return this.buildIn;
    }
    
    public void setBuildIn(Boolean buildIn) {
        this.buildIn = buildIn;
    }

    public HttpApiDefinition getHttpDefinition() {
        return this.httpDefinition;
    }
    
    public void setHttpDefinition(HttpApiDefinition httpDefinition) {
        this.httpDefinition = httpDefinition;
    }
}
