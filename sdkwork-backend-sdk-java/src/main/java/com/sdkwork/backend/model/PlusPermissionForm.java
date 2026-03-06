package com.sdkwork.backend.model;

public class PlusPermissionForm {
    private String name;
    private String code;
    private String description;
    private String status;
    private Integer sortOrder;
    private String resourceUrl;
    private String httpMethod;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSortOrder() {
        return this.sortOrder;
    }
    
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getResourceUrl() {
        return this.resourceUrl;
    }
    
    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getHttpMethod() {
        return this.httpMethod;
    }
    
    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }
}
