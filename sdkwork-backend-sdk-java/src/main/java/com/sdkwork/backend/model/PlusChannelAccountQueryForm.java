package com.sdkwork.backend.model;

public class PlusChannelAccountQueryForm {
    private Integer id;
    private String createdAtFrom;
    private String createdAtTo;
    private String channel;
    private String status;
    private String resourceType;
    private List<String> resourceTypes;

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreatedAtFrom() {
        return this.createdAtFrom;
    }
    
    public void setCreatedAtFrom(String createdAtFrom) {
        this.createdAtFrom = createdAtFrom;
    }

    public String getCreatedAtTo() {
        return this.createdAtTo;
    }
    
    public void setCreatedAtTo(String createdAtTo) {
        this.createdAtTo = createdAtTo;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getResourceType() {
        return this.resourceType;
    }
    
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public List<String> getResourceTypes() {
        return this.resourceTypes;
    }
    
    public void setResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }
}
