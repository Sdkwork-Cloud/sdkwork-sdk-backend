package com.sdkwork.backend.model;

public class PlusDiskMemberVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private Integer v;
    private Integer diskId;
    private Integer userId;
    private DiskPermission permission;
    private String remark;
    private Boolean isOwner;

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

    public Integer getV() {
        return this.v;
    }
    
    public void setV(Integer v) {
        this.v = v;
    }

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
