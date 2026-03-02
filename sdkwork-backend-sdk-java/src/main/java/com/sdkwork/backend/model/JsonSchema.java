package com.sdkwork.backend.model;

public class JsonSchema {
    private String name;
    private Map<String, Object> schema;
    private Boolean strict;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getSchema() {
        return this.schema;
    }
    
    public void setSchema(Map<String, Object> schema) {
        this.schema = schema;
    }

    public Boolean getStrict() {
        return this.strict;
    }
    
    public void setStrict(Boolean strict) {
        this.strict = strict;
    }
}
