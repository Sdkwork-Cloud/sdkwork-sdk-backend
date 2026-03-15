package com.sdkwork.backend.model;

public class PlusOrderDispatchRuleVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String taskCode;
    private String taskName;
    private Boolean enabled;
    private Boolean allowGrab;
    private Boolean allowAssign;
    private Integer defaultTaskConcurrentLimit;
    private OrderDispatchRuleMetadata metadata;

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

    public String getTaskCode() {
        return this.taskCode;
    }
    
    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    public String getTaskName() {
        return this.taskName;
    }
    
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getAllowGrab() {
        return this.allowGrab;
    }
    
    public void setAllowGrab(Boolean allowGrab) {
        this.allowGrab = allowGrab;
    }

    public Boolean getAllowAssign() {
        return this.allowAssign;
    }
    
    public void setAllowAssign(Boolean allowAssign) {
        this.allowAssign = allowAssign;
    }

    public Integer getDefaultTaskConcurrentLimit() {
        return this.defaultTaskConcurrentLimit;
    }
    
    public void setDefaultTaskConcurrentLimit(Integer defaultTaskConcurrentLimit) {
        this.defaultTaskConcurrentLimit = defaultTaskConcurrentLimit;
    }

    public OrderDispatchRuleMetadata getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(OrderDispatchRuleMetadata metadata) {
        this.metadata = metadata;
    }
}
