package com.sdkwork.backend.model;

public class PlusTenantAuditLogVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private Integer tenantId;
    private String action;
    private String module;
    private String operator;
    private String description;
    private String result;
    private String createTime;
    private String ip;

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

    public Integer getTenantId() {
        return this.tenantId;
    }
    
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public String getAction() {
        return this.action;
    }
    
    public void setAction(String action) {
        this.action = action;
    }

    public String getModule() {
        return this.module;
    }
    
    public void setModule(String module) {
        this.module = module;
    }

    public String getOperator() {
        return this.operator;
    }
    
    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getResult() {
        return this.result;
    }
    
    public void setResult(String result) {
        this.result = result;
    }

    public String getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getIp() {
        return this.ip;
    }
    
    public void setIp(String ip) {
        this.ip = ip;
    }
}
