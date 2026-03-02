package com.sdkwork.backend.model;

public class PlusDiskMemberForm {
    private Integer diskId;
    private Integer userId;
    private DiskPermission permission;
    private String remark;
    private Boolean isOwner;

    public Integer getDiskId() {
        return this.diskId;
    }
    
    public void setDiskId(Integer diskId) {
        this.diskId = diskId;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public DiskPermission getPermission() {
        return this.permission;
    }
    
    public void setPermission(DiskPermission permission) {
        this.permission = permission;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getIsOwner() {
        return this.isOwner;
    }
    
    public void setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
    }
}
