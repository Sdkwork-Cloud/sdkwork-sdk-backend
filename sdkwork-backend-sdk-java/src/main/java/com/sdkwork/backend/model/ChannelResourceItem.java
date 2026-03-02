package com.sdkwork.backend.model;

public class ChannelResourceItem {
    private String type;
    private List<String> functions;

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public List<String> getFunctions() {
        return this.functions;
    }
    
    public void setFunctions(List<String> functions) {
        this.functions = functions;
    }
}
