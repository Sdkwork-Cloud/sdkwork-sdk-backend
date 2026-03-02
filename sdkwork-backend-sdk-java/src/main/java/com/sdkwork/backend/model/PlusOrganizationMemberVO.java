package com.sdkwork.backend.model;

public class PlusOrganizationMemberVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private Integer userId;
    private String owner;
    private Integer ownerId;
    private Boolean isActive;
    private String joinedAt;
    private String leftAt;
    private String remark;
    private List<Integer> departmentIds;
    private List<Integer> positionIds;
    private List<Integer> roleIds;
    private Integer primaryDepartmentId;
    private Integer primaryPositionId;
    private Boolean valid;

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

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOwner() {
        return this.owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getOwnerId() {
        return this.ownerId;
    }
    
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getJoinedAt() {
        return this.joinedAt;
    }
    
    public void setJoinedAt(String joinedAt) {
        this.joinedAt = joinedAt;
    }

    public String getLeftAt() {
        return this.leftAt;
    }
    
    public void setLeftAt(String leftAt) {
        this.leftAt = leftAt;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<Integer> getDepartmentIds() {
        return this.departmentIds;
    }
    
    public void setDepartmentIds(List<Integer> departmentIds) {
        this.departmentIds = departmentIds;
    }

    public List<Integer> getPositionIds() {
        return this.positionIds;
    }
    
    public void setPositionIds(List<Integer> positionIds) {
        this.positionIds = positionIds;
    }

    public List<Integer> getRoleIds() {
        return this.roleIds;
    }
    
    public void setRoleIds(List<Integer> roleIds) {
        this.roleIds = roleIds;
    }

    public Integer getPrimaryDepartmentId() {
        return this.primaryDepartmentId;
    }
    
    public void setPrimaryDepartmentId(Integer primaryDepartmentId) {
        this.primaryDepartmentId = primaryDepartmentId;
    }

    public Integer getPrimaryPositionId() {
        return this.primaryPositionId;
    }
    
    public void setPrimaryPositionId(Integer primaryPositionId) {
        this.primaryPositionId = primaryPositionId;
    }

    public Boolean getValid() {
        return this.valid;
    }
    
    public void setValid(Boolean valid) {
        this.valid = valid;
    }
}
