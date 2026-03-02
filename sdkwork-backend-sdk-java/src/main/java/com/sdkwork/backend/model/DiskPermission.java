package com.sdkwork.backend.model;

public class DiskPermission {
    private List<String> permissions;
    private List<String> permissionSet;

    public List<String> getPermissions() {
        return this.permissions;
    }
    
    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public List<String> getPermissionSet() {
        return this.permissionSet;
    }
    
    public void setPermissionSet(List<String> permissionSet) {
        this.permissionSet = permissionSet;
    }
}
