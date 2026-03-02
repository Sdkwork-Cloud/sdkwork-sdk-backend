package com.sdkwork.backend.model;

public class PlusRolePermissionForm {
    private Integer roleId;
    private String roleUuid;
    private Integer permissionId;
    private String permissionUuid;
    private Boolean enabled;
    private String description;
    private Integer operatorId;

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
}
