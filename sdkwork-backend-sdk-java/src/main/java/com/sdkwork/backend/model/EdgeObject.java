package com.sdkwork.backend.model;

public class EdgeObject {
    private String id;
    private String name;
    private String description;
    private String sourceNodeId;
    private String targetNodeId;
    private String type;
    private Object condition;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
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

    public String getSourceNodeId() {
        return this.sourceNodeId;
    }
    
    public void setSourceNodeId(String sourceNodeId) {
        this.sourceNodeId = sourceNodeId;
    }

    public String getTargetNodeId() {
        return this.targetNodeId;
    }
    
    public void setTargetNodeId(String targetNodeId) {
        this.targetNodeId = targetNodeId;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Object getCondition() {
        return this.condition;
    }
    
    public void setCondition(Object condition) {
        this.condition = condition;
    }
}
