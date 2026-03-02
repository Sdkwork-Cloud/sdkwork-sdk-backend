package com.sdkwork.backend.model;

public class FunctionCall {
    private String name;
    private Map<String, Object> arguments;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getArguments() {
        return this.arguments;
    }
    
    public void setArguments(Map<String, Object> arguments) {
        this.arguments = arguments;
    }
}
