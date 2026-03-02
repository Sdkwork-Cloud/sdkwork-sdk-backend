package com.sdkwork.backend.model;

public class FilePermission {
    private List<String> permissions;
    private Boolean readOnly;
    private List<String> permissionSet;

    public List<String> getPermissions() {
        return this.permissions;
    }
    
    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public Boolean getReadOnly() {
        return this.readOnly;
    }
    
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public List<String> getPermissionSet() {
        return this.permissionSet;
    }
    
    public void setPermissionSet(List<String> permissionSet) {
        this.permissionSet = permissionSet;
    }
}
