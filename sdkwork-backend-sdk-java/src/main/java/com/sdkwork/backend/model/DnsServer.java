package com.sdkwork.backend.model;

public class DnsServer {
    private String address;
    private Integer port;
    private String type;
    private Integer priority;
    private Boolean enabled;

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPort() {
        return this.port;
    }
    
    public void setPort(Integer port) {
        this.port = port;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Integer getPriority() {
        return this.priority;
    }
    
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
