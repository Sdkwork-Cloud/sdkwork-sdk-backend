package com.sdkwork.backend.model;

public class Function {
    private String description;
    private String name;
    private Map<String, Object> parameters;
    private Boolean strict;

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getParameters() {
        return this.parameters;
    }
    
    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public Boolean getStrict() {
        return this.strict;
    }
    
    public void setStrict(Boolean strict) {
        this.strict = strict;
    }
}
