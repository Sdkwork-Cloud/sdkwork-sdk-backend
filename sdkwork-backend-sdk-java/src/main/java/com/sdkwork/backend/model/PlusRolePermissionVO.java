package com.sdkwork.backend.model;

public class PlusRolePermissionVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private Integer roleId;
    private String roleUuid;
    private Integer permissionId;
    private String permissionUuid;
    private Boolean enabled;
    private String description;
    private Integer operatorId;
    private String status;

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

    public Integer getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleUuid() {
        return this.roleUuid;
    }
    
    public void setRoleUuid(String roleUuid) {
        this.roleUuid = roleUuid;
    }

    public Integer getPermissionId() {
        return this.permissionId;
    }
    
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionUuid() {
        return this.permissionUuid;
    }
    
    public void setPermissionUuid(String permissionUuid) {
        this.permissionUuid = permissionUuid;
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

    public Integer getOperatorId() {
        return this.operatorId;
    }
    
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
