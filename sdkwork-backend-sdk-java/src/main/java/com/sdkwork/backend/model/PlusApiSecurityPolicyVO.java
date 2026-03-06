package com.sdkwork.backend.model;

public class PlusApiSecurityPolicyVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private String policyCode;
    private String apiType;
    private String pathPattern;
    private String httpMethod;
    private String matchMode;
    private String authMode;
    private Boolean allowAnonymous;
    private String requiredRoles;
    private String requiredPermissions;
    private Integer priority;
    private Boolean enabled;
    private String description;

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

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

    public String getPolicyCode() {
        return this.policyCode;
    }
    
    public void setPolicyCode(String policyCode) {
        this.policyCode = policyCode;
    }

    public String getApiType() {
        return this.apiType;
    }
    
    public void setApiType(String apiType) {
        this.apiType = apiType;
    }

    public String getPathPattern() {
        return this.pathPattern;
    }
    
    public void setPathPattern(String pathPattern) {
        this.pathPattern = pathPattern;
    }

    public String getHttpMethod() {
        return this.httpMethod;
    }
    
    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getMatchMode() {
        return this.matchMode;
    }
    
    public void setMatchMode(String matchMode) {
        this.matchMode = matchMode;
    }

    public String getAuthMode() {
        return this.authMode;
    }
    
    public void setAuthMode(String authMode) {
        this.authMode = authMode;
    }

    public Boolean getAllowAnonymous() {
        return this.allowAnonymous;
    }
    
    public void setAllowAnonymous(Boolean allowAnonymous) {
        this.allowAnonymous = allowAnonymous;
    }

    public String getRequiredRoles() {
        return this.requiredRoles;
    }
    
    public void setRequiredRoles(String requiredRoles) {
        this.requiredRoles = requiredRoles;
    }

    public String getRequiredPermissions() {
        return this.requiredPermissions;
    }
    
    public void setRequiredPermissions(String requiredPermissions) {
        this.requiredPermissions = requiredPermissions;
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

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
