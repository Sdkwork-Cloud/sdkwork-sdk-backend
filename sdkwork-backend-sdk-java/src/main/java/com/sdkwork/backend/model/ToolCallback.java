package com.sdkwork.backend.model;

public class ToolCallback {
    private ToolDefinition toolDefinition;
    private ToolMetadata toolMetadata;

    public ToolDefinition getToolDefinition() {
        return this.toolDefinition;
    }
    
    public void setToolDefinition(ToolDefinition toolDefinition) {
        this.toolDefinition = toolDefinition;
    }

    public ToolMetadata getToolMetadata() {
        return this.toolMetadata;
    }
    
    public void setToolMetadata(ToolMetadata toolMetadata) {
        this.toolMetadata = toolMetadata;
    }
}
